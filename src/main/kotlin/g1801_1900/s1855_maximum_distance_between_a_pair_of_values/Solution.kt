package g1801_1900.s1855_maximum_distance_between_a_pair_of_values

// #Medium #Array #Greedy #Binary_Search #Two_Pointers #Binary_Search_I_Day_11
// #2023_06_22_Time_541_ms_(14.29%)_Space_54.8_MB_(85.71%)

class Solution {
    fun maxDistance(nums1: IntArray, nums2: IntArray): Int {
        val n = nums1.size
        val m = nums2.size
        var po1 = 0
        var po2 = 0
        var res = 0
        while (po1 < n && po2 < m) {
            if (nums1[po1] > nums2[po2]) {
                po1++
            } else {
                if (po2 != po1) {
                    res = Math.max(res, po2 - po1)
                }
                po2++
            }
        }
        return res
    }
}
