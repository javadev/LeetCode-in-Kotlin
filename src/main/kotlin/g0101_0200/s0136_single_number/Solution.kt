package g0101_0200.s0136_single_number

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Array #Bit_Manipulation
// #Data_Structure_II_Day_1_Array #Algorithm_I_Day_14_Bit_Manipulation #Udemy_Integers
// #Top_Interview_150_Bit_Manipulation #Big_O_Time_O(N)_Space_O(1)
// #2022_09_03_Time_344_ms_(83.63%)_Space_47.6_MB_(82.58%)

class Solution {
    fun singleNumber(nums: IntArray): Int {
        var num = 0
        for (x in nums) {
            num = num xor x
        }
        return num
    }
}
