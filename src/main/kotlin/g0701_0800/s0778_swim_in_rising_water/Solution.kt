package g0701_0800.s0778_swim_in_rising_water

// #Hard #Array #Depth_First_Search #Breadth_First_Search #Binary_Search #Matrix
// #Heap_Priority_Queue #Union_Find #2023_03_11_Time_190_ms_(100.00%)_Space_37_MB_(89.47%)

import java.util.LinkedList
import java.util.Queue

class Solution {
    private val dir = intArrayOf(-1, 0, 1, 0, -1)
    fun swimInWater(grid: Array<IntArray>): Int {
        var max = 0
        // find the maximum value in the matrix
        for (ints in grid) {
            for (j in grid[0].indices) {
                max = max.coerceAtLeast(ints[j])
            }
        }
        var l = 0
        var r = max
        var res = 0
        // perform binary search
        while (l <= r) {
            // find test water level
            val mid = (l + r) / 2
            // if you can reach destination with current water level, store it as an answer and try
            // lowering water level
            if (bfs(grid, mid)) {
                res = mid
                r = mid - 1
            } else {
                // otherwise increase water level and try again
                l = mid + 1
            }
        }
        return res
    }

    private fun bfs(grid: Array<IntArray>, limit: Int): Boolean {
        // use queue to process cells starting from top left corner
        val que: Queue<IntArray> = LinkedList()
        // boolean array to keep track of visited cells
        val visited = Array(grid.size) {
            BooleanArray(
                grid[0].size
            )
        }
        // we start from top left corner
        que.add(intArrayOf(0, 0))
        visited[0][0] = true
        while (!que.isEmpty()) {
            // get current cell
            val cur = que.poll()
            val x = cur[0]
            val y = cur[1]
            // if value of current cell is greater than limit return false
            if (grid[x][y] > limit) {
                return false
            }
            // if we reached the destination return true
            if (x == grid.size - 1 && y == grid[0].size - 1) {
                return true
            }
            // check cells in all 4 directions
            for (i in 0 until dir.size - 1) {
                val dx = x + dir[i]
                val dy = y + dir[i + 1]
                // if neighboring cell is in bounds, and hasn't been visited yet,
                // and its value is less than current water level, add it to visited array and to
                // the queue
                if (dx >= 0 && dy >= 0 && dx < grid.size && dy < grid[0].size &&
                    !visited[dx][dy] && grid[dx][dy] <= limit
                ) {
                    visited[dx][dy] = true
                    que.add(intArrayOf(dx, dy))
                }
            }
        }
        return false
    }
}
