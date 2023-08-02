package g0801_0900.s0837_new_21_game

// #Medium #Dynamic_Programming #Math #Sliding_Window #Probability_and_Statistics
// #2023_03_27_Time_144_ms_(75.00%)_Space_35.2_MB_(25.00%)

class Solution {
    fun new21Game(n: Int, k: Int, maxPts: Int): Double {
        if (k == 0) return 1.00
        if (k == 1 && maxPts <= n) return 1.00
        val dp = DoubleArray(n + 1)
        dp[0] = 1.00
        var prev = 0.00
        for (i in 1..n) {
            if (i - maxPts - 1 >= 0) {
                prev -= dp[i - 1 - maxPts]
            }
            if (i - 1 < k) {
                prev += dp[i - 1]
            }
            dp[i] = prev / maxPts
        }
        var res = 0.00
        for (i in k..n) {
            res += dp[i]
        }
        return res
    }
}
