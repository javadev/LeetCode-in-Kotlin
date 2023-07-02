package g1801_1900.s1818_minimum_absolute_sum_difference

// #Medium #Array #Sorting #Binary_Search #Ordered_Set #Binary_Search_II_Day_7
// #2023_06_20_Time_447_ms_(100.00%)_Space_53_MB_(100.00%)

import kotlin.math.abs

class Solution {
    fun minAbsoluteSumDiff(nums1: IntArray, nums2: IntArray): Int {
        var min = Int.MAX_VALUE
        var max = Int.MIN_VALUE
        for (i in nums1.indices) {
            min = min.coerceAtMost(nums1[i].coerceAtMost(nums2[i]))
            max = max.coerceAtLeast(nums1[i].coerceAtLeast(nums2[i]))
        }
        val less = IntArray(max - min + 1)
        val more = IntArray(max - min + 1)
        less[0] = -max - 1
        more[more.size - 1] = max + 1 shl 1
        for (num in nums1) {
            less[num - min] = num
            more[num - min] = num
        }
        for (i in 1 until less.size) {
            if (less[i] == 0) {
                less[i] = less[i - 1]
            }
        }
        for (i in more.size - 2 downTo 0) {
            if (more[i] == 0) {
                more[i] = more[i + 1]
            }
        }
        var total = 0
        var preSave = 0
        for (i in nums1.indices) {
            val current = abs(nums1[i] - nums2[i])
            total += current
            val save = (
                current -
                    abs(less[nums2[i] - min] - nums2[i]).coerceAtMost(abs(more[nums2[i] - min] - nums2[i]))
                )
            if (save > preSave) {
                total = total + preSave - save
                preSave = save
            }
            total %= 1000000007
        }
        return total
    }
}
