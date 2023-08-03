package g2701_2800.s2730_find_the_longest_semi_repetitive_substring

// #Medium #String #Sliding_Window #2023_08_03_Time_251_ms_(84.62%)_Space_40.7_MB_(38.46%)

class Solution {
    fun longestSemiRepetitiveSubstring(s: String): Int {
        var i = 0
        var cur = 0
        val n = s.length
        for (j in 1 until n) {
            cur += if (s[j] == s[j - 1]) 1 else 0
            if (cur > 1) {
                cur -= if (s[++i] == s[i - 1]) 1 else 0
            }
        }
        return n - i
    }
}
