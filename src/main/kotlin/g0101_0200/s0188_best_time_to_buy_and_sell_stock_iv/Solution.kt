package g0101_0200.s0188_best_time_to_buy_and_sell_stock_iv

// #Hard #Array #Dynamic_Programming #Top_Interview_150_Multidimensional_DP
// #2022_10_18_Time_293_ms_(68.31%)_Space_34.9_MB_(84.15%)

class Solution {
    fun maxProfit(k: Int, prices: IntArray): Int {
        val n = prices.size
        val dp = IntArray(k + 1)
        val maxdp = IntArray(k + 1)
        for (i in 0..k) {
            maxdp[i] = Int.MIN_VALUE
        }
        for (i in 1..n) {
            maxdp[0] = Math.max(maxdp[0], dp[0] - prices[i - 1])
            for (j in k downTo 1) {
                maxdp[j] = Math.max(maxdp[j], dp[j] - prices[i - 1])
                dp[j] = Math.max(maxdp[j - 1] + prices[i - 1], dp[j])
            }
        }
        return dp[k]
    }
}
