package g0001_0100.s0017_letter_combinations_of_a_phone_number

class Solution {
    fun letterCombinations(digits: String): List<String> {
        if (digits.isEmpty()) {
            return emptyList()
        }
        val words: MutableList<String> = ArrayList()
        val word = CharArray(digits.length)
        helper(digits, word, 0, words)
        return words
    }

    private fun helper(digits: String, word: CharArray, cur: Int, words: MutableList<String>) {
        if (cur == digits.length) {
            words.add(String(word))
        } else {
            for (ch in charsForDigit(digits[cur])) {
                word[cur] = ch
                helper(digits, word, cur + 1, words)
            }
        }
    }

    private fun charsForDigit(digit: Char): CharArray {
        return when (digit) {
            '2' -> charArrayOf('a', 'b', 'c')
            '3' -> charArrayOf('d', 'e', 'f')
            '4' -> charArrayOf('g', 'h', 'i')
            '5' -> charArrayOf('j', 'k', 'l')
            '6' -> charArrayOf('m', 'n', 'o')
            '7' -> charArrayOf('p', 'q', 'r', 's')
            '8' -> charArrayOf('t', 'u', 'v')
            '9' -> charArrayOf('w', 'x', 'y', 'z')
            else -> charArrayOf()
        }
    }
}
