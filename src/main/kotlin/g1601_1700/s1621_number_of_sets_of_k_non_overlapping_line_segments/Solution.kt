package g1601_1700.s1621_number_of_sets_of_k_non_overlapping_line_segments

// #Medium #Dynamic_Programming #Math #2023_06_16_Time_147_ms_(100.00%)_Space_33.1_MB_(100.00%)

class Solution {
    fun numberOfSets(n: Int, k: Int): Int {
        return if (n - 1 >= k) {
            val dp = IntArray(k)
            val sums = IntArray(k)
            val mod = (1e9 + 7).toInt()
            for (diff in 1 until n - k + 1) {
                dp[0] = (diff + 1) * diff shr 1
                sums[0] = (sums[0] + dp[0]) % mod
                for (segments in 2..k) {
                    dp[segments - 1] = (sums[segments - 2] + dp[segments - 1]) % mod
                    sums[segments - 1] = (sums[segments - 1] + dp[segments - 1]) % mod
                }
            }
            dp[k - 1]
        } else {
            0
        }
    }
}
