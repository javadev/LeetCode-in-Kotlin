package g0401_0500.s0416_partition_equal_subset_sum

// #Medium #Top_100_Liked_Questions #Array #Dynamic_Programming #Level_2_Day_13_Dynamic_Programming
// #2022_09_11_Time_509_ms_(57.56%)_Space_51.7_MB_(72.67%)

class Solution {
    fun canPartition(nums: IntArray): Boolean {
        var sum = 0
        for (num in nums) {
            sum += num
        }
        if (sum % 2 != 0) {
            return false
        }
        sum /= 2
        // if use primitive boolean array will make default value to false
        // we need the default value "null" to help us to do the memo
        val dp = arrayOfNulls<Boolean>(sum + 1)
        return sumTo(nums, sum, 0, dp)
    }

    private fun sumTo(nums: IntArray, sum: Int, index: Int, dp: Array<Boolean?>): Boolean {
        if (sum == 0) {
            return true
        }
        if (sum < 0) {
            return false
        }
        if (index == nums.size) {
            return false
        }
        if (dp[sum] != null) {
            return dp[sum]!!
        }
        // use the number or not use the number
        dp[sum] = sumTo(nums, sum - nums[index], index + 1, dp) || sumTo(nums, sum, index + 1, dp)
        return dp[sum]!!
    }
}
