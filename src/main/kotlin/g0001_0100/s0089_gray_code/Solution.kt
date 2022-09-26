package g0001_0100.s0089_gray_code

// #Medium #Math #Bit_Manipulation #Backtracking
// #2022_09_26_Time_528_ms_(62.86%)_Space_61.8_MB_(88.57%)

import java.util.Arrays

class Solution {
    fun grayCode(n: Int): List<Int> {
        var n = n
        var n1 = arrayOf<Int?>(0)
        var shift = 1
        while (n > 0) {
            val temp = arrayOfNulls<Int>(n1.size * 2)
            var pos = 0
            for (integer in n1) {
                temp[pos++] = integer
            }
            for (i in 0..n1.size - 1) {
                temp[pos++] = n1[n1.size - i - 1]!! or shift
            }
            n1 = temp
            shift = shift shl 1
            n--
        }
        return Arrays.asList(*n1) as List<Int>
    }
}
