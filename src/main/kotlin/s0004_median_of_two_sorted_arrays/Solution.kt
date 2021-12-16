package s0004_median_of_two_sorted_arrays

class Solution {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        val array = IntArray(nums1.size + nums2.size)
        var p = 0
        var q = 0
        for (i in array.indices) {
            if ((p < nums1.size && q < nums2.size && nums1[p] <= nums2[q]) || q == nums2.size) {
                array[i] = nums1[p]
                p++
            } else if ((p < nums1.size && q < nums2.size && nums1[p] > nums2[q]) || p == nums1.size) {
                array[i] = nums2[q]
                q++
            }
        }
        if (array.size % 2 == 0) {
            return (array[array.size / 2] + array[(array.size / 2) - 1]).toDouble() / 2
        } else {
            return array[array.size / 2].toDouble()
        }
    }
}
