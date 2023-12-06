package g2801_2900.s2808_minimum_seconds_to_equalize_a_circular_array

// #Medium #Array #Hash_Table #Greedy #2023_12_06_Time_847_ms_(50.00%)_Space_78.3_MB_(50.00%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun minimumSeconds(nums: List<Int>): Int {
        val n = nums.size
        var min = n / 2
        val hm = HashMap<Int, MutableList<Int>>()
        for (i in 0 until n) {
            val v = nums[i]
            hm.computeIfAbsent(v) { k: Int? -> ArrayList() }.add(i)
        }
        for (list in hm.values) {
            if (list.size > 1) {
                var curr = (list[0] + n - list[list.size - 1]) / 2
                for (i in 1 until list.size) {
                    curr = max(curr.toDouble(), ((list[i] - list[i - 1]) / 2).toDouble()).toInt()
                }
                min = min(min.toDouble(), curr.toDouble()).toInt()
            }
        }
        return min
    }
}
