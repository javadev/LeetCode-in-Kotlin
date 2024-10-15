package g3301_3400.s3315_construct_the_minimum_bitwise_array_ii

// #Medium #Array #Bit_Manipulation #2024_10_15_Time_231_ms_(77.27%)_Space_37.1_MB_(93.18%)

class Solution {
    fun minBitwiseArray(nums: List<Int>): IntArray {
        val n = nums.size
        val result = IntArray(n)
        for (i in 0 until n) {
            val num: Int = nums[i]
            result[i] = -1
            var p = 0
            while (p < 31) {
                if (((num shr p) and 1) == 0) {
                    break
                }
                p++
            }
            if (p > 0) {
                result[i] = ((num shr p) shl p) or ((1 shl (p - 1)) - 1)
            }
        }
        return result
    }
}
