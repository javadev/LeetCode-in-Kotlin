package g2101_2200.s2114_maximum_number_of_words_found_in_sentences

// #Easy #Array #String #2023_06_25_Time_183_ms_(88.64%)_Space_36.5_MB_(96.59%)

class Solution {
    fun mostWordsFound(sentences: Array<String>): Int {
        var max = 0
        for (sentence in sentences) {
            max = Math.max(max, countWords(sentence))
        }
        return max
    }

    private fun countWords(s: String): Int {
        var start = 0
        var wc = 0
        while (start < s.length) {
            var end = start
            while (end < s.length && Character.isLetter(s[end])) {
                end++
            }
            wc++
            start = ++end
        }
        return wc
    }
}
