package g0601_0700.s0673_number_of_longest_increasing_subsequence

// #Medium #Array #Dynamic_Programming #Segment_Tree #Binary_Indexed_Tree
// #Algorithm_II_Day_16_Dynamic_Programming #2023_02_15_Time_226_ms_(91.67%)_Space_36.3_MB_(83.33%)

class Solution {
    fun findNumberOfLIS(nums: IntArray): Int {
        val dp = IntArray(nums.size)
        val count = IntArray(nums.size)
        dp[0] = 1
        count[0] = 1
        var result = 0
        var max = Int.MIN_VALUE
        for (i in 1 until nums.size) {
            dp[i] = 1
            count[i] = 1
            for (j in i - 1 downTo 0) {
                if (nums[j] < nums[i]) {
                    if (dp[i] < dp[j] + 1) {
                        dp[i] = dp[j] + 1
                        count[i] = count[j]
                    } else if (dp[i] == dp[j] + 1) {
                        count[i] += count[j]
                    }
                }
            }
        }
        for (i in nums.indices) {
            if (max < dp[i]) {
                result = count[i]
                max = dp[i]
            } else if (max == dp[i]) {
                result += count[i]
            }
        }
        return result
    }
}
