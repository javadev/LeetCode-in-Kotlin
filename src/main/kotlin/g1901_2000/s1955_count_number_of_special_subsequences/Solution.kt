package g1901_2000.s1955_count_number_of_special_subsequences

// #Hard #Array #Dynamic_Programming #2023_06_21_Time_620_ms_(100.00%)_Space_56.3_MB_(100.00%)

class Solution {
    fun countSpecialSubsequences(nums: IntArray): Int {
        val mod = 1000000007
        val dp = intArrayOf(1, 0, 0, 0)
        for (n in nums) {
            dp[n + 1] = (dp[n] + 2 * dp[n + 1] % mod) % mod
        }
        return dp[3]
    }
}
