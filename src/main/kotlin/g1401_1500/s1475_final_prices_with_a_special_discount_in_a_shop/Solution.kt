package g1401_1500.s1475_final_prices_with_a_special_discount_in_a_shop

// #Easy #Array #Stack #Monotonic_Stack #2023_06_13_Time_182_ms_(94.12%)_Space_37.2_MB_(41.18%)

class Solution {
    fun finalPrices(prices: IntArray): IntArray {
        val result = IntArray(prices.size)
        for (i in prices.indices) {
            var foundDiscount = false
            for (j in i + 1 until prices.size) {
                if (prices[j] <= prices[i]) {
                    result[i] = prices[i] - prices[j]
                    foundDiscount = true
                    break
                }
            }
            if (!foundDiscount) {
                result[i] = prices[i]
            }
        }
        result[prices.size - 1] = prices[prices.size - 1]
        return result
    }
}
