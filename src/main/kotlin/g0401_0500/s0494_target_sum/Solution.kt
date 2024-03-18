package g0401_0500.s0494_target_sum

// #Medium #Array #Dynamic_Programming #Backtracking #Big_O_Time_O(n*(sum+s))_Space_O(n*(sum+s))
// #2022_09_16_Time_308_ms_(89.61%)_Space_37.2_MB_(61.04%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun findTargetSumWays(nums: IntArray, target: Int): Int {
        var target = target
        var sum = 0
        target = Math.abs(target)
        for (num in nums) {
            sum += num
        }
        // Invalid target, just return 0
        if (target > sum || (sum + target) % 2 != 0) {
            return 0
        }
        val dp = Array((sum + target) / 2 + 1) { IntArray(nums.size + 1) }
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
        return dp[(sum + target) / 2][nums.size]
    }
}
