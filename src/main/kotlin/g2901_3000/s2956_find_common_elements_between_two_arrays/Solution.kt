package g2901_3000.s2956_find_common_elements_between_two_arrays

// #Easy #Array #Hash_Table #2024_01_16_Time_271_ms_(94.20%)_Space_40.7_MB_(95.65%)

class Solution {
    fun findIntersectionValues(nums1: IntArray, nums2: IntArray): IntArray {
        val freq2 = IntArray(101)
        val freq1 = IntArray(101)
        val ans = IntArray(2)
        for (j in nums2) {
            freq2[j] = 1
        }
        for (j in nums1) {
            freq1[j] = 1
            ans[0] = ans[0] + freq2[j]
        }
        for (j in nums2) {
            ans[1] = ans[1] + freq1[j]
        }
        return ans
    }
}
