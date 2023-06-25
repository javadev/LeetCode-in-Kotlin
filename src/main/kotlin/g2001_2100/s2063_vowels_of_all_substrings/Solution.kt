package g2001_2100.s2063_vowels_of_all_substrings

// #Medium #String #Dynamic_Programming #Math #Combinatorics
// #2023_06_25_Time_206_ms_(100.00%)_Space_38.7_MB_(100.00%)

class Solution {
    fun countVowels(word: String): Long {
        var ans: Long = 0
        for (i in word.indices) {
            if (isVowel(word[i])) {
                val right = word.length - i.toLong() - 1
                ans += (i.toLong() + 1) * (right + 1)
            }
        }
        return ans
    }

    private fun isVowel(ch: Char): Boolean {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
    }
}
