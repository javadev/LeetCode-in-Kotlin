package g1701_1800.s1770_maximum_score_from_performing_multiplication_operations

// #Medium #Array #Dynamic_Programming #2023_06_18_Time_436_ms_(91.67%)_Space_51.6_MB_(79.17%)

class Solution {
    fun maximumScore(nums: IntArray, multipliers: IntArray): Int {
        val n = nums.size
        val m = multipliers.size
        var row = m
        val dp = IntArray(m)
        var prev = IntArray(m + 1)
        while (--row >= 0) {
            for (i in 0..row) {
                dp[i] = Math.max(
                    prev[i] + multipliers[row] * nums[n - row + i - 1],
                    prev[i + 1] + multipliers[row] * nums[i]
                )
            }
            prev = dp
        }
        return dp[0]
    }
}
