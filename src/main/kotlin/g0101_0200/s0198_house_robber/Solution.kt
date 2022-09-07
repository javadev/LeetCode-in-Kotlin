package g0101_0200.s0198_house_robber

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Dynamic_Programming
// #Algorithm_I_Day_12_Dynamic_Programming #Dynamic_Programming_I_Day_3
// #Level_2_Day_12_Dynamic_Programming #Udemy_Dynamic_Programming
// #2022_09_07_Time_151_ms_(94.16%)_Space_33.2_MB_(98.36%)

class Solution {
    fun rob(nums: IntArray?): Int {
        if (nums == null || nums.isEmpty()) {
            return 0
        }
        if (nums.size == 1) {
            return nums[0]
        }
        val dp = IntArray(nums.size)
        dp[0] = nums[0]
        dp[1] = nums[0].coerceAtLeast(nums[1])
        for (i in 2 until nums.size) {
            dp[i] = (dp[i - 2] + nums[i]).coerceAtLeast(dp[i - 1])
        }
        return dp[nums.size - 1]
    }
}
