package g1701_1800.s1704_determine_if_string_halves_are_alike

// #Easy #String #Counting #2023_06_15_Time_162_ms_(83.33%)_Space_34.3_MB_(100.00%)

class Solution {
    fun halvesAreAlike(s: String): Boolean {
        return if (s.isEmpty()) {
            false
        } else countVowel(0, s.length / 2, s) == countVowel(s.length / 2, s.length, s)
    }

    private fun countVowel(start: Int, end: Int, s: String): Int {
        var c = 0
        for (i in start until end) {
            val ch = s[i]
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                c++
            }
        }
        return c
    }
}
