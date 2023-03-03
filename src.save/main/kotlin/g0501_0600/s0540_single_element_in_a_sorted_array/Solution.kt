package g0501_0600.s0540_single_element_in_a_sorted_array

// #Medium #Array #Binary_Search #Binary_Search_II_Day_9
// #2023_01_16_Time_274_ms_(86.67%)_Space_44.4_MB_(83.33%)

class Solution {
    fun singleNonDuplicate(nums: IntArray): Int {
        var start = 0
        var end = nums.size - 1
        while (start < end) {
            val mid = start + (end - start) / 2
            if (mid + 1 < nums.size && nums[mid] != nums[mid + 1] && mid - 1 >= 0 && nums[mid] != nums[mid - 1]) {
                return nums[mid]
            } else if (mid + 1 < nums.size && nums[mid] == nums[mid + 1] && mid % 2 == 0) {
                start = mid + 1
            } else if (mid - 1 >= 0 && nums[mid] == nums[mid - 1] && mid % 2 == 1) {
                start = mid + 1
            } else {
                end = mid - 1
            }
        }
        return nums[start]
    }
}
