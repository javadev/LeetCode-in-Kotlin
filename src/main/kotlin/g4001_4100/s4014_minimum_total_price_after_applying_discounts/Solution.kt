package g4001_4100.s4014_minimum_total_price_after_applying_discounts

// #Medium #Array #Sorting #Greedy #Two_Pointers #Senior #Weekly_Contest_514
// #2026_11_17_Time_26_ms_(100.00%)_Space_140.09_MB_(97.57%)

class Solution {
    fun minPrice(prices: IntArray, discounts: IntArray): Double {
        val discount = IntArray(101)
        for (dis in discounts) {
            discount[dis]++
        }
        var maxprice = 0
        for (price in prices) {
            if (maxprice < price) {
                maxprice = price
            }
        }
        val price = IntArray(maxprice + 1)
        for (p in prices) {
            price[p]++
        }
        var ans = 0.0
        var i = pos(price, maxprice)
        var j = pos(discount, 100)
        while (i > 0) {
            ans += i - (i * j) / 100.0
            i = pos(price, i)
            j = pos(discount, j)
        }
        return ans
    }

    private fun pos(arr: IntArray, p: Int): Int {
        for (i in p downTo 1) {
            if (arr[i] > 0) {
                arr[i]--
                return i
            }
        }
        return 0
    }
}
