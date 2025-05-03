package g3401_3500.s3473_sum_of_k_subarrays_with_length_at_least_m

// #Medium #Array #Dynamic_Programming #Prefix_Sum
// #2025_05_03_Time_33_ms_(98.18%)_Space_81.75_MB_(87.27%)

class Solution {
    fun maxSum(nums: IntArray, k: Int, m: Int): Int {
        val n = nums.size
        val dp = Array(k + 1) { IntArray(n + 1) { Int.MIN_VALUE } }
        val ps = IntArray(n + 1)
        for (i in nums.indices) {
            ps[i + 1] = ps[i] + nums[i]
        }
        for (j in 0..n) {
            dp[0][j] = 0
        }
        for (i in 1..k) {
            var best = Int.MIN_VALUE
            for (j in (i * m)..n) {
                best = maxOf(best, dp[i - 1][j - m] - ps[j - m])
                dp[i][j] = maxOf(dp[i][j - 1], ps[j] + best)
            }
        }
        return dp[k][n]
    }
}
