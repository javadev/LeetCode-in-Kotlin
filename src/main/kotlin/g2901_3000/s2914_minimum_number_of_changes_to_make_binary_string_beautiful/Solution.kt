package g2901_3000.s2914_minimum_number_of_changes_to_make_binary_string_beautiful

// #Medium #String #2023_12_31_Time_180_ms_(100.00%)_Space_38.2_MB_(80.00%)

class Solution {
    fun minChanges(s: String): Int {
        var ans = 0
        var i = 0
        while (i < s.length) {
            if (s[i] != s[i + 1]) {
                ans++
            }
            i += 2
        }
        return ans
    }
}
