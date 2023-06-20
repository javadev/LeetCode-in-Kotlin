package g1901_2000.s1926_nearest_exit_from_entrance_in_maze

// #Medium #Array #Breadth_First_Search #Matrix #Graph_Theory_I_Day_6_Matrix_Related_Problems
// #2023_06_20_Time_351_ms_(94.44%)_Space_45.4_MB_(100.00%)

import java.util.LinkedList
import java.util.Queue

class Solution {
    fun nearestExit(maze: Array<CharArray>, entrance: IntArray): Int {
        val m = maze.size
        val n = maze[0].size
        val directions = intArrayOf(0, 1, 0, -1, 0)
        val queue: Queue<IntArray> = LinkedList()
        queue.offer(intArrayOf(entrance[0], entrance[1], 0))
        val visited = Array(m) { BooleanArray(n) }
        visited[entrance[0]][entrance[1]] = true
        var shortestSteps = m * n
        while (queue.isNotEmpty()) {
            val curr = queue.poll()
            for (i in 0 until directions.size - 1) {
                val nextX = curr[0] + directions[i]
                val nextY = curr[1] + directions[i + 1]
                if (nextX >= 0 && nextX < m && nextY >= 0 && nextY < n &&
                    maze[nextX][nextY] == '.' && !visited[nextX][nextY]
                ) {
                    visited[nextX][nextY] = true
                    if (nextX == 0 || nextX == m - 1 || nextY == 0 || nextY == n - 1) {
                        shortestSteps = Math.min(shortestSteps, curr[2] + 1)
                    } else {
                        queue.offer(intArrayOf(nextX, nextY, curr[2] + 1))
                    }
                }
            }
        }
        return if (shortestSteps == m * n) -1 else shortestSteps
    }
}
