package g1801_1900.s1813_sentence_similarity_iii

// #Medium #Array #String #Two_Pointers #2023_06_20_Time_162_ms_(100.00%)_Space_35.9_MB_(100.00%)

class Solution {
    fun areSentencesSimilar(sentence1: String, sentence2: String): Boolean {
        val words1 = sentence1.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        val words2 = sentence2.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        var i = 0
        val n1 = words1.size
        val n2 = words2.size
        if (n1 > n2) {
            return areSentencesSimilar(sentence2, sentence1)
        }
        while (i < n1 && words1[i] == words2[i]) {
            ++i
        }
        while (i < n1 && words1[i] == words2[n2 - n1 + i]) {
            ++i
        }
        return i == n1
    }
}
