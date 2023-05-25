package g0101_0200.s0153_find_minimum_in_rotated_sorted_array

// #Medium #Top_100_Liked_Questions #Array #Binary_Search #Algorithm_II_Day_2_Binary_Search
// #Binary_Search_I_Day_12 #Udemy_Binary_Search
// #2022_09_06_Time_262_ms_(60.96%)_Space_35.4_MB_(86.45%)

class Solution {
    private fun findMinUtil(nums: IntArray, l: Int, r: Int): Int {
        if (l == r) {
            return nums[l]
        }
        val mid = (l + r) / 2
        if (mid == l && nums[mid] < nums[r]) {
            return nums[l]
        }
        if (mid - 1 >= 0 && nums[mid - 1] > nums[mid]) {
            return nums[mid]
        }
        if (nums[mid] < nums[l]) {
            return findMinUtil(nums, l, mid - 1)
        } else if (nums[mid] > nums[r]) {
            return findMinUtil(nums, mid + 1, r)
        }
        return findMinUtil(nums, l, mid - 1)
    }

    fun findMin(nums: IntArray): Int {
        val l = 0
        val r = nums.size - 1
        return findMinUtil(nums, l, r)
    }
}
