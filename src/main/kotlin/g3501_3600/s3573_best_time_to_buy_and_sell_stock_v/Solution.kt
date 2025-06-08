package g3501_3600.s3573_best_time_to_buy_and_sell_stock_v

// #Medium #2025_06_08_Time_157_ms_(100.00%)_Space_99.08_MB_(100.00%)

import kotlin.math.max

class Solution {
    private lateinit var dp: Array<Array<LongArray>>
    private lateinit var prices: IntArray

    private fun f(i: Int, k: Int, state: Int): Long {
        if (i == prices.size) {
            return if (state == 0) 0 else MN
        }
        if (dp[i][k][state] != MN) {
            return dp[i][k][state]
        }
        val p = prices[i].toLong()
        var profit: Long = MN
        profit = max(profit, f(i + 1, k, state))
        if (state == 0) {
            profit = max(profit, f(i + 1, k, 1) - p)
            profit = max(profit, f(i + 1, k, 2) + p)
        } else if (k > 0) {
            profit = if (state == 1) {
                max(profit, f(i + 1, k - 1, 0) + p)
            } else {
                max(profit, f(i + 1, k - 1, 0) - p)
            }
        }
        dp[i][k][state] = profit
        return profit
    }

    fun maximumProfit(prices: IntArray, k: Int): Long {
        this.prices = prices
        val n = prices.size
        dp = Array<Array<LongArray>>(n + 1) { Array<LongArray>(k + 1) { LongArray(3) } }
        for (twoD in dp) {
            for (oneD in twoD) {
                oneD.fill(MN)
            }
        }
        return f(0, k, 0)
    }

    companion object {
        private val MN = -1e14.toLong()
    }
}
