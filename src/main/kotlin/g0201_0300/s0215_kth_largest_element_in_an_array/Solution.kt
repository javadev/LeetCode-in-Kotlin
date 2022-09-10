package g0201_0300.s0215_kth_largest_element_in_an_array

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Sorting #Heap_Priority_Queue
// #Divide_and_Conquer #Quickselect #Data_Structure_II_Day_20_Heap_Priority_Queue
// #2022_09_10_Time_839_ms_(34.43%)_Space_72.5_MB_(26.95%)

import java.util.Arrays

class Solution {
    fun findKthLargest(nums: IntArray, k: Int): Int {
        val n = nums.size
        Arrays.sort(nums)
        return nums[n - k]
    }
}
