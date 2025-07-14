package g0001_0100.s0004_median_of_two_sorted_arrays

// #Hard #Top_100_Liked_Questions #Top_Interview_Questions #Array #Binary_Search #Divide_and_Conquer
// #Top_Interview_150_Binary_Search #Big_O_Time_O(log(min(N,M)))_Space_O(1)
// #AI_can_be_used_to_solve_the_task #2025_07_11_Time_2_ms_(99.23%)_Space_51.04_MB_(73.69%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        if (nums2.size < nums1.size) {
            return findMedianSortedArrays(nums2, nums1)
        }
        val n1 = nums1.size
        val n2 = nums2.size
        var low = 0
        var high = n1
        while (low <= high) {
            val cut1 = (low + high) / 2
            val cut2 = ((n1 + n2 + 1) / 2) - cut1
            val l1 = if (cut1 == 0) Int.MIN_VALUE else nums1[cut1 - 1]
            val l2 = if (cut2 == 0) Int.MIN_VALUE else nums2[cut2 - 1]
            val r1 = if (cut1 == n1) Int.MAX_VALUE else nums1[cut1]
            val r2 = if (cut2 == n2) Int.MAX_VALUE else nums2[cut2]
            if (l1 <= r2 && l2 <= r1) {
                return if ((n1 + n2) % 2 == 0) {
                    (max(l1, l2).toDouble() + min(r1, r2).toDouble()) / 2.0
                } else {
                    max(l1, l2).toDouble()
                }
            } else if (l1 > r2) {
                high = cut1 - 1
            } else {
                low = cut1 + 1
            }
        }
        return 0.0
    }
}
