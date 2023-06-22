package g1801_1900.s1872_stone_game_viii

// #Hard #Array #Dynamic_Programming #Math #Prefix_Sum #Game_Theory
// #2023_06_22_Time_569_ms_(100.00%)_Space_55.3_MB_(100.00%)

class Solution {
    fun stoneGameVIII(stones: IntArray): Int {
        if (stones.size <= 1) {
            return 0
        }
        val n = stones.size
        for (i in 1 until n) {
            stones[i] = stones[i - 1] + stones[i]
        }
        // presum stones[] is ready;
        // dp[n-2]
        var dp = stones[n - 1]
        // The game stops when only one stone is left in the row.
        for (i in n - 3 downTo 0) {
            dp = Math.max(stones[i + 1] - dp, dp)
        }
        return dp
    }
}
