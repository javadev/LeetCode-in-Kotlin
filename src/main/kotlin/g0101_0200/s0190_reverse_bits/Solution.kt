package g0101_0200.s0190_reverse_bits

// #Easy #Top_Interview_Questions #Bit_Manipulation #Divide_and_Conquer
// #Algorithm_I_Day_14_Bit_Manipulation #Udemy_Bit_Manipulation #Top_Interview_150_Bit_Manipulation
// #2022_10_18_Time_198_ms_(81.82%)_Space_32.8_MB_(73.86%)

@Suppress("NAME_SHADOWING")
class Solution {
    // you need treat n as an unsigned value
    fun reverseBits(n: Int): Int {
        var n = n
        var ret = 0
        // because there are 32 bits in total
        for (i in 0..31) {
            ret = ret shl 1
            // If the bit is 1 we OR it with 1, ie add 1
            if (n and 1 > 0) {
                ret = ret or 1
            }
            n = n ushr 1
        }
        return ret
    }
}
