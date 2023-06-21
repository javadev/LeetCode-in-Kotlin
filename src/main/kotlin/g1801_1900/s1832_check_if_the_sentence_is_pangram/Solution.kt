package g1801_1900.s1832_check_if_the_sentence_is_pangram

// #Easy #String #Hash_Table #2023_06_21_Time_127_ms_(98.00%)_Space_34.1_MB_(96.00%)

class Solution {
    fun checkIfPangram(sentence: String): Boolean {
        val alphabet: MutableSet<Char> = HashSet()
        for (c in sentence.toCharArray()) {
            alphabet.add(c)
        }
        return alphabet.size == 26
    }
}
