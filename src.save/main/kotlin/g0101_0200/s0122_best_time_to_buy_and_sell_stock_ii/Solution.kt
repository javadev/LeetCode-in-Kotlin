package g0101_0200.s0122_best_time_to_buy_and_sell_stock_ii

// #Medium #Top_Interview_Questions #Array #Dynamic_Programming #Greedy #Dynamic_Programming_I_Day_7
// #Udemy_Arrays #2022_10_08_Time_370_ms_(16.98%)_Space_39.2_MB_(53.51%)

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var max = 0
        for (i in 1 until prices.size) {
            if (prices[i] > prices[i - 1]) {
                max += prices[i] - prices[i - 1]
            }
        }
        return max
    }
}
