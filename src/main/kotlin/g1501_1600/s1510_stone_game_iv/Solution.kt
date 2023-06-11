package g1501_1600.s1510_stone_game_iv

// #Hard #Dynamic_Programming #Math #Game_Theory
class Solution {
    fun winnerSquareGame(n: Int): Boolean {
        val dp = BooleanArray(n + 1)
        for (i in 1 until n + 1) {
            var k = 1
            while (k * k <= i) {
                if (!dp[i - k * k]) {
                    dp[i] = true
                    break
                }
                k++
            }
        }
        return dp[n]
    }
}
