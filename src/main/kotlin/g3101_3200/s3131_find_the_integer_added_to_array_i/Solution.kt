package g3101_3200.s3131_find_the_integer_added_to_array_i

// #Easy #Array #2024_05_02_Time_162_ms_(98.15%)_Space_36.3_MB_(100.00%)

class Solution {
    fun addedInteger(nums1: IntArray, nums2: IntArray): Int {
        val n1 = nums1.size
        var s1 = 0
        var s2 = 0
        for (i in nums1) {
            s1 += i
        }
        for (i in nums2) {
            s2 += i
        }
        return (s2 - s1) / n1
    }
}
