package g1801_1900.s1833_maximum_ice_cream_bars

// #Medium #Array #Sorting #Greedy #2023_06_21_Time_439_ms_(100.00%)_Space_53.7_MB_(100.00%)

class Solution {
    fun maxIceCream(costs: IntArray, coins: Int): Int {
        val arr = IntArray(100001)
        for (cost in costs) arr[cost]++
        var (result, money) = Pair(0, coins)
        for ((coin, count) in arr.withIndex()) {
            if (count > 0) {
                val c = minOf(money / coin, count)
                money -= coin * c
                result += c
            }
        }
        return result
    }
}
