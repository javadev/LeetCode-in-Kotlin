package g1401_1500.s1456_maximum_number_of_vowels_in_a_substring_of_given_length

// #Medium #String #Sliding_Window
class Solution {
    private fun isVowel(c: Char): Boolean {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u'
    }

    fun maxVowels(s: String, k: Int): Int {
        var maxVowelCount = 0
        var vowelCount = 0
        var i = 0
        var j = 0
        while (j < s.length) {
            val c = s[j]
            if (isVowel(c)) {
                vowelCount++
            }
            if (j - i + 1 == k) {
                maxVowelCount = Math.max(maxVowelCount, vowelCount)
                if (isVowel(s[i])) {
                    vowelCount--
                }
                i++
            }
            j++
        }
        return maxVowelCount
    }
}
