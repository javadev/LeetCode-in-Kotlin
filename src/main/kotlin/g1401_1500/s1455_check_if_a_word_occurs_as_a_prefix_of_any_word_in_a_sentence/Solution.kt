package g1401_1500.s1455_check_if_a_word_occurs_as_a_prefix_of_any_word_in_a_sentence

// #Easy #String #String_Matching
class Solution {
    fun isPrefixOfWord(sentence: String, searchWord: String?): Int {
        val words = sentence.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        for (i in words.indices) {
            if (words[i].startsWith(searchWord!!)) {
                return i + 1
            }
        }
        return -1
    }
}
