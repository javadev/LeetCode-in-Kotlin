package g0001_0100.s0033_search_in_rotated_sorted_array

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Binary_Search
// #Algorithm_II_Day_1_Binary_Search #Binary_Search_I_Day_11 #Level_2_Day_8_Binary_Search
// #Udemy_Binary_Search #2023_07_05_Time_151_ms_(93.77%)_Space_34.5_MB_(94.08%)

class Solution {
    fun search(nums: IntArray, target: Int): Int {
        var mid: Int
        var lo = 0
        var hi = nums.size - 1
        while (lo <= hi) {
            mid = (hi - lo shr 1) + lo
            if (target == nums[mid]) {
                return mid
            }
            // if this is true, then the possible rotation can only be in the second half
            if (nums[lo] <= nums[mid]) {
                // the target is in the first half only if it's
                if (nums[lo] <= target && target <= nums[mid]) {
                    // included
                    hi = mid - 1
                } else {
                    // between nums[lo] and nums[mid]
                    lo = mid + 1
                }
                // otherwise, the possible rotation can only be in the first half
            } else if (nums[mid] <= target && target <= nums[hi]) {
                // the target is in the second half only if it's included
                lo = mid + 1
            } else {
                // between nums[hi] and nums[mid]
                hi = mid - 1
            }
        }
        return -1
    }
}
