package g2401_2500.s2414_length_of_the_longest_alphabetical_continuous_substring

// #Medium #String #2023_07_04_Time_235_ms_(100.00%)_Space_38.3_MB_(100.00%)

class Solution {
    fun longestContinuousSubstring(s: String): Int {
        var ans = 0
        var cnt = 1
        var j = 1
        while (j < s.length) {
            if (s[j].code == s[j - 1].code + 1) {
                cnt++
            } else {
                ans = ans.coerceAtLeast(cnt)
                cnt = 1
            }
            j++
        }
        return ans.coerceAtLeast(cnt)
    }
}
