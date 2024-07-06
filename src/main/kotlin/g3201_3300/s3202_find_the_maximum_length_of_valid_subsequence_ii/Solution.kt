package g3201_3300.s3202_find_the_maximum_length_of_valid_subsequence_ii

// #Medium #Array #Dynamic_Programming #2024_07_06_Time_255_ms_(97.30%)_Space_49_MB_(78.38%)

import kotlin.math.max

class Solution {
    fun maximumLength(nums: IntArray, k: Int): Int {
        // dp array to store the index against each possible modulo
        val dp = Array(nums.size + 1) { IntArray(k + 1) }
        var longest = 0
        for (i in nums.indices) {
            for (j in 0 until i) {
                // Checking the modulo with each previous number
                val `val` = (nums[i] + nums[j]) % k
                // storing the number of pairs that have the same modulo.
                // it would be one more than the number of pairs with the same modulo at the last
                // index
                dp[i][`val`] = dp[j][`val`] + 1
                // Calculating the max seen till now
                longest = max(longest, dp[i][`val`])
            }
        }
        // total number of elements in the subsequence would be 1 more than the number of pairs
        return longest + 1
    }
}
