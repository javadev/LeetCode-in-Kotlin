package g2701_2800.s2787_ways_to_express_an_integer_as_sum_of_powers

// #Medium #Dynamic_Programming #2023_08_08_Time_152_ms_(100.00%)_Space_35.8_MB_(90.91%)

class Solution {
    fun numberOfWays(n: Int, x: Int): Int {
        val dp = IntArray(301)
        val mod = 1000000007
        var v: Int
        dp[0] = 1
        var a = 1
        while ((Math.pow(a.toDouble(), x.toDouble())).also { v = it.toInt() } <= n) {
            for (i in n downTo v) {
                dp[i] = (dp[i] + dp[i - v]) % mod
            }
            a++
        }
        return dp[n]
    }
}
