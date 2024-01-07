package g2901_3000.s2942_find_words_containing_character

// #Easy #Array #String #2024_01_07_Time_216_ms_(98.97%)_Space_37.6_MB_(98.46%)

class Solution {
    fun findWordsContaining(words: Array<String>, x: Char): List<Int> {
        val ans: MutableList<Int> = ArrayList()
        for (i in words.indices) {
            for (j in 0 until words[i].length) {
                if (words[i][j] == x) {
                    ans.add(i)
                    break
                }
            }
        }
        return ans
    }
}
