package g2901_3000.s2944_minimum_number_of_coins_for_fruits

// #Medium #Array #Dynamic_Programming #Heap_Priority_Queue #Queue #Monotonic_Queue
// #2024_01_07_Time_194_ms_(84.62%)_Space_37.5_MB_(92.31%)

import kotlin.math.min

class Solution {
    fun minimumCoins(prices: IntArray): Int {
        val n = prices.size
        val dp = IntArray(n)
        dp[n - 1] = prices[n - 1]
        for (i in n - 2 downTo 0) {
            val pos = i + 1
            val acquired = i + pos
            if (acquired + 1 < n) {
                var min = Int.MAX_VALUE
                for (j in acquired + 1 downTo i + 1) {
                    min = min(min.toDouble(), dp[j].toDouble()).toInt()
                }
                dp[i] = prices[i] + min
            } else {
                dp[i] = prices[i]
            }
        }
        return dp[0]
    }
}
