package g0001_0100.s0035_search_insert_position

// #Easy #Top_100_Liked_Questions #Array #Binary_Search #Algorithm_I_Day_1_Binary_Search
// #Binary_Search_I_Day_2 #2022_04_30_Time_267_ms_(50.32%)_Space_39.5_MB_(33.93%)

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
