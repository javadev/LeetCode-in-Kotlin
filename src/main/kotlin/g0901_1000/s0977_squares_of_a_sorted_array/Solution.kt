package g0901_1000.s0977_squares_of_a_sorted_array

// #Easy #Array #Sorting #Two_Pointers #Algorithm_I_Day_2_Two_Pointers #Udemy_Two_Pointers
// #2023_10_02_Time_271_ms_(77.17%)_Space_41_MB_(61.94%)

import kotlin.math.abs

class Solution {
    fun sortedSquares(nums: IntArray): IntArray {
        var l = 0
        var r = nums.size - 1
        val res = IntArray(nums.size)
        // Iterate res from back to front. put the bigger of abs(l) * abs(l) and abs(r) * abs(r) at
        // res[i] and increment respectively
        for (i in nums.indices.reversed()) {
            // If the negative is larger, put it at the end and increment left ptr to next lower
            // negative
            if (abs(nums[l]) > nums[r]) {
                res[i] = nums[l] * nums[l]
                l++
            } else {
                res[i] = nums[r] * nums[r]
                r--
            }
        }
        return res
    }
}
