package g2101_2200.s2114_maximum_number_of_words_found_in_sentences

// #Easy #Array #String
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
