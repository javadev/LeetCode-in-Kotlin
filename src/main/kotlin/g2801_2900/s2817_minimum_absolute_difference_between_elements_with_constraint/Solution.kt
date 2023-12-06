package g2801_2900.s2817_minimum_absolute_difference_between_elements_with_constraint

// #Medium #Array #Binary_Search #Ordered_Set
// #2023_12_06_Time_759_ms_(100.00%)_Space_75.2_MB_(100.00%)

import java.util.TreeSet
import kotlin.math.abs
import kotlin.math.min

class Solution {
    fun minAbsoluteDifference(nums: List<Int>, x: Int): Int {
        val xt = TreeSet<Int>()
        val start = nums.size - 1 - x
        var j = nums.size - 1
        var zx = Int.MAX_VALUE
        var i = start
        while (i >= 0) {
            val nowr = nums[j]
            xt.add(nowr)
            val now = nums[i]
            val xy = xt.floor(now)
            val dy = xt.ceiling(now)
            if (xy != null) {
                zx = min(zx.toDouble(), abs((xy - now).toDouble())).toInt()
            }
            if (dy != null) {
                zx = min(zx.toDouble(), abs((dy - now).toDouble())).toInt()
            }
            i--
            j--
        }
        return zx
    }
}
