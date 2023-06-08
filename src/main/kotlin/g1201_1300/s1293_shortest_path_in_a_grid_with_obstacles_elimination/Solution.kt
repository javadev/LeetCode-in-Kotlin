package g1201_1300.s1293_shortest_path_in_a_grid_with_obstacles_elimination

// #Hard #Array #Breadth_First_Search #Matrix
// #2023_06_08_Time_189_ms_(100.00%)_Space_36.6_MB_(100.00%)

import java.util.LinkedList
import java.util.Queue

class Solution {
    fun shortestPath(grid: Array<IntArray>, k: Int): Int {
        if (grid.size == 1 && grid[0].size == 1 && grid[0][0] == 0) {
            return 0
        }
        // 4 potential moves:
        val moves = arrayOf(intArrayOf(1, 0), intArrayOf(-1, 0), intArrayOf(0, 1), intArrayOf(0, -1))
        val m = grid.size
        val n = grid[0].size
        // use obs to record the min total obstacles when traverse to the position
        val obs = Array(m) { IntArray(n) }
        for (i in 0 until m) {
            for (j in 0 until n) {
                obs[i][j] = Int.MAX_VALUE
            }
        }
        obs[0][0] = 0
        // Queue to record {x cord, y cord, total obstacles when trvavers to this position}
        val que: Queue<IntArray> = LinkedList()
        que.add(intArrayOf(0, 0, 0))
        var level = 0
        while (que.isNotEmpty()) {
            val size = que.size
            level++
            for (i in 0 until size) {
                val current = que.poll()
                for (move in moves) {
                    val next = intArrayOf(current[0] + move[0], current[1] + move[1])
                    if (next[0] == m - 1 && next[1] == n - 1) {
                        return level
                    }
                    if (next[0] < 0 || next[0] > m - 1 || next[1] < 0 || next[1] > n - 1) {
                        continue
                    }
                    if (current[2] + grid[next[0]][next[1]] < obs[next[0]][next[1]] &&
                        current[2] + grid[next[0]][next[1]] <= k
                    ) {
                        obs[next[0]][next[1]] = current[2] + grid[next[0]][next[1]]
                        que.add(intArrayOf(next[0], next[1], obs[next[0]][next[1]]))
                    }
                }
            }
        }
        return -1
    }
}
