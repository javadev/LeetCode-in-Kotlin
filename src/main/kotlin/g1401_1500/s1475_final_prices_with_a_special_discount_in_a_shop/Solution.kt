package g1401_1500.s1475_final_prices_with_a_special_discount_in_a_shop

// #Easy #Array #Stack #Monotonic_Stack
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
