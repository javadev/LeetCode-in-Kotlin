package g1301_1400.s1391_check_if_there_is_a_valid_path_in_a_grid

// #Medium #Array #Depth_First_Search #Breadth_First_Search #Matrix #Union_Find
// #2023_06_06_Time_636_ms_(100.00%)_Space_64.1_MB_(100.00%)

import java.util.LinkedList
import java.util.Queue

class Solution {
    private val dirs = arrayOf(
        arrayOf(intArrayOf(0, -1), intArrayOf(0, 1)),
        arrayOf(intArrayOf(-1, 0), intArrayOf(1, 0)),
        arrayOf(
            intArrayOf(0, -1),
            intArrayOf(1, 0)
        ),
        arrayOf(intArrayOf(0, 1), intArrayOf(1, 0)),
        arrayOf(intArrayOf(0, -1), intArrayOf(-1, 0)),
        arrayOf(
            intArrayOf(0, 1),
            intArrayOf(-1, 0)
        )
    )

    // the idea is you need to check port direction match, you can go to next cell and check whether
    // you can come back.
    fun hasValidPath(grid: Array<IntArray>): Boolean {
        val m = grid.size
        val n = grid[0].size
        val visited = Array(m) { BooleanArray(n) }
        val q: Queue<IntArray> = LinkedList()
        q.add(intArrayOf(0, 0))
        visited[0][0] = true
        while (!q.isEmpty()) {
            val cur = q.poll()
            val x = cur[0]
            val y = cur[1]
            val num = grid[x][y] - 1
            for (dir in dirs[num]) {
                val nx = x + dir[0]
                val ny = y + dir[1]
                if (nx < 0 || nx >= m || ny < 0 || ny >= n || visited[nx][ny]) {
                    continue
                }
                // go to the next cell and come back to orign to see if port directions are same
                for (backDir in dirs[grid[nx][ny] - 1]) {
                    if (nx + backDir[0] == x && ny + backDir[1] == y) {
                        visited[nx][ny] = true
                        q.add(intArrayOf(nx, ny))
                    }
                }
            }
        }
        return visited[m - 1][n - 1]
    }
}
