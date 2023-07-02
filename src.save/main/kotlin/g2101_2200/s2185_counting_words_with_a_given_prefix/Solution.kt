package g2101_2200.s2185_counting_words_with_a_given_prefix

// #Easy #Array #String #2023_06_26_Time_172_ms_(100.00%)_Space_37.1_MB_(92.86%)

class Solution {
    fun prefixCount(words: Array<String>, pref: String?): Int {
        var count = 0
        for (s in words) {
            if (s.startsWith(pref!!)) {
                count++
            }
        }
        return count
    }
}
