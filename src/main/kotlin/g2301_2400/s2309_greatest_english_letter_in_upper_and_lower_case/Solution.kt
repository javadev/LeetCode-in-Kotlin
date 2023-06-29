package g2301_2400.s2309_greatest_english_letter_in_upper_and_lower_case

// #Easy #Array #2023_06_29_Time_154_ms_(87.50%)_Space_35.5_MB_(62.50%)

class Solution {
    fun greatestLetter(s: String): String {
        var gt = ' '
        val sA = BooleanArray(26)
        val uA = BooleanArray(26)
        for (ch in s.toCharArray()) {
            var i: Int
            if (ch in 'A'..'Z') {
                i = ch.code - 'A'.code
                uA[i] = true
            } else {
                i = ch.code - 'a'.code
                sA[i] = true
            }
            if (uA[i] == sA[i] && gt.code < 'A'.code + i) {
                gt = ('A'.code + i).toChar()
            }
        }
        return if (gt == ' ') "" else gt.toString() + ""
    }
}
