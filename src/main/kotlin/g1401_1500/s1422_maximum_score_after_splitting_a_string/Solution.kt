package g1401_1500.s1422_maximum_score_after_splitting_a_string

// #Easy #String #2023_06_07_Time_145_ms_(100.00%)_Space_33.2_MB_(100.00%)

class Solution {
    fun maxScore(s: String): Int {
        var zeroes = if (s[0] == '0') 1 else 0
        var ones = 0
        for (i in 1 until s.length) {
            if (s[i] == '1') {
                ones++
            }
        }
        var maxScore = zeroes + ones
        for (i in 1 until s.length - 1) {
            if (s[i] == '0') {
                zeroes++
            } else {
                ones--
            }
            maxScore = Math.max(maxScore, zeroes + ones)
        }
        return maxScore
    }
}
