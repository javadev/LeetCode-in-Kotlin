package g2701_2800.s2742_painting_the_walls

// #Hard #Array #Dynamic_Programming #2023_08_07_Time_268_ms_(100.00%)_Space_41.2_MB_(87.50%)

class Solution {
    fun paintWalls(cost: IntArray, time: IntArray): Int {
        val n = cost.size
        val dp = Array(n + 1) { IntArray(n + 1) }
        return solve(n, cost, 0, time, dp)
    }

    private fun solve(wallsRem: Int, cost: IntArray, idx: Int, time: IntArray, dp: Array<IntArray>): Int {
        if (wallsRem <= 0) return 0
        if (idx >= cost.size) return 1000000000
        if (dp[idx][wallsRem] != 0) {
            return dp[idx][wallsRem]
        }
        val skip = solve(wallsRem, cost, idx + 1, time, dp)
        val take = cost[idx] + solve(wallsRem - time[idx] - 1, cost, idx + 1, time, dp)
        dp[idx][wallsRem] = skip.coerceAtMost(take)
        return dp[idx][wallsRem]
    }
}
