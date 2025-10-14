package g3701_3800.s3707_equal_score_substrings

// #Easy #String #Prefix_Sum #Biweekly_Contest_167
// #2025_10_14_Time_2_ms_(66.67%)_Space_42.10_MB_(91.67%)

class Solution {
    fun scoreBalance(s: String): Boolean {
        var total = 0
        for (c in s.toCharArray()) {
            total += c.code - 'a'.code + 1
        }
        var prefix = 0
        for (c in s.toCharArray()) {
            prefix += c.code - 'a'.code + 1
            if (2 * prefix == total) {
                return true
            }
        }
        return false
    }
}
