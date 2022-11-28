package g0301_0400.s0393_utf_8_validation

// #Medium #Array #Bit_Manipulation #2022_11_28_Time_219_ms_(100.00%)_Space_37_MB_(88.89%)

class Solution {
    fun validUtf8(data: IntArray): Boolean {
        var count = 0
        for (d in data) {
            if (count == 0) {
                if (d shr 5 == 6) {
                    count = 1
                } else if (d shr 4 == 14) {
                    count = 2
                } else if (d shr 3 == 30) {
                    count = 3
                } else if (d shr 7 == 1) {
                    return false
                }
            } else {
                if (d shr 6 != 2) {
                    return false
                } else {
                    count--
                }
            }
        }
        return count == 0
    }
}
