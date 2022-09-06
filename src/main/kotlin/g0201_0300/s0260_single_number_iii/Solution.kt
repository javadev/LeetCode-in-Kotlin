package g0201_0300.s0260_single_number_iii

// #Medium #Array #Bit_Manipulation #2022_07_05_Time_1_ms_(100.00%)_Space_44.5_MB_(77.86%)
class Solution {
    fun singleNumber(nums: IntArray): IntArray {
        var xorSum = 0
        for (num in nums) {
            // will give xor of required nos
            xorSum = xorSum xor num
        }
        // find rightmost bit which is set
        val rightBit = xorSum and -xorSum
        var a = 0
        for (num in nums) {
            // xor only those number whose rightmost bit is set
            if (num and rightBit != 0) {
                a = a xor num
            }
        }
        return intArrayOf(a, a xor xorSum)
    }
}
