package g3001_3100.s3082_find_the_sum_of_the_power_of_all_subsequences

// #Hard #Array #Dynamic_Programming #2024_04_18_Time_176_ms_(90.00%)_Space_35.3_MB_(100.00%)

class Solution {
    fun sumOfPower(nums: IntArray, k: Int): Int {
        val kMod = 1000000007
        val dp = IntArray(k + 1)
        dp[0] = 1
        for (num in nums) {
            for (i in k downTo 0) {
                if (i < num) {
                    dp[i] = ((dp[i] * 2L) % kMod).toInt()
                } else {
                    dp[i] = ((dp[i] * 2L + dp[i - num]) % kMod).toInt()
                }
            }
        }
        return dp[k]
    }
}
