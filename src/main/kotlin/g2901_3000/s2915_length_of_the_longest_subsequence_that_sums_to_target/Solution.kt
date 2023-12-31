package g2901_3000.s2915_length_of_the_longest_subsequence_that_sums_to_target

// #Medium #Array #Dynamic_Programming #2023_12_31_Time_552_ms_(66.67%)_Space_39.4_MB_(83.33%)

import kotlin.math.max

class Solution {
    fun lengthOfLongestSubsequence(nums: List<Int>, target: Int): Int {
        val dp = IntArray(target + 1)
        for (i in 1..target) {
            dp[i] = -1
        }
        dp[0] = 0
        for (num in nums) {
            for (j in target downTo num) {
                if (dp[j - num] != -1) {
                    dp[j] = max(dp[j], dp[j - num] + 1)
                }
            }
        }
        if (dp[target] == -1) {
            return -1
        }
        return dp[target]
    }
}
