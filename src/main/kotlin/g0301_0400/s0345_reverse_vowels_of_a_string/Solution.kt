package g0301_0400.s0345_reverse_vowels_of_a_string

// #Easy #String #Two_Pointers #2022_11_18_Time_349_ms_(80.63%)_Space_42.2_MB_(76.91%)

class Solution {
    private fun isVowel(c: Char): Boolean {
        return c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' || c == 'O' ||
            c == 'u' || c == 'U'
    }

    fun reverseVowels(str: String): String {
        var i = 0
        var j = str.length - 1
        val str1 = str.toCharArray()
        while (i < j) {
            if (!isVowel(str1[i])) {
                i++
            } else if (!isVowel(str1[j])) {
                j--
            } else {
                // swapping
                val t = str1[i]
                str1[i] = str1[j]
                str1[j] = t
                i++
                j--
            }
        }
        return String(str1)
    }
}
