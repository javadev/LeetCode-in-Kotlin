package g1901_2000.s1910_remove_all_occurrences_of_a_substring

// #Medium #String
class Solution {
    fun removeOccurrences(s: String, part: String): String {
        val sb = StringBuilder()
        for (i in 0 until s.length) {
            sb.append(s[i])
            if (sb.length >= part.length && sb.substring(sb.length - part.length) == part) {
                sb.setLength(sb.length - part.length)
            }
        }
        return sb.toString()
    }
}
