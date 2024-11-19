package g0101_0200.s0123_best_time_to_buy_and_sell_stock_iii

// #Hard #Array #Dynamic_Programming #2022_10_08_Time_585_ms_(95.24%)_Space_55.8_MB_(92.86%)

class Solution {
    fun maxProfit(prices: IntArray): Int {
        val n = prices.size
        if (n < 2) {
            return 0
        }
        val a = IntArray(n) { 0 }
        var minP = prices[0]
        var maxA = 0
        for (i in 1 until n) {
            minP = minOf(minP, prices[i])
            maxA = maxOf(maxA, prices[i] - minP)
            a[i] = maxA
        }
        var maxP = prices[n - 1]
        maxA = a[n - 1]
        for (i in n - 2 downTo 0) {
            maxP = maxOf(maxP, prices[i])
            maxA = maxOf(maxA, maxP - prices[i] + a[i])
        }
        return maxA
    }
}
