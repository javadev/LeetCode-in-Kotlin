package g2801_2900.s2812_find_the_safest_path_in_a_grid

// #Medium #Array #Breadth_First_Search #Binary_Search #Matrix #Union_Find
// #2023_12_06_Time_902_ms_(100.00%)_Space_89.4_MB_(100.00%)

import java.util.LinkedList
import java.util.Queue
import kotlin.math.min

class Solution {
    fun maximumSafenessFactor(grid: List<List<Int>>): Int {
        val n = grid.size
        if (grid[0][0] == 1 || grid[n - 1][n - 1] == 1) return 0
        val cost = Array(n) { IntArray(n) }
        for (v in cost) v.fill(Int.MAX_VALUE)
        bfs(cost, grid, n)
        var l = 1
        var r = n * n
        var ans = 0
        while (l <= r) {
            val mid = (r - l) / 2 + l
            if (possible(0, 0, cost, mid, n, Array(n) { BooleanArray(n) })) {
                ans = mid
                l = mid + 1
            } else {
                r = mid - 1
            }
        }
        return ans
    }

    private fun possible(
        i: Int,
        j: Int,
        cost: Array<IntArray>,
        mid: Int,
        n: Int,
        visited: Array<BooleanArray>
    ): Boolean {
        if (i < 0 || j < 0 || i >= n || j >= n) return false
        if (cost[i][j] == Int.MAX_VALUE || cost[i][j] < mid) return false
        if (i == n - 1 && j == n - 1) return true
        if (visited[i][j]) return false
        visited[i][j] = true
        val dir = arrayOf(intArrayOf(1, 0), intArrayOf(0, 1), intArrayOf(-1, 0), intArrayOf(0, -1))
        var ans = false
        for (v in dir) {
            val ii = i + v[0]
            val jj = j + v[1]
            ans = ans or possible(ii, jj, cost, mid, n, visited)
            if (ans) return true
        }
        return ans
    }

    private fun bfs(cost: Array<IntArray>, grid: List<List<Int>>, n: Int) {
        val q: Queue<IntArray> = LinkedList()
        val visited = Array(n) { BooleanArray(n) }
        for (i in grid.indices) {
            for (j in grid.indices) {
                if (grid[i][j] == 1) {
                    q.add(intArrayOf(i, j))
                    visited[i][j] = true
                }
            }
        }
        var level = 1
        val dir = arrayOf(intArrayOf(1, 0), intArrayOf(0, 1), intArrayOf(-1, 0), intArrayOf(0, -1))
        while (q.isNotEmpty()) {
            val len = q.size
            for (i in 0 until len) {
                val v = q.poll()
                for (`val` in dir) {
                    val ii = v[0] + `val`[0]
                    val jj = v[1] + `val`[1]
                    if (isValid(ii, jj, n) && !visited[ii][jj]) {
                        q.add(intArrayOf(ii, jj))
                        cost[ii][jj] = min(cost[ii][jj].toDouble(), level.toDouble()).toInt()
                        visited[ii][jj] = true
                    }
                }
            }
            level++
        }
    }

    private fun isValid(i: Int, j: Int, n: Int): Boolean {
        return i >= 0 && j >= 0 && i < n && j < n
    }
}
