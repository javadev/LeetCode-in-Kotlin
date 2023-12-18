package g2801_2900.s2828_check_if_a_string_is_an_acronym_of_words

// #Easy #Array #String #2023_12_18_Time_180_ms_(90.14%)_Space_37.7_MB_(45.07%)

class Solution {
    fun isAcronym(words: List<String>, s: String): Boolean {
        if (s.length != words.size) {
            return false
        }
        for (i in words.indices) {
            if (words[i][0] != s[i]) {
                return false
            }
        }
        return true
    }
}
