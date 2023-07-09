package g2501_2600.s2570_merge_two_2d_arrays_by_summing_values

// #Easy #Array #Hash_Table #Two_Pointers #2023_07_09_Time_221_ms_(91.67%)_Space_41.8_MB_(41.67%)

class Solution {
    fun mergeArrays(nums1: Array<IntArray>, nums2: Array<IntArray>): Array<IntArray> {
        var p1 = 0
        var p2 = 0
        val result = mutableListOf<IntArray>()

        while (p1 < nums1.size) {
            if (p2 == nums2.size || nums1[p1][0] < nums2[p2][0]) {
                result.add(intArrayOf(nums1[p1][0], nums1[p1][1]))
                p1++
            } else if (nums1[p1][0] > nums2[p2][0]) {
                result.add(intArrayOf(nums2[p2][0], nums2[p2][1]))
                p2++
            } else {
                result.add(intArrayOf(nums1[p1][0], nums1[p1][1] + nums2[p2][1]))
                p1++
                p2++
            }
        }

        // Merge leftovers from nums2
        while (p2 < nums2.size) {
            result.add(intArrayOf(nums2[p2][0], nums2[p2][1]))
            p2++
        }

        return result.toTypedArray()
    }
}
