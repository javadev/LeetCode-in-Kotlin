package g1401_1500.s1455_check_if_a_word_occurs_as_a_prefix_of_any_word_in_a_sentence

// #Easy #String #String_Matching #2023_06_13_Time_155_ms_(42.86%)_Space_35.3_MB_(100.00%)

class Solution {
    fun isPrefixOfWord(sentence: String, searchWord: String): Int {
        val words = sentence.split(" ").dropLastWhile { it.isEmpty() }.toTypedArray()
        for (i in words.indices) {
            if (words[i].startsWith(searchWord)) {
                return i + 1
            }
        }
        return -1
    }
}
