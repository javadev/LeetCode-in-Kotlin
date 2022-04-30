package g0001_0100.s0034_find_first_and_last_position_of_element_in_sorted_array

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Binary_Search
// #Algorithm_II_Day_1_Binary_Search #Binary_Search_I_Day_5
// #2022_04_30_Time_228_ms_(83.38%)_Space_39.6_MB_(85.97%)

class Solution constructor() {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        var l = 0
        var r: Int = nums.size - 1
        var ans = IntArray(2)
        ans[0] = helper(nums, target, false)
        ans[1] = helper(nums, target, true)
        return ans
    }

    private fun helper(nums: IntArray, target: Int, equals: Boolean): Int {
        var l = 0
        var r: Int = nums.size - 1
        var result: Int = -1
        while (l <= r) {
            val mid: Int = l + (r - l) / 2
            if (nums[mid] == target) {
                result = mid
            }
            if (nums[mid] < target || (nums[mid] == target && equals)) {
                l = mid + 1
            } else {
                r = mid - 1
            }
        }
        return result
    }
}
