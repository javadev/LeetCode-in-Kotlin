package g2201_2300.s2278_percentage_of_letter_in_string

// #Easy #String #2023_06_28_Time_122_ms_(100.00%)_Space_33_MB_(100.00%)

class Solution {
    fun percentageLetter(s: String, letter: Char): Int {
        var count = 0
        val n = s.length
        for (i in 0 until n) {
            if (s[i] == letter) {
                ++count
            }
        }
        return count * 100 / n
    }
}
