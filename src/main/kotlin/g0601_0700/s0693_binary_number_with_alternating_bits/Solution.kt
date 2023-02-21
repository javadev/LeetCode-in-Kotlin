package g0601_0700.s0693_binary_number_with_alternating_bits

// #Easy #Bit_Manipulation #2023_02_21_Time_129_ms_(100.00%)_Space_32.8_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun hasAlternatingBits(n: Int): Boolean {
        var n = n
        var prev = -1
        while (n != 0) {
            val v = n and 1
            n = n shr 1
            if (prev == v) {
                return false
            }
            prev = v
        }
        return true
    }
}
