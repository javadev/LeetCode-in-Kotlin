package g3201_3300.s3290_maximum_multiplication_score

// #Medium #2024_09_17_Time_749_ms_(66.67%)_Space_71.3_MB_(75.00%)

import kotlin.math.max

class Solution {
    fun maxScore(a: IntArray, b: IntArray): Long {
        val dp = LongArray(4)
        dp.fill((-1e11).toLong())
        for (bi in b) {
            for (i in 3 downTo 0) {
                dp[i] = max(dp[i], ((if (i > 0) dp[i - 1] else 0) + a[i].toLong() * bi))
            }
        }
        return dp[3]
    }
}
