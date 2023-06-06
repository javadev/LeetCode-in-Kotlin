package g1301_1400.s1359_count_all_valid_pickup_and_delivery_options

// #Hard #Dynamic_Programming #Math #Combinatorics
// #2023_06_06_Time_121_ms_(100.00%)_Space_32.7_MB_(100.00%)

class Solution {
    fun countOrders(n: Int): Int {
        val dp = LongArray(n + 1)
        dp[1] = 1
        val mod = 1e9.toLong() + 7
        for (i in 2..n) {
            val gaps = (i - 1) * 2L + 1
            dp[i] = gaps * (gaps + 1) / 2 * dp[i - 1] % mod
        }
        return dp[n].toInt()
    }
}
