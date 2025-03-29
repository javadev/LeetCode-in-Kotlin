package g2801_2900.s2815_max_pair_sum_in_an_array

// #Easy #Array #Hash_Table #2023_12_06_Time_223_ms_(82.35%)_Space_37.6_MB_(100.00%)

import java.util.PriorityQueue
import kotlin.math.max

@Suppress("NAME_SHADOWING")
class Solution {
    fun maxSum(nums: IntArray): Int {
        // what we'll return
        var maxSum = -1
        val maximumDigitToNumber: MutableMap<Int, PriorityQueue<Int>> = HashMap()
        for (i in 1..9) {
            maximumDigitToNumber[i] = PriorityQueue(Comparator.reverseOrder())
        }
        for (n in nums) {
            maximumDigitToNumber[getMaximumDigit(n)]!!.add(n)
        }
        for ((_, value) in maximumDigitToNumber) {
            if (value.size <= 1) {
                continue
            }
            val sum = value.poll() + value.poll()
            maxSum = max(maxSum, sum)
        }
        return maxSum
    }

    private fun getMaximumDigit(n: Int): Int {
        var n = n
        var maxDigit = 1
        var nMod10 = n % 10
        while (n > 0) {
            maxDigit = max(maxDigit.toDouble(), nMod10.toDouble()).toInt()
            n /= 10
            nMod10 = n % 10
        }
        return maxDigit
    }
}
