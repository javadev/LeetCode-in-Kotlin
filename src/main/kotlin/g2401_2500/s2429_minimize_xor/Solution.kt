package g2401_2500.s2429_minimize_xor

// #Medium #Greedy #Bit_Manipulation #2023_07_05_Time_117_ms_(100.00%)_Space_33_MB_(100.00%)

class Solution {
    fun minimizeXor(num1: Int, num2: Int): Int {
        var bits = Integer.bitCount(num2)
        var result = 0
        run {
            var i = 30
            while (i >= 0 && bits > 0) {
                if (1 shl i and num1 != 0) {
                    --bits
                    result = result xor (1 shl i)
                }
                --i
            }
        }
        var i = 0
        while (i <= 30 && bits > 0) {
            if (1 shl i and num1 == 0) {
                --bits
                result = result xor (1 shl i)
            }
            ++i
        }
        return result
    }
}
