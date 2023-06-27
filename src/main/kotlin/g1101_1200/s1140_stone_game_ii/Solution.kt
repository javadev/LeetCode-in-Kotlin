package g1101_1200.s1140_stone_game_ii

// #Medium #Array #Dynamic_Programming #Math #Game_Theory
// #2023_05_31_Time_166_ms_(93.27%)_Space_41.4_MB_(39.42%)

class Solution {
    private val dp = Array(105) { IntArray(105) }
    private fun help(i: Int, m: Int, p: IntArray): Int {
        if (i >= p.size) {
            dp[i][m] = 0
            return 0
        }
        if (dp[i][m] != -1) {
            return dp[i][m]
        }
        var ans = Int.MIN_VALUE
        var total = 0
        for (j in 0 until 2 * m) {
            if (i + j < p.size) {
                total += p[i + j]
                ans = Math.max(ans, total - help(i + j + 1, Math.max(m, j + 1), p))
            }
        }
        dp[i][m] = ans
        return ans
    }

    fun stoneGameII(piles: IntArray): Int {
        var sum = 0
        for (arr1 in dp) {
            arr1.fill(-1)
        }
        for (z in piles) {
            sum += z
        }
        return (sum + help(0, 1, piles)) / 2
    }
}
