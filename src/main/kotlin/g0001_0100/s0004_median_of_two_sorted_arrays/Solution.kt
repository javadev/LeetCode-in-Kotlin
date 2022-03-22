package g0001_0100.s0004_median_of_two_sorted_arrays

// #Hard #Top_100_Liked_Questions #Top_Interview_Questions #Array #Binary_Search #Divide_and_Conquer
// #2022_03_22_Time_276_ms_(91.12%)_Space_47_MB_(85.71%)

import kotlin.collections.ArrayList

class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val l: MutableList<Int> = ArrayList()
        val f: Double
        for (j in nums1) {
            l.add(j)
        }
        for (i in nums2) {
            l.add(i)
        }
        l.sort()
        val k = l.size
        f = if (k % 2 == 0) {
            (l[k / 2 - 1] + l[k / 2]).toDouble() / 2
        } else {
            l[(k + 1) / 2 - 1].toDouble()
        }
        return f
    }
}
