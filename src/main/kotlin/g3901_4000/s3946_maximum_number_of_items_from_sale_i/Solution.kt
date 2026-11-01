package g3901_4000.s3946_maximum_number_of_items_from_sale_i

// #Medium #Array #Dynamic_Programming #Greedy #Staff #Weekly_Contest_504
// #2026_10_20_Time_13_ms_(100.00%)_Space_46.50_MB_(96.15%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maximumSaleItems(items: Array<IntArray>, budget: Int): Int {
        val n = items.size
        var maxFactor = 0
        var minPrice = Int.MAX_VALUE
        // Find the maximum factor (for our frequency array) and the minimum price
        for (item in items) {
            maxFactor = max(maxFactor, item[0])
            minPrice = min(minPrice, item[1])
        }
        // Count frequencies of each factor
        val freq = IntArray(maxFactor + 1)
        for (item in items) {
            freq[item[0]]++
        }
        // Precompute how many free items we get by buying at least 1 copy of item i
        val free = IntArray(n)
        for (i in 0..<n) {
            val f = items[i][0]
            var count = 0
            // Sum up the frequencies of all multiples of factor f
            var mult = f
            while (mult <= maxFactor) {
                count += freq[mult]
                mult += f
            }
            // Subtract 1 because we shouldn't count the item itself as a free copy
            free[i] = count - 1
        }
        // 0-1 Knapsack DP
        // dp[c] stores the max items we can get by spending exactly 'c' budget to activate items
        val dp = IntArray(budget + 1)
        dp.fill(-1)
        dp[0] = 0
        for (i in 0..<n) {
            val weight = items[i][1]
            val value = 1 + free[i]
            for (c in budget downTo weight) {
                if (dp[c - weight] != -1) {
                    dp[c] = max(dp[c], dp[c - weight] + value)
                }
            }
        }
        // Evaluate the best combination of activated items + leftover budget spent on cheapest
        // items
        var maxTotal = 0
        for (c in 0..budget) {
            if (dp[c] != -1) {
                // dp[c] gives us the activation items.
                // We buy the cheapest item repeatedly with the remaining budget.
                val currentTotal = dp[c] + (budget - c) / minPrice
                maxTotal = max(maxTotal, currentTotal)
            }
        }
        return maxTotal
    }
}
