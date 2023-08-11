package g0001_0100.s0088_merge_sorted_array

// #Easy #Top_Interview_Questions #Array #Sorting #Two_Pointers #Data_Structure_I_Day_2_Array
// #2023_07_10_Time_170_ms_(69.74%)_Space_34.5_MB_(99.18%)

class Solution {
    fun merge(nums1: IntArray, m: Int, nums2: IntArray, n: Int) {
        var i = m - 1
        var j = nums1.size - 1
        var p2 = n - 1
        while (p2 >= 0) {
            if (i >= 0 && nums1[i] > nums2[p2]) {
                nums1[j--] = nums1[i--]
            } else {
                nums1[j--] = nums2[p2--]
            }
        }
    }
}
