package g3901_4000.s3931_check_adjacent_digit_differences

// #Easy #String #Mid_Level #Weekly_Contest_502
// #2026_09_29_Time_1_ms_(100.00%)_Space_43.68_MB_(59.35%)

import kotlin.math.abs

class Solution {
    fun isAdjacentDiffAtMostTwo(s: String): Boolean {
        for (i in 0..<s.length - 1) {
            if (abs(s[i].code - s[i + 1].code) > 2) {
                return false
            }
        }
        return true
    }
}
