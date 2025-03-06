package g3401_3500.s3473_sum_of_k_subarrays_with_length_at_least_m

// #Medium #Array #Dynamic_Programming #Prefix_Sum
// #2025_03_06_Time_227_ms_(24.47%)_Space_99.61_MB_(48.94%)

import kotlin.math.max

class Solution {
    fun maxSum(nums: IntArray, k: Int, m: Int): Int {
        val n = nums.size
        // Calculate prefix sums
        val prefixSum = IntArray(n + 1)
        for (i in 0..<n) {
            prefixSum[i + 1] = prefixSum[i] + nums[i]
        }
        // using elements from nums[0...i-1]
        val dp = Array<IntArray>(n + 1) { IntArray(k + 1) }
        // Initialize dp array
        for (j in 1..k) {
            for (i in 0..n) {
                dp[i][j] = Int.Companion.MIN_VALUE / 2
            }
        }
        // Fill dp array
        for (j in 1..k) {
            val maxPrev = IntArray(n + 1)
            for (i in 0..<n + 1) {
                maxPrev[i] =
                    if (i == 0) {
                        dp[0][j - 1] - prefixSum[0]
                    } else {
                        max(maxPrev[i - 1], dp[i][j - 1] - prefixSum[i])
                    }
            }
            for (i in m..n) {
                // Option 1: Don't include the current element in any new subarray
                dp[i][j] = dp[i - 1][j]
                // Option 2: Form a new subarray ending at position i
                // Find the best starting position for the subarray
                dp[i][j] = max(dp[i][j], prefixSum[i] + maxPrev[i - m])
            }
        }
        return dp[n][k]
    }
}
