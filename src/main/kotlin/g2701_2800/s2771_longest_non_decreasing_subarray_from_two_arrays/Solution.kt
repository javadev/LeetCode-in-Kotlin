package g2701_2800.s2771_longest_non_decreasing_subarray_from_two_arrays

// #Medium #Array #Dynamic_Programming #2023_08_11_Time_665_ms_(96.88%)_Space_77.8_MB_(53.13%)

class Solution {
    fun maxNonDecreasingLength(nums1: IntArray, nums2: IntArray): Int {
        var res = 1
        var dp1 = 1
        var dp2 = 1
        val n = nums1.size
        var t11: Int
        var t12: Int
        var t21: Int
        var t22: Int
        for (i in 1 until n) {
            t11 = if (nums1[i - 1] <= nums1[i]) dp1 + 1 else 1
            t12 = if (nums1[i - 1] <= nums2[i]) dp1 + 1 else 1
            t21 = if (nums2[i - 1] <= nums1[i]) dp2 + 1 else 1
            t22 = if (nums2[i - 1] <= nums2[i]) dp2 + 1 else 1
            dp1 = Math.max(t11, t21)
            dp2 = Math.max(t12, t22)
            res = Math.max(res, Math.max(dp1, dp2))
        }
        return res
    }
}
