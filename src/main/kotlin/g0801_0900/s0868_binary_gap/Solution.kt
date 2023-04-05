package g0801_0900.s0868_binary_gap

// #Easy #Bit_Manipulation #2023_04_05_Time_142_ms_(100.00%)_Space_33.8_MB_(50.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun binaryGap(n: Int): Int {
        var n = n
        var max = 0
        var pos = 0
        var lastPos = -1
        while (n != 0) {
            pos++
            if (n and 1 == 1) {
                if (lastPos != -1) {
                    max = max.coerceAtLeast(pos - lastPos)
                }
                lastPos = pos
            }
            n = n shr 1
        }
        return max
    }
}
