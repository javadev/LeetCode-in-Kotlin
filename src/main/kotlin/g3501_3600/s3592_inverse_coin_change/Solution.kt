package g3501_3600.s3592_inverse_coin_change

// #Easy #Array #Dynamic_Programming #2025_06_23_Time_2_ms_(100.00%)_Space_48.64_MB_(100.00%)

class Solution {
    fun findCoins(numWays: IntArray): List<Int> {
        val n = numWays.size
        val dp = IntArray(n + 1)
        val coins: MutableList<Int> = ArrayList()
        dp[0] = 1
        for (i in 0..<n) {
            val amount = i + 1
            val ways = numWays[i]
            if (ways > 0 && dp[amount] == ways - 1) {
                coins.add(amount)
                for (coin in amount..n) {
                    dp[coin] += dp[coin - amount]
                }
            }
            if (dp[amount] != ways) {
                return ArrayList()
            }
        }
        return coins
    }
}
