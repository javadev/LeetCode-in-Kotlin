package g1001_1100.s1091_shortest_path_in_binary_matrix

// #Medium #Array #Breadth_First_Search #Matrix
// #Algorithm_II_Day_8_Breadth_First_Search_Depth_First_Search
// #Graph_Theory_I_Day_5_Matrix_Related_Problems
// #2023_06_02_Time_305_ms_(98.28%)_Space_47.6_MB_(93.10%)

import java.util.LinkedList
import java.util.Queue

class Solution {
    private val directions = intArrayOf(0, 1, 1, 0, -1, 1, -1, -1, 0)
    fun shortestPathBinaryMatrix(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size
        if (grid[0][0] == 1 || grid[m - 1][n - 1] == 1) {
            return -1
        }
        var minPath = 0
        val queue: Queue<IntArray> = LinkedList()
        queue.offer(intArrayOf(0, 0))
        val visited = Array(m) { BooleanArray(n) }
        visited[0][0] = true
        while (queue.isNotEmpty()) {
            val size = queue.size
            for (i in 0 until size) {
                val curr = queue.poll()
                if (curr[0] == m - 1 && curr[1] == n - 1) {
                    return minPath + 1
                }
                for (j in 0 until directions.size - 1) {
                    val newx = directions[j] + curr[0]
                    val newy = directions[j + 1] + curr[1]
                    if (newx in 0 until n && newy >= 0 && newy < n && !visited[newx][newy] && grid[newx][newy] == 0) {
                        queue.offer(intArrayOf(newx, newy))
                        visited[newx][newy] = true
                    }
                }
            }
            minPath++
        }
        return -1
    }
}
