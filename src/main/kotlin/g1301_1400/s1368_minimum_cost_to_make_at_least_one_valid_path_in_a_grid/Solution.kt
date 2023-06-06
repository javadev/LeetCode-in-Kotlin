package g1301_1400.s1368_minimum_cost_to_make_at_least_one_valid_path_in_a_grid

// #Hard #Array #Breadth_First_Search #Matrix #Heap_Priority_Queue #Graph #Shortest_Path
// #2023_06_06_Time_220_ms_(100.00%)_Space_37.6_MB_(100.00%)

import java.util.LinkedList
import java.util.Objects
import java.util.Queue

@Suppress("NAME_SHADOWING")
class Solution {
    private val dir = arrayOf(
        intArrayOf(0, 0), intArrayOf(0, 1),
        intArrayOf(0, -1), intArrayOf(1, 0), intArrayOf(-1, 0)
    )

    fun minCost(grid: Array<IntArray>): Int {
        val visited = Array(grid.size) { IntArray(grid[0].size) }
        val queue: Queue<Pair> = LinkedList()
        addAllTheNodeInRange(0, 0, grid, queue, visited)
        if (visited[grid.size - 1][grid[0].size - 1] == 1) {
            return 0
        }
        var cost = 0
        while (!queue.isEmpty()) {
            cost++
            val size = queue.size
            for (i in 0 until size) {
                val pa = queue.poll()
                for (k in 1 until dir.size) {
                    val m = Objects.requireNonNull(pa).x + dir[k][0]
                    val n = pa.y + dir[k][1]
                    addAllTheNodeInRange(m, n, grid, queue, visited)
                    if (visited[grid.size - 1][grid[0].size - 1] == 1) {
                        return cost
                    }
                }
            }
        }
        return -1
    }

    private fun addAllTheNodeInRange(
        x: Int,
        y: Int,
        grid: Array<IntArray>,
        queue: Queue<Pair>,
        visited: Array<IntArray>
    ) {
        var x = x
        var y = y
        while (x >= 0 && x < visited.size && y >= 0 && y < visited[0].size && visited[x][y] == 0) {
            queue.offer(Pair(x, y))
            visited[x][y]++
            val d = dir[grid[x][y]]
            x += d[0]
            y += d[1]
        }
    }

    private class Pair(var x: Int, var y: Int)
}
