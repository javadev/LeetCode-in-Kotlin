package g0101_0200.s0121_best_time_to_buy_and_sell_stock

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Array #Dynamic_Programming
// #Data_Structure_I_Day_3_Array #Dynamic_Programming_I_Day_7 #Level_1_Day_5_Greedy #Udemy_Arrays
// #2022_09_03_Time_609_ms_(94.06%)_Space_57.3_MB_(94.43%)

class Solution {
    fun maxProfit(prices: IntArray): Int {
        var maxProfit = 0
        var min = prices[0]
        for (i in 1 until prices.size) {
            if (prices[i] > min) {
                maxProfit = Math.max(maxProfit, prices[i] - min)
            } else {
                min = prices[i]
            }
        }
        return maxProfit
    }
}
