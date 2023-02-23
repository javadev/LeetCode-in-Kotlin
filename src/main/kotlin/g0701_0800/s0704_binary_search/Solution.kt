package g0701_0800.s0704_binary_search

// #Easy #Array #Binary_Search #Algorithm_I_Day_1_Binary_Search #Binary_Search_I_Day_1
// #Level_1_Day_7_Binary_Search #Udemy_Binary_Search
// #2023_02_23_Time_261_ms_(77.91%)_Space_38.7_MB_(34.19%)

class Solution {
    fun search(nums: IntArray, target: Int): Int {
        val index = nums.binarySearch(target)
        return if (index >= 0) index else -1
    }
}