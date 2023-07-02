package g1801_1900.s1844_replace_all_digits_with_characters

// #Easy #String #2023_06_22_Time_137_ms_(100.00%)_Space_34.1_MB_(100.00%)

class Solution {
    fun replaceDigits(s: String): String {
        val sb = StringBuilder()
        for (c in s.toCharArray()) {
            if (Character.isAlphabetic(c.code)) {
                sb.append(c)
            } else {
                sb.append((sb[sb.length - 1].code + Character.getNumericValue(c)).toChar())
            }
        }
        return sb.toString()
    }
}
