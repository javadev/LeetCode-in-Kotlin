package g0201_0300.s0215_kth_largest_element_in_an_array

import java.util.Arrays

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Sorting #Heap_Priority_Queue
// #Divide_and_Conquer #Quickselect #Data_Structure_II_Day_20_Heap_Priority_Queue
// #2022_07_02_Time_5_ms_(70.82%)_Space_45.1_MB_(24.69%)
class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        val n = nums.size
        Arrays.sort(nums)
        return nums[n - k]
    }
}
