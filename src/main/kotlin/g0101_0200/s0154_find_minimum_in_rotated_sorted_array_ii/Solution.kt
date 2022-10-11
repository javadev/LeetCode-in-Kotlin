package g0101_0200.s0154_find_minimum_in_rotated_sorted_array_ii

// #Hard #Array #Binary_Search #Binary_Search_II_Day_13
// #2022_10_11_Time_275_ms_(84.00%)_Space_39_MB_(56.00%)

class Solution {
    fun findMin(nums: IntArray): Int {
        return if (nums.isEmpty()) {
            0
        } else find(0, nums.size - 1, nums)
    }

    private fun find(left: Int, right: Int, nums: IntArray): Int {
        if (left + 1 >= right) {
            return Math.min(nums[left], nums[right])
        }
        val mid = left + (right - left) / 2
        if (nums[left] == nums[right] && nums[left] == nums[mid]) {
            return Math.min(find(left, mid, nums), find(mid, right, nums))
        }
        return if (nums[left] >= nums[right]) {
            if (nums[mid] >= nums[left]) {
                find(mid, right, nums)
            } else {
                find(left, mid, nums)
            }
        } else {
            find(left, mid, nums)
        }
    }
}
