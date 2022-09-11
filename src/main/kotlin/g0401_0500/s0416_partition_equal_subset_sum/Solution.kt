package g0401_0500.s0416_partition_equal_subset_sum

// #Medium #Top_100_Liked_Questions #Array #Dynamic_Programming #Level_2_Day_13_Dynamic_Programming
// #2022_09_11_Time_509_ms_(57.56%)_Space_51.7_MB_(72.67%)

import java.util.Arrays

class Solution {
    /**
     * credit: https://discuss.leetcode.com/topic/67539/0-1-knapsack-detailed-explanation
     */
    fun canPartition(nums: IntArray): Boolean {
        var sum = 0
        for (num in nums) {
            sum += num
        }
        if (sum and 1 == 1) {
            return false
        }
        sum /= 2
        val n = nums.size
        val dp = Array(n + 1) { BooleanArray(sum + 1) }
        for (i in dp.indices) {
            Arrays.fill(dp[i], false)
        }
        dp[0][0] = true
        for (i in 1 until n + 1) {
            dp[i][0] = true
        }
        for (j in 1 until sum + 1) {
            dp[0][j] = false
        }
        for (i in 1 until n + 1) {
            for (j in 1 until sum + 1) {
                dp[i][j] = dp[i - 1][j]
                if (j >= nums[i - 1]) {
                    dp[i][j] = dp[i][j] || dp[i - 1][j - nums[i - 1]]
                }
            }
        }
        return dp[n][sum]
    }
}
