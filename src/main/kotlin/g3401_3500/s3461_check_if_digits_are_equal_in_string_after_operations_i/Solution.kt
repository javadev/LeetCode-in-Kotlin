package g3401_3500.s3461_check_if_digits_are_equal_in_string_after_operations_i

// #Easy #String #Math #Simulation #Number_Theory #Combinatorics
// #2025_02_25_Time_3_ms_(100.00%)_Space_35.54_MB_(100.00%)

class Solution {
    fun hasSameDigits(s: String): Boolean {
        val ch = s.toCharArray()
        var k = ch.size - 1
        while (k != 1) {
            for (i in 0..<k) {
                val a = ch[i].code - 48
                val b = ch[i + 1].code - 48
                val d = (a + b) % 10
                val c = (d + '0'.code).toChar()
                ch[i] = c
            }
            k--
        }
        return ch[0] == ch[1]
    }
}
