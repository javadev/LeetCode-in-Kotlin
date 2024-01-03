package g2901_3000.s2934_minimum_operations_to_maximize_last_elements_in_arrays

// #Medium #Array #Greedy #2024_01_03_Time_243_ms_(81.25%)_Space_38.7_MB_(93.75%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun minOperations(nums1: IntArray, nums2: IntArray): Int {
        val n = nums1.size
        var count1 = 0
        var count2 = 0
        val max1 = min(nums1[n - 1], nums2[n - 1])
        val max2 = max(nums1[n - 1], nums2[n - 1])
        for (i in 0 until n) {
            val min = min(nums1[i], nums2[i])
            val max = max(nums1[i], nums2[i])
            if (max > max2 || min > max1) {
                return -1
            }
            if (max == nums1[i] && max != min && max > max1) {
                count1++
            }
            if (max == nums2[i] && max != min && max > max1) {
                count2++
            }
        }
        return min(count1, count2)
    }
}
