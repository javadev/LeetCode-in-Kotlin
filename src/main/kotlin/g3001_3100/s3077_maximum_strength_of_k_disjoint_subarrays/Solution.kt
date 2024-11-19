package g3001_3100.s3077_maximum_strength_of_k_disjoint_subarrays

// #Hard #Array #Dynamic_Programming #Prefix_Sum
// #2024_04_16_Time_351_ms_(75.00%)_Space_51.3_MB_(60.00%)

import kotlin.math.max

class Solution {
    fun maximumStrength(n: IntArray, k: Int): Long {
        if (n.size == 1) {
            return n[0].toLong()
        }
        val dp = Array(n.size) { LongArray(k) }
        dp[0][0] = k.toLong() * n[0]
        for (i in 1 until k) {
            var pm: Long = -1
            dp[i][0] = (max(0, dp[i - 1][0]) + k.toLong() * n[i])
            for (j in 1 until i) {
                dp[i][j] = (
                    max(
                        dp[i - 1][j],
                        dp[i - 1][j - 1],
                    ) + (k.toLong() - j) * n[i] * pm
                    )
                pm = -pm
            }
            dp[i][i] = dp[i - 1][i - 1] + (k.toLong() - i) * n[i] * pm
        }
        var max = dp[k - 1][k - 1]
        for (i in k until n.size) {
            var pm: Long = 1
            dp[i][0] = (max(0, dp[i - 1][0]) + k.toLong() * n[i])
            for (j in 1 until k) {
                pm = -pm
                dp[i][j] = (
                    max(
                        dp[i - 1][j],
                        dp[i - 1][j - 1],
                    ) + (k.toLong() - j) * n[i] * pm
                    )
            }
            if (max < dp[i][k - 1]) {
                max = dp[i][k - 1]
            }
        }
        return max
    }
}
