package g2501_2600.s2586_count_the_number_of_vowel_strings_in_range

// #Easy #Array #String #2023_07_11_Time_195_ms_(100.00%)_Space_37.2_MB_(100.00%)

class Solution {
    fun vowelStrings(words: Array<String>, left: Int, right: Int): Int {
        var count = 0
        for (i in left..right) {
            if (isVowel(words[i][0]) && isVowel(words[i][words[i].length - 1])) {
                count++
            }
        }
        return count
    }

    private fun isVowel(ch: Char): Boolean {
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'
    }
}
