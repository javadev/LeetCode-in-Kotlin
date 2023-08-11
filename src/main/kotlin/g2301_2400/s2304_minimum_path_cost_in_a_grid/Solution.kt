package g2301_2400.s2304_minimum_path_cost_in_a_grid

// #Medium #Array #Dynamic_Programming #Matrix
// #2023_06_29_Time_1048_ms_(100.00%)_Space_71.7_MB_(100.00%)

class Solution {
    fun minPathCost(grid: Array<IntArray>, moveCost: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size
        val dp = Array(m) { IntArray(n) }
        System.arraycopy(grid[m - 1], 0, dp[m - 1], 0, n)
        for (i in m - 2 downTo 0) {
            for (j in 0 until n) {
                var min = Int.MAX_VALUE
                for (k in 0 until n) {
                    min = min.coerceAtMost(grid[i][j] + moveCost[grid[i][j]][k] + dp[i + 1][k])
                }
                dp[i][j] = min
            }
        }
        var min = Int.MAX_VALUE
        for (s in dp[0]) {
            min = min.coerceAtMost(s)
        }
        return min
    }
}
