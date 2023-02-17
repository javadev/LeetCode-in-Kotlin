package g0601_0700.s0686_repeated_string_match

// #Medium #String #String_Matching #2023_02_17_Time_164_ms_(100.00%)_Space_35.5_MB_(50.00%)

class Solution {
    fun repeatedStringMatch(a: String, b: String): Int {
        val existsChar = CharArray(127)
        for (chA in a.toCharArray()) {
            existsChar[chA.toInt()] = 1.toChar()
        }
        for (chB in b.toCharArray()) {
            if (existsChar[chB.toInt()].toInt() < 1) {
                return -1
            }
        }
        val lenB = b.length - 1
        val sb = StringBuilder(a)
        var lenSbA = sb.length - 1
        var repeatCount = 1
        while (lenSbA < lenB) {
            sb.append(a)
            repeatCount++
            lenSbA = sb.length - 1
        }
        if (!isFound(sb, b)) {
            sb.append(a)
            repeatCount++
            return if (!isFound(sb, b)) -1 else repeatCount
        }
        return repeatCount
    }

    private fun isFound(a: StringBuilder, b: String): Boolean {
        for (i in a.indices) {
            var k = i
            var m = 0
            while (k < a.length && m < b.length) {
                if (a[k] != b[m]) {
                    break
                } else {
                    k++
                    m++
                }
            }
            if (m == b.length) {
                return true
            }
        }
        return false
    }
}
