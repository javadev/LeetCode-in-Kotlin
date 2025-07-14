package g3601_3700.s3614_process_string_with_special_operations_ii

// #Hard #2025_07_14_Time_37_ms_(100.00%)_Space_50.21_MB_(100.00%)

class Solution {
    fun processStr(s: String, k: Long): Char {
        var k = k
        var len: Long = 0
        for (c in s.toCharArray()) {
            if (Character.isLowerCase(c)) {
                len++
            } else if (c == '*' && len > 0) {
                len--
            } else if (c == '#') {
                len *= 2
            }
        }
        if (k >= len) {
            return '.'
        }
        for (i in s.length - 1 downTo 0) {
            val c = s[i]
            if (Character.isLowerCase(c)) {
                if (k == len - 1) {
                    return c
                }
                len--
            } else if (c == '*') {
                len++
            } else if (c == '#') {
                len /= 2
                if (k >= len) {
                    k -= len
                }
            } else if (c == '%') {
                k = len - 1 - k
            }
        }
        return '.'
    }
}
