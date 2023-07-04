package g2501_2600.s2517_maximum_tastiness_of_candy_basket

// #Medium #Array #Sorting #Binary_Search
class Solution {
    fun maximumTastiness(price: IntArray, k: Int): Int {
        price.sort()
        val n = price.size
        var left = 1
        var right = (price[n - 1] - price[0]) / (k - 1) + 1
        while (left < right) {
            val mid = left + (right - left) / 2
            if (check(mid, price, k)) {
                left = mid + 1
            } else {
                right = mid
            }
        }
        return left - 1
    }

    private fun check(target: Int, price: IntArray, k: Int): Boolean {
        var count = 1
        var x0 = price[0]
        for (x in price) {
            if (x >= x0 + target) {
                count++
                if (count >= k) {
                    return true
                }
                x0 = x
            }
        }
        return false
    }
}
