package g0801_0900.s0884_uncommon_words_from_two_sentences

// #Easy #String #Hash_Table #2023_04_08_Time_171_ms_(100.00%)_Space_35.6_MB_(100.00%)

class Solution {
    fun uncommonFromSentences(s1: String, s2: String): Array<String?> {
        val visited = HashSet<String>()
        val uniques = HashSet<String>()
        for (word in s1.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()) {
            if (!visited.add(word)) {
                uniques.remove(word)
            } else {
                uniques.add(word)
            }
        }
        for (word in s2.split(" ".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()) {
            if (!visited.add(word)) {
                uniques.remove(word)
            } else {
                uniques.add(word)
            }
        }
        val arr = arrayOfNulls<String>(uniques.size)
        for ((i, word) in uniques.withIndex()) {
            arr[i] = word
        }
        return arr
    }
}