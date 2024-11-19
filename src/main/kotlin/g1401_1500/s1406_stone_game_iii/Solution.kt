package g1401_1500.s1406_stone_game_iii

// #Hard #Array #Dynamic_Programming #Math #Game_Theory
// #2023_06_07_Time_699_ms_(90.70%)_Space_61.8_MB_(100.00%)

class Solution {
    fun stoneGameIII(stoneValue: IntArray): String {
        val dp = IntArray(stoneValue.size + 1)
        dp.fill(0)
        var i = stoneValue.size - 1
        while (i >= 0) {
            var ans = Int.MIN_VALUE
            ans = Math.max(ans, stoneValue[i] - dp[i + 1])
            if (i + 1 < stoneValue.size) {
                ans = Math.max(ans, stoneValue[i] + stoneValue[i + 1] - dp[i + 2])
            }
            if (i + 2 < stoneValue.size) {
                ans = Math.max(
                    ans,
                    stoneValue[i] + stoneValue[i + 1] + stoneValue[i + 2] - dp[i + 3],
                )
            }
            dp[i] = ans
            i--
        }
        val value = dp[0]
        if (value > 0) {
            return "Alice"
        }
        return if (value == 0) "Tie" else "Bob"
    }
}
