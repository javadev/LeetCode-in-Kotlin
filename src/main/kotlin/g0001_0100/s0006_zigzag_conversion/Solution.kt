package g0001_0100.s0006_zigzag_conversion

class Solution {
    fun convert(s: String, numRows: Int): String {
        if (numRows == 1) return s
        val ret = StringBuilder()
        val n = s.length
        val cycleLen = 2 * numRows - 2
        for (i in 0 until numRows) {
            var j = 0
            while (j + i < n) {
                ret.append(s[j + i])
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n) {
                    ret.append(s[j + cycleLen - i])
                }
                j += cycleLen
            }
        }
        return ret.toString()
    }
}
