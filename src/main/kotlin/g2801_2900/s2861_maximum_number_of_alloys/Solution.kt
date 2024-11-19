package g2801_2900.s2861_maximum_number_of_alloys

// #Medium #Array #Binary_Search #2023_12_21_Time_289_ms_(100.00%)_Space_43.8_MB_(100.00%)

import kotlin.math.max

class Solution {
    fun maxNumberOfAlloys(
        n: Int,
        k: Int,
        budget: Int,
        composition: List<List<Int>>,
        stock: List<Int>,
        cost: List<Int>,
    ): Int {
        var ans = 0
        var max = 0
        for (i in 0 until n) {
            max = max(stock[i].toDouble(), max.toDouble()).toInt()
        }
        for (i in 0 until k) {
            var temp = 0
            var low = 0
            var high = max + budget
            var mid: Int
            while (low <= high) {
                mid = low + (high - low) / 2
                if (isPos(i, mid, n, budget, composition, stock, cost)) {
                    low = mid + 1
                    temp = mid
                } else {
                    high = mid - 1
                }
            }
            ans = max(ans.toDouble(), temp.toDouble()).toInt()
        }
        return ans
    }

    private fun isPos(
        idx: Int,
        mid: Int,
        n: Int,
        budget: Int,
        composition: List<List<Int>>,
        stock: List<Int>,
        cost: List<Int>,
    ): Boolean {
        var paiSa = 0L
        for (i in 0 until n) {
            val require = (composition[idx][i].toLong()) * (mid)
            val have = stock[i].toLong()
            val diff = require - have
            if (diff > 0) {
                paiSa += diff * (cost[i].toLong())
            }
            if (budget < paiSa) {
                return false
            }
        }
        return budget >= paiSa
    }
}
