package g3401_3500.s3461_check_if_digits_are_equal_in_string_after_operations_i

// #Easy #2025_02_23_Time_8_ms_(100.00%)_Space_37.90_MB_(100.00%)

class Solution {
    fun hasSameDigits(s: String): Boolean {
        var s = s
        var n = s.length
        while (n > 2) {
            val nstr = StringBuilder()
            for (i in 1..<n) {
                val next = ((s[i].code - '0'.code) + (s[i - 1].code - '0'.code)) % 10
                nstr.append(next)
            }
            n--
            s = nstr.toString()
        }
        return s[0] == s[1]
    }
}
