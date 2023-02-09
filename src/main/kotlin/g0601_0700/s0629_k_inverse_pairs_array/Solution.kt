package g0601_0700.s0629_k_inverse_pairs_array

// #Hard #Dynamic_Programming #2023_02_09_Time_155_ms_(100.00%)_Space_32.8_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun kInversePairs(n: Int, k: Int): Int {
        var k = k
        k = Math.min(k, n * (n - 1) / 2 - k)
        if (k < 0) {
            return 0
        }
        var dp = IntArray(k + 1)
        var dp1 = IntArray(k + 1)
        dp[0] = 1
        dp1[0] = 1
        val mod = 1000000007
        for (i in 1..n) {
            val temp = dp
            dp = dp1
            dp1 = temp
            var j = 1
            val m = Math.min(k, i * (i - 1) / 2)
            while (j <= m) {
                dp[j] = (dp1[j] + dp[j - 1] - if (j >= i) dp1[j - i] else 0) % mod
                if (dp[j] < 0) {
                    dp[j] += mod
                }
                j++
            }
        }
        return dp[k]
    }
}