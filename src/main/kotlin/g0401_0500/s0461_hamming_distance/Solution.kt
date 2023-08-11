package g0401_0500.s0461_hamming_distance

// #Easy #Bit_Manipulation #Udemy_Bit_Manipulation
// #2022_12_27_Time_150_ms_(96.15%)_Space_32.9_MB_(92.31%)

class Solution {
    fun hammingDistance(x: Int, y: Int): Int {
        return Integer.bitCount(x xor y)
    }
}
