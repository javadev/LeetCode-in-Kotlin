package g2101_2200.s2185_counting_words_with_a_given_prefix

// #Easy #Array #String
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
