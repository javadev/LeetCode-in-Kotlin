package g2601_2700.s2683_neighboring_bitwise_xor

// #Medium #Array #Bit_Manipulation #2023_07_28_Time_988_ms_(100.00%)_Space_76.1_MB_(100.00%)

class Solution {
    fun doesValidArrayExist(derived: IntArray): Boolean {
        var xor = 0
        for (j in derived) {
            xor = xor xor j
        }
        return xor == 0
    }
}
