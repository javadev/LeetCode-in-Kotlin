package g1701_1800.s1798_maximum_number_of_consecutive_values_you_can_make

// #Medium #Array #Greedy #2023_06_18_Time_414_ms_(100.00%)_Space_49.1_MB_(100.00%)

class Solution {
    fun getMaximumConsecutive(coins: IntArray): Int {
        val count = IntArray(40001)
        for (c in coins) {
            count[c]++
        }
        var res = 1
        var i = 1
        while (i < count.size && i <= res) {
            res += i * count[i]
            i++
        }
        return res
    }
}
