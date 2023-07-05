package g0001_0100.s0035_search_insert_position

// #Easy #Top_100_Liked_Questions #Array #Binary_Search #Algorithm_I_Day_1_Binary_Search
// #Binary_Search_I_Day_2 #2023_07_05_Time_159_ms_(93.03%)_Space_36.7_MB_(95.90%)

class Solution {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var lo = 0
        var hi = nums.size - 1
        while (lo <= hi) {
            val mid = lo + (hi - lo) / 2
            if (target == nums[mid]) {
                return mid
            } else if (target < nums[mid]) {
                hi = mid - 1
            } else if (target > nums[mid]) {
                lo = mid + 1
            }
        }
        return lo
    }
}
