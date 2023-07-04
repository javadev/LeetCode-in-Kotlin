package g2501_2600.s2540_minimum_common_value

// #Easy #Array #Hash_Table #Binary_Search #Two_Pointers
class Solution {
    fun getCommon(nums1: IntArray, nums2: IntArray): Int {
        var i = 0
        var j = 0
        if (nums1[0] > nums2[nums2.size - 1] || nums1[nums1.size - 1] < nums2[0]) {
            return -1
        }
        while (i < nums1.size && j < nums2.size) {
            if (nums1[i] == nums2[j]) {
                return nums1[i]
            }
            if (nums1[i] > nums2[j]) {
                j++
            } else {
                i++
            }
        }
        return -1
    }
}
