package g0001_0100.s0089_gray_code

// #Medium #Math #Bit_Manipulation #Backtracking
// #2023_07_10_Time_271_ms_(69.23%)_Space_45.8_MB_(30.77%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun grayCode(n: Int): List<Int?> {
        var n = n
        var n1 = arrayOf<Int?>(0)
        var shift = 1
        while (n > 0) {
            val temp = arrayOfNulls<Int>(n1.size * 2)
            var pos = 0
            for (integer in n1) {
                temp[pos++] = integer
            }
            for (i in n1.indices.reversed()) {
                temp[pos++] = n1[i]!! or shift
            }
            n1 = temp
            shift = shift shl 1
            n--
        }
        return listOf(*n1)
    }
}
