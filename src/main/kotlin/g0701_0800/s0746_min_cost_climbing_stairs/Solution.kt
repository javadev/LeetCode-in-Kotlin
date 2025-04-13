package g0701_0800.s0746_min_cost_climbing_stairs

// #Easy #Array #Dynamic_Programming #LeetCode_75_DP/1D #Dynamic_Programming_I_Day_2
// #Level_1_Day_11_Dynamic_Programming #2023_03_04_Time_171_ms_(96.76%)_Space_36_MB_(78.14%)

class Solution {
    fun minCostClimbingStairs(cost: IntArray): Int {
        val dp = IntArray(cost.size)
        dp[0] = cost[0]
        dp[1] = cost[1]
        for (i in 2 until cost.size) {
            dp[i] = cost[i] + dp[i - 1].coerceAtMost(dp[i - 2])
        }
        return dp[cost.size - 1].coerceAtMost(dp[cost.size - 2])
    }
}
