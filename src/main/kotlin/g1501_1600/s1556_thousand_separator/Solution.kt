package g1501_1600.s1556_thousand_separator

// #Easy #String #2023_06_14_Time_131_ms_(100.00%)_Space_33.2_MB_(100.00%)

class Solution {
    fun thousandSeparator(n: Int): String {
        val str = n.toString()
        val sb = StringBuilder()
        var i = str.length - 1
        var j = 1
        while (i >= 0) {
            sb.append(str[i])
            j++
            if (j % 3 == 0) {
                sb.append(".")
            }
            i--
            j++
        }
        var result = sb.reverse().toString()
        if (result[0] == '.') {
            result = result.substring(1)
        }
        return result
    }
}