package g0501_0600.s0518_coin_change_2

// #Medium #Array #Dynamic_Programming #Dynamic_Programming_I_Day_20
// #2023_01_13_Time_139_ms_(100.00%)_Space_33.6_MB_(94.00%)

class Solution {
    fun change(amount: Int, coins: IntArray): Int {
        val dp = IntArray(amount + 1)
        dp[0] = 1
        for (coin in coins) {
            for (i in coin..amount) {
                dp[i] += dp[i - coin]
            }
        }
        return dp[amount]
    }
}
