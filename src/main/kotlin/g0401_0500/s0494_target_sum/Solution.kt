package g0401_0500.s0494_target_sum

// #Medium #Top_100_Liked_Questions #Array #Dynamic_Programming #Backtracking
// #2022_09_16_Time_308_ms_(89.61%)_Space_37.2_MB_(61.04%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun findTargetSumWays(nums: IntArray, s: Int): Int {
        var s = s
        var sum = 0
        s = Math.abs(s)
        for (num in nums) {
            sum += num
        }
        // Invalid s, just return 0
        if (s > sum || (sum + s) % 2 != 0) {
            return 0
        }
        val dp = Array((sum + s) / 2 + 1) { IntArray(nums.size + 1) }
        dp[0][0] = 1
        // empty knapsack must be processed specially
        for (i in nums.indices) {
            if (nums[i] == 0) {
                dp[0][i + 1] = dp[0][i] * 2
            } else {
                dp[0][i + 1] = dp[0][i]
            }
        }
        for (i in 1 until dp.size) {
            for (j in nums.indices) {
                dp[i][j + 1] += dp[i][j]
                if (nums[j] <= i) {
                    dp[i][j + 1] += dp[i - nums[j]][j]
                }
            }
        }
        return dp[(sum + s) / 2][nums.size]
    }
}
