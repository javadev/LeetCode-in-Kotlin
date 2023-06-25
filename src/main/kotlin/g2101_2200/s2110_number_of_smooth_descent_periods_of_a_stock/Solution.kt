package g2101_2200.s2110_number_of_smooth_descent_periods_of_a_stock

// #Medium #Array #Dynamic_Programming #Math
// #2023_06_25_Time_582_ms_(100.00%)_Space_55.8_MB_(100.00%)

class Solution {
    fun getDescentPeriods(prices: IntArray): Long {
        var descendantCount: Long = 0
        var previousCounts = 0
        for (i in 0 until prices.size - 1) {
            if (prices[i] - prices[i + 1] == 1) {
                descendantCount++
                if (previousCounts > 0) {
                    descendantCount += previousCounts.toLong()
                }
                previousCounts++
            } else {
                previousCounts = 0
            }
        }
        descendantCount += prices.size.toLong()
        return descendantCount
    }
}
