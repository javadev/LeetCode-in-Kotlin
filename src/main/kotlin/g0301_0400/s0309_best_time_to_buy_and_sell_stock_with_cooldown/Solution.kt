package g0301_0400.s0309_best_time_to_buy_and_sell_stock_with_cooldown

// #Medium #Array #Dynamic_Programming #Dynamic_Programming_I_Day_8
// #2022_11_09_Time_272_ms_(73.33%)_Space_35.2_MB_(70.67%)

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var sell = 0
        var prevSell = 0
        var buy = Int.MIN_VALUE
        var prevBuy: Int
        for (price in prices) {
            prevBuy = buy
            buy = Math.max(prevSell - price, prevBuy)
            prevSell = sell
            sell = Math.max(prevBuy + price, prevSell)
        }
        return sell
    }
}
