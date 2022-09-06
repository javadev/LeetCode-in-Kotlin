package g0201_0300.s0283_move_zeroes

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Array #Two_Pointers
// #Algorithm_I_Day_3_Two_Pointers #Programming_Skills_I_Day_6_Array #Udemy_Arrays
// #2022_07_06_Time_2_ms_(79.54%)_Space_55.7_MB_(5.98%)
class Solution {
    fun moveZeroes(nums: IntArray) {
        var firstZero = 0
        for (i in nums.indices) {
            if (nums[i] != 0) {
                swap(firstZero, i, nums)
                firstZero++
            }
        }
    }

    private fun swap(index1: Int, index2: Int, numbers: IntArray) {
        val val2 = numbers[index2]
        numbers[index2] = numbers[index1]
        numbers[index1] = val2
    }
}
