package g2801_2900.s2864_maximum_odd_binary_number

// #Easy #String #Math #Greedy #2023_12_21_Time_176_ms_(90.91%)_Space_37.3_MB_(63.64%)

class Solution {
    fun maximumOddBinaryNumber(s: String): String {
        var len = s.length
        var count = 0
        val sb = StringBuilder()
        for (i in 0 until len) {
            if (s[i] == '1') {
                count++
            }
        }
        if (count == len) {
            return s
        }
        len -= count
        while (count > 1) {
            sb.append('1')
            count--
        }
        while (len > 0) {
            sb.append('0')
            len--
        }
        sb.append('1')
        return sb.toString()
    }
}
