package g0701_0800.s0714_best_time_to_buy_and_sell_stock_with_transaction_fee

// #Medium #Array #Dynamic_Programming #Greedy #Dynamic_Programming_I_Day_8
// #2023_02_25_Time_417_ms_(90.91%)_Space_46.1_MB_(75.00%)

class Solution {
    fun maxProfit(prices: IntArray, fee: Int): Int {
        var cash = 0
        var hold = -prices[0]
        for (i in 1 until prices.size) {
            cash = cash.coerceAtLeast(hold + prices[i] - fee)
            hold = hold.coerceAtLeast(cash - prices[i])
        }
        return cash
    }
}
