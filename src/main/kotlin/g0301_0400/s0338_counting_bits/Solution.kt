package g0301_0400.s0338_counting_bits

// #Easy #Top_100_Liked_Questions #Dynamic_Programming #Bit_Manipulation #Udemy_Bit_Manipulation
// #2022_09_16_Time_413_ms_(26.03%)_Space_45.2_MB_(34.93%)

class Solution {
    fun countBits(num: Int): IntArray {
        val result = IntArray(num + 1)
        var borderPos = 1
        var incrPos = 1
        for (i in 1 until result.size) {
            // when we reach pow of 2 ,  reset borderPos and incrPos
            if (incrPos == borderPos) {
                result[i] = 1
                incrPos = 1
                borderPos = i
            } else {
                result[i] = 1 + result[incrPos++]
            }
        }
        return result
    }
}
