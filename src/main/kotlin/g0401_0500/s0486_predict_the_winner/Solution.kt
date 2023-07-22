package g0401_0500.s0486_predict_the_winner

// #Medium #Array #Dynamic_Programming #Math #Recursion #Game_Theory
// #2023_01_03_Time_158_ms_(84.62%)_Space_33.3_MB_(92.31%)

class Solution {
    fun predictTheWinner(nums: IntArray): Boolean {
        val n = nums.size
        val dp = Array(n) { IntArray(n) }
        for (i in 0 until n) {
            dp[i][i] = nums[i]
        }
        for (len in 1 until n) {
            for (i in 0 until n - len) {
                val j = i + len
                dp[i][j] = Math.max(nums[i] - dp[i + 1][j], nums[j] - dp[i][j - 1])
            }
        }
        return dp[0][n - 1] >= 0
    }
}
