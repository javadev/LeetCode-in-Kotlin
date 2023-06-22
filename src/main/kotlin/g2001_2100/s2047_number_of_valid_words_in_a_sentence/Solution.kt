package g2001_2100.s2047_number_of_valid_words_in_a_sentence

// #Easy #String
class Solution {
    fun countValidWords(sentence: String): Int {
        val tokens = sentence.split("\\s+".toRegex()).dropLastWhile { it.isEmpty() }.toTypedArray()
        var count = 0
        for (token in tokens) {
            var hyphenCount = 0
            var punctuationMarkCount = 0
            var valid = true
            if (token.isEmpty() || token == "") {
                continue
            }
            for (i in 0 until token.length) {
                if (token[i] == '-') {
                    hyphenCount++
                    if (hyphenCount > 1 || i == 0 || i == token.length - 1 ||
                        !Character.isAlphabetic(token[i - 1].code) ||
                        !Character.isAlphabetic(token[i + 1].code)
                    ) {
                        valid = false
                        break
                    }
                } else if (token[i] == '!' || token[i] == '.' || token[i] == ',') {
                    punctuationMarkCount++
                    if (punctuationMarkCount > 1 || i != token.length - 1) {
                        valid = false
                        break
                    }
                } else if (Character.isDigit(token[i])) {
                    valid = false
                    break
                }
            }
            if (valid) {
                count++
            }
        }
        return count
    }
}
