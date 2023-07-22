package g0001_0100.s0006_zigzag_conversion

// #Medium #String #2023_07_03_Time_200_ms_(97.79%)_Space_37.3_MB_(91.71%)

class Solution {
    fun convert(s: String, numRows: Int): String {
        val sLen = s.length
        if (numRows == 1) {
            return s
        }
        val maxDist = numRows * 2 - 2
        val buf = StringBuilder()
        for (i in 0 until numRows) {
            var index = i
            if (i == 0 || i == numRows - 1) {
                while (index < sLen) {
                    buf.append(s[index])
                    index += maxDist
                }
            } else {
                while (index < sLen) {
                    buf.append(s[index])
                    index += maxDist - i * 2
                    if (index >= sLen) {
                        break
                    }
                    buf.append(s[index])
                    index += i * 2
                }
            }
        }
        return buf.toString()
    }
}
