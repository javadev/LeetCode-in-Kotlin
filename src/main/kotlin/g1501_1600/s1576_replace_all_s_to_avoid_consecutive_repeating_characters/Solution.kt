package g1501_1600.s1576_replace_all_s_to_avoid_consecutive_repeating_characters

// #Easy #String #2023_06_14_Time_180_ms_(37.50%)_Space_35.3_MB_(87.50%)

class Solution {
    fun modifyString(s: String): String {
        val sb = StringBuilder()
        val len = s.length
        for (i in 0 until len) {
            val c = s[i]
            if (c == '?') {
                var replaceChar = 'a'
                val leftChar = if (i == 0) s[i] else sb[i - 1]
                val rightChar = s[Math.min(i + 1, len - 1)]
                while (replaceChar == leftChar || replaceChar == rightChar) {
                    replaceChar += 1.toChar().code
                }
                sb.append(replaceChar)
            } else {
                sb.append(c)
            }
        }
        return sb.toString()
    }
}
