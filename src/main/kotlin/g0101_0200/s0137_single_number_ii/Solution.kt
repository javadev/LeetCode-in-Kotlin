package g0101_0200.s0137_single_number_ii

// #Medium #Array #Bit_Manipulation #Top_Interview_150_Bit_Manipulation
// #2022_10_09_Time_344_ms_(64.29%)_Space_38.4_MB_(92.86%)

class Solution {
    fun singleNumber(nums: IntArray): Int {
        var ones = 0
        var twos = 0
        for (num in nums) {
            ones = ones xor num and twos.inv()
            twos = twos xor num and ones.inv()
        }
        return ones
    }
}
