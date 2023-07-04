package g2401_2500.s2466_count_ways_to_build_good_strings

// #Medium #Dynamic_Programming
class Solution {
    fun countGoodStrings(low: Int, high: Int, zero: Int, one: Int): Int {
        val dp = IntArray(high + 1)
        dp[zero]++
        dp[one]++
        var ans = 0
        for (i in 0 until high + 1) {
            if (dp[i] != 0) {
                if (i + zero <= high) {
                    dp[i + zero] += dp[i]
                    dp[i + zero] = dp[i + zero] % 1000000007
                }
                if (i + one <= high) {
                    dp[i + one] += dp[i]
                    dp[i + one] = dp[i + one] % 1000000007
                }
                if (i >= low) {
                    ans += dp[i]
                    ans = ans % 1000000007
                }
            }
        }
        return ans
    }
}
