package g1701_1800.s1770_maximum_score_from_performing_multiplication_operations

// #Medium #Array #Dynamic_Programming
class Solution {
    fun maximumScore(nums: IntArray, mult: IntArray): Int {
        val n = nums.size
        val m = mult.size
        var row = m
        val dp = IntArray(m)
        var prev = IntArray(m + 1)
        while (--row >= 0) {
            for (i in 0..row) {
                dp[i] = Math.max(
                    prev[i] + mult[row] * nums[n - row + i - 1],
                    prev[i + 1] + mult[row] * nums[i]
                )
            }
            prev = dp
        }
        return dp[0]
    }
}
