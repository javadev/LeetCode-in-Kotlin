package g1701_1800.s1784_check_if_binary_string_has_at_most_one_segment_of_ones

// #Easy #String #2023_06_18_Time_135_ms_(85.71%)_Space_34.1_MB_(71.43%)

class Solution {
    fun checkOnesSegment(s: String): Boolean {
        var metOne = false
        var i = 0
        while (i < s.length) {
            if (s[i] == '1' && metOne) {
                return false
            }
            if (s[i] == '1') {
                metOne = true
                while (i < s.length && s[i] == '1') {
                    i++
                }
            }
            i++
        }
        return true
    }
}
