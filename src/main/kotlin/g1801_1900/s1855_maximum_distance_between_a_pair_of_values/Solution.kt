package g1801_1900.s1855_maximum_distance_between_a_pair_of_values

// #Medium #Array #Greedy #Binary_Search #Two_Pointers #Binary_Search_I_Day_11
// #2023_10_02_Time_458_ms_(100.00%)_Space_55.7_MB_(50.00%)

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
