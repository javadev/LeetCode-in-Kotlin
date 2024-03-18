package g0301_0400.s0350_intersection_of_two_arrays_ii

// #Easy #Array #Hash_Table #Sorting #Binary_Search #Two_Pointers #Data_Structure_I_Day_3_Array
// #Binary_Search_I_Day_10 #2022_11_18_Time_321_ms_(73.37%)_Space_38.4_MB_(62.81%)

class Solution {
    fun intersect(nums1: IntArray, nums2: IntArray): IntArray {
        val a: MutableMap<Int, Int> = mutableMapOf()
        for (i in 0 until nums1.size) {
            a[nums1[i]] = a.getOrDefault(nums1[i], 0) + 1
        }
        var s = MutableList<Int>(0) { 0 }
        for (i in 0 until nums2.size) {
            if (a.getOrDefault(nums2[i], 0)> 0) {
                s.add(nums2[i])
                a[nums2[i]] = a.getValue(nums2[i]) - 1
            }
        }
        return s.toIntArray()
    }
}
