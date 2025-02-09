package g3401_3500.s3418_maximum_amount_of_money_robot_can_earn

// #Medium #Array #Dynamic_Programming #Matrix
// #2025_01_14_Time_60_ms_(81.82%)_Space_84.66_MB_(81.82%)

import kotlin.math.max

class Solution {
    fun maximumAmount(coins: Array<IntArray>): Int {
        val m = coins.size
        val n = coins[0].size
        val dp = Array<IntArray>(m) { IntArray(n) }
        val dp1 = Array<IntArray>(m) { IntArray(n) }
        val dp2 = Array<IntArray>(m) { IntArray(n) }
        dp[0][0] = coins[0][0]
        for (j in 1..<n) {
            dp[0][j] = dp[0][j - 1] + coins[0][j]
        }
        for (i in 1..<m) {
            dp[i][0] = dp[i - 1][0] + coins[i][0]
        }
        for (i in 1..<m) {
            for (j in 1..<n) {
                dp[i][j] = max(dp[i][j - 1], dp[i - 1][j]) + coins[i][j]
            }
        }
        dp1[0][0] = max(coins[0][0], 0)
        for (j in 1..<n) {
            dp1[0][j] = max(dp[0][j - 1], (dp1[0][j - 1] + coins[0][j]))
        }
        for (i in 1..<m) {
            dp1[i][0] = max(dp[i - 1][0], (dp1[i - 1][0] + coins[i][0]))
        }
        for (i in 1..<m) {
            for (j in 1..<n) {
                dp1[i][j] = max(
                    max(dp[i][j - 1], dp[i - 1][j]),
                    (max(dp1[i][j - 1], dp1[i - 1][j]) + coins[i][j]),
                )
            }
        }
        dp2[0][0] = max(coins[0][0], 0)
        for (j in 1..<n) {
            dp2[0][j] = max(dp1[0][j - 1], (dp2[0][j - 1] + coins[0][j]))
        }
        for (i in 1..<m) {
            dp2[i][0] = max(dp1[i - 1][0], (dp2[i - 1][0] + coins[i][0]))
        }
        for (i in 1..<m) {
            for (j in 1..<n) {
                dp2[i][j] = max(
                    max(dp1[i][j - 1], dp1[i - 1][j]),
                    (max(dp2[i][j - 1], dp2[i - 1][j]) + coins[i][j]),
                )
            }
        }
        return dp2[m - 1][n - 1]
    }
}
