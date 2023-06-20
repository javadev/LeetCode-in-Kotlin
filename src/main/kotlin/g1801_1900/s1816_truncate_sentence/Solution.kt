package g1801_1900.s1816_truncate_sentence

// #Easy #Array #String #2023_06_20_Time_147_ms_(94.74%)_Space_35.9_MB_(78.95%)

class Solution {
    fun truncateSentence(s: String, k: Int): String {
        val words = s.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        val sb = StringBuilder()
        for (i in 0 until k) {
            sb.append(words[i])
            sb.append(" ")
        }
        return sb.substring(0, sb.toString().length - 1)
    }
}
