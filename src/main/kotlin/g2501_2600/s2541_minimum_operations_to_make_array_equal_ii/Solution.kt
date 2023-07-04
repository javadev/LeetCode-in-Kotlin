package g2501_2600.s2541_minimum_operations_to_make_array_equal_ii

// #Medium #Array #Math #Greedy #2023_07_04_Time_521_ms_(100.00%)_Space_58.3_MB_(100.00%)

class Solution {
    fun minOperations(nums1: IntArray, nums2: IntArray, k: Int): Long {
        val n = nums1.size
        var pcnt: Long = 0
        var ncnt: Long = 0
        if (k == 0) {
            return if (nums1.contentEquals(nums2)) {
                0
            } else {
                -1
            }
        }
        for (i in 0 until n) {
            val tp = nums1[i] - nums2[i]
            if (tp % k != 0) {
                return -1
            }
            if (tp > 0) {
                pcnt += tp.toLong()
            } else if (tp < 0) {
                ncnt += tp.toLong()
            }
        }
        return if (pcnt + ncnt != 0L) {
            -1
        } else pcnt / k
    }
}
