package g3101_3200.s3110_score_of_a_string

// #Easy #String #2024_04_27_Time_144_ms_(91.51%)_Space_34.5_MB_(73.58%)

import kotlin.math.abs

class Solution {
    fun scoreOfString(s: String): Int {
        var sum = 0
        for (i in 0 until s.length - 1) {
            sum += abs(((s[i].code - '0'.code) - (s[i + 1].code - '0'.code)))
        }
        return sum
    }
}
