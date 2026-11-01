package g3901_4000.s3936_minimum_swaps_to_move_zeros_to_end

// #Easy #Array #Two_Pointers #Mid_Level #Biweekly_Contest_183
// #2026_09_29_Time_1_ms_(99.59%)_Space_46.22_MB_(83.18%)

class Solution {
    private fun swap(nums: IntArray, i: Int, j: Int) {
        val temp = nums[i]
        nums[i] = nums[j]
        nums[j] = temp
    }

    fun minimumSwaps(nums: IntArray): Int {
        val n = nums.size
        var count = 0
        var l = 0
        var r = n - 1
        while (l < r) {
            if (nums[l] == 0 && nums[r] != 0) {
                swap(nums, l, r)
                count++
                l++
                r--
            } else if (nums[l] != 0) {
                l++
            } else if (nums[r] == 0) {
                r--
            }
        }
        return count
    }
}
