package g3601_3700.s3603_minimum_cost_path_with_alternating_directions_ii

// #Medium #Array #Dynamic_Programming #Matrix
// #2025_07_07_Time_12_ms_(100.00%)_Space_84.57_MB_(100.00%)

import kotlin.math.min

class Solution {
    fun minCost(m: Int, n: Int, waitCost: Array<IntArray>): Long {
        val dp = LongArray(n)
        dp[0] = 1L
        for (j in 1..<n) {
            val entry = j + 1L
            val wait = waitCost[0][j].toLong()
            dp[j] = dp[j - 1] + entry + wait
        }
        for (i in 1..<m) {
            val entry00 = i + 1L
            val wait00 = waitCost[i][0].toLong()
            dp[0] = dp[0] + entry00 + wait00
            for (j in 1..<n) {
                val entry = (i + 1).toLong() * (j + 1)
                val wait = waitCost[i][j].toLong()
                val fromAbove = dp[j]
                val fromLeft = dp[j - 1]
                dp[j] = min(fromAbove, fromLeft) + entry + wait
            }
        }
        return dp[n - 1] - waitCost[m - 1][n - 1]
    }
}
