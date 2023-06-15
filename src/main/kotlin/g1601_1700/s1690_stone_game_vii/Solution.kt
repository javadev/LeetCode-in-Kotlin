package g1601_1700.s1690_stone_game_vii

// #Medium #Array #Dynamic_Programming #Math #Game_Theory
class Solution {
    fun stoneGameVII(stones: IntArray): Int {
        val n = stones.size
        val dp = IntArray(n)
        for (i in n - 1 downTo 0) {
            var j = i + 1
            var sum = stones[i]
            while (j < n) {
                sum += stones[j]
                dp[j] = Math.max(sum - stones[i] - dp[j], sum - stones[j] - dp[j - 1])
                j++
            }
        }
        return dp[n - 1]
    }
}
