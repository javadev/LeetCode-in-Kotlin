package g2301_2400.s2315_count_asterisks

// #Easy #String #2023_06_30_Time_137_ms_(94.44%)_Space_34.3_MB_(77.78%)

class Solution {
    fun countAsterisks(s: String): Int {
        var c = 0
        val n = s.length
        var i = 0
        while (i < n) {
            if (s[i] == '|') {
                i++
                while (s[i] != '|') {
                    i++
                }
            }
            if (s[i] == '*') {
                c++
            }
            i++
        }
        return c
    }
}
