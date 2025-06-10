package g3501_3600.s3573_best_time_to_buy_and_sell_stock_v

// #Medium #Array #Dynamic_Programming #2025_06_10_Time_27_ms_(100.00%)_Space_48.69_MB_(80.00%)

import kotlin.math.max

class Solution {
    fun maximumProfit(prices: IntArray, k: Int): Long {
        val n = prices.size
        var prev = LongArray(n)
        var curr = LongArray(n)
        for (t in 1..k) {
            var bestLong = -prices[0].toLong()
            var bestShort = prices[0].toLong()
            curr[0] = 0
            for (i in 1..<n) {
                var res = curr[i - 1]
                res = max(res, prices[i] + bestLong)
                res = max(res, -prices[i] + bestShort)
                curr[i] = res
                bestLong = max(bestLong, prev[i - 1] - prices[i])
                bestShort = max(bestShort, prev[i - 1] + prices[i])
            }
            val tmp = prev
            prev = curr
            curr = tmp
        }
        return prev[n - 1]
    }
}
