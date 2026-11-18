package g4001_4100.s4006_count_valid_prefixes

// #Easy #String #Counting #Mid_Level #Biweekly_Contest_188
// #2026_11_17_Time_2_ms_(55.11%)_Space_43.18_MB_(90.05%)

import kotlin.math.abs

class Solution {
    fun countValidPrefixes(s: String): Int {
        var one = 0
        var zero = 0
        var ans = 0
        for (c in s.toCharArray()) {
            if (c == '1') {
                one++
            } else {
                zero++
            }
            if (abs(one - zero) <= 1) {
                ans++
            }
        }
        return ans
    }
}
