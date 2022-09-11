package g0301_0400.s0322_coin_change

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Dynamic_Programming
// #Breadth_First_Search #Algorithm_II_Day_18_Dynamic_Programming #Dynamic_Programming_I_Day_20
// #Level_2_Day_12_Dynamic_Programming #2022_09_11_Time_332_ms_(50.68%)_Space_37.6_MB_(79.93%)

class Solution {
    fun coinChange(coins: IntArray, amount: Int): Int {
        val dp = IntArray(amount + 1)
        dp[0] = 1
        for (coin in coins) {
            for (i in coin..amount) {
                val prev = dp[i - coin]
                if (prev > 0) {
                    if (dp[i] == 0) {
                        dp[i] = prev + 1
                    } else {
                        dp[i] = Math.min(dp[i], prev + 1)
                    }
                }
            }
        }
        return dp[amount] - 1
    }
}
