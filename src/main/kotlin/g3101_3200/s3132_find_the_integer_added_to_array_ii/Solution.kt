package g3101_3200.s3132_find_the_integer_added_to_array_ii

// #Medium #Array #Sorting #Two_Pointers #Enumeration
// #2024_05_02_Time_2_ms_(100.00%)_Space_42.3_MB_(96.46%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun minimumAddedInteger(nums1: IntArray, nums2: IntArray): Int {
        nums1.sort()
        nums2.sort()
        return if (checkOk(nums1, nums2, 2)) {
            nums2[0] - nums1[2]
        } else if (checkOk(nums1, nums2, 1)) {
            nums2[0] - nums1[1]
        } else {
            nums2[0] - nums1[0]
        }
    }

    private fun checkOk(nums1: IntArray, nums2: IntArray, start: Int): Boolean {
        var start = start
        var i = 0
        val diff = nums2[i] - nums1[start]
        while (i < nums2.size) {
            if (start - i > 2) {
                return false
            }
            if (nums2[i] == nums1[start] + diff) {
                i++
            }
            start++
        }
        return i == nums2.size
    }
}
