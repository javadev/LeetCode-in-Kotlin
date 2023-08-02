package g1701_1800.s1750_minimum_length_of_string_after_deleting_similar_ends

// #Medium #String #Two_Pointers #2023_06_16_Time_215_ms_(100.00%)_Space_37.4_MB_(100.00%)

class Solution {
    fun minimumLength(s: String): Int {
        var i = 0
        var j: Int = s.length - 1
        if (s[i] == s[j]) {
            while (i < j && s[i] == s[j]) {
                val c: Char = s[i]
                i++
                while (c == s[i] && i < j) {
                    i++
                }
                j--
                while (c == s[j] && i < j) {
                    j--
                }
            }
        }
        return if (i <= j) s.substring(i, j).length + 1 else 0
    }
}
