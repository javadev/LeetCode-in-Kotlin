package g1301_1400.s1374_generate_a_string_with_characters_that_have_odd_counts

// #Easy #String #2023_06_06_Time_130_ms_(100.00%)_Space_34_MB_(80.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun generateTheString(n: Int): String {
        var n = n
        val sb = StringBuilder()
        if (n > 1 && n % 2 == 0) {
            while (n-- > 1) {
                sb.append("a")
            }
        } else if (n > 1) {
            while (n-- > 2) {
                sb.append("a")
            }
            sb.append("b")
        }
        sb.append("z")
        return sb.toString()
    }
}
