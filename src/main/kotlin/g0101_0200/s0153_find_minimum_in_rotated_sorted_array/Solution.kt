package g0101_0200.s0153_find_minimum_in_rotated_sorted_array

// #Medium #Top_100_Liked_Questions #Array #Binary_Search #Algorithm_II_Day_2_Binary_Search
// #Binary_Search_I_Day_12 #Udemy_Binary_Search
// #2022_09_06_Time_240_ms_(75.30%)_Space_35.2_MB_(94.82%)

class Solution {
    /**
     * My completely original solution on 10/23/2021.
     * Again, using a pen and paper to visualize your thought process, to draw out all the possible cases helps a lot!
     */
    fun findMin(nums: IntArray): Int {
        var left = 0
        var right = nums.size - 1
        while (left < right) {
            val mid = left + (right - left) / 2
            if (mid == left || mid == right) {
                // this is to avoid infinite loop
                break
            }
            if (nums[mid] > nums[left] && nums[mid] > nums[right]) {
                left = mid + 1
            } else if (nums[mid] < nums[right] && nums[mid] > nums[left]) {
                right = mid - 1
            } else if (nums[mid] < nums[left] && nums[mid] < nums[right]) {
                right = mid
            }
        }
        return if (right >= 0) if (nums[left] < nums[right]) nums[left] else nums[right] else nums[left]
    }
}
