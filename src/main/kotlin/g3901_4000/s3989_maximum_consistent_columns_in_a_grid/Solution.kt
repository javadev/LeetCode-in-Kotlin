package g3901_4000.s3989_maximum_consistent_columns_in_a_grid

import kotlin.math.abs
import kotlin.math.max

// #Hard #Array #Dynamic_Programming #Matrix #Senior_Staff #Weekly_Contest_510
// #2026_11_03_Time_10_ms_(94.64%)_Space_61.08_MB_(87.50%)

class Solution {
    fun maxConsistentColumns(grid: Array<IntArray>, limit: Int): Int {
        val n = grid[0].size
        var max = 1
        val dp = IntArray(n)
        for (col in 0..<n) {
            dp[col] = 1
            for (p in col - 1 downTo 0) {
                if (dp[p] + 1 >= dp[col] && areColumnsConsistent(grid, col, p, limit)) {
                    dp[col] = dp[p] + 1
                }
            }
            max = max(max, dp[col])
        }
        return max
    }

    private fun areColumnsConsistent(grid: Array<IntArray>, col: Int, previousCol: Int, limit: Int): Boolean {
        for (row in grid) {
            if (abs(row[col] - row[previousCol]) > limit) {
                return false
            }
        }
        return true
    }
}
