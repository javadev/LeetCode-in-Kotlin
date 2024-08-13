package g3201_3300.s3251_find_the_count_of_monotonic_pairs_ii

// #Hard #Array #Dynamic_Programming #Math #Prefix_Sum #Combinatorics
// #2024_08_13_Time_291_ms_(100.00%)_Space_47_MB_(100.00%)

import kotlin.math.max

class Solution {
    fun countOfPairs(nums: IntArray): Int {
        var prefixZeros = 0
        val n = nums.size
        // Calculate prefix zeros
        for (i in 1 until n) {
            prefixZeros += max((nums[i] - nums[i - 1]), 0)
        }
        val row = n + 1
        val col = nums[n - 1] + 1 - prefixZeros
        if (col <= 0) {
            return 0
        }
        // Initialize dp array
        val dp = IntArray(col)
        dp.fill(1)
        // Fill dp array
        for (r in 1 until row) {
            for (c in 1 until col) {
                dp[c] = (dp[c] + dp[c - 1]) % MOD
            }
        }
        return dp[col - 1]
    }

    companion object {
        private const val MOD = 1000000007
    }
}
