package g2701_2800.s2706_buy_two_chocolates

// #Easy #Array #Sorting #2023_07_29_Time_187_ms_(96.43%)_Space_39.9_MB_(46.43%)

class Solution {
    fun buyChoco(prices: IntArray, money: Int): Int {
        var minPrice1 = Int.MAX_VALUE
        var minPrice2 = Int.MAX_VALUE
        for (price in prices) {
            if (price < minPrice1) {
                minPrice2 = minPrice1
                minPrice1 = price
            } else if (price < minPrice2) {
                minPrice2 = price
            }
        }
        val totalPrice = minPrice1 + minPrice2
        return if (totalPrice > money) {
            money
        } else {
            money - totalPrice
        }
    }
}
