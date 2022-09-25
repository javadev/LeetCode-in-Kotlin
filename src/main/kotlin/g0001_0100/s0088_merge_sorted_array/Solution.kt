package g0001_0100.s0088_merge_sorted_array

// #Easy #Top_Interview_Questions #Array #Sorting #Two_Pointers #Data_Structure_I_Day_2_Array
// #2022_09_25_Time_311_ms_(33.40%)_Space_35.7_MB_(57.76%)

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
