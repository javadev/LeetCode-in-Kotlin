package g3701_3800.s3746_minimum_string_length_after_balanced_removals

// #Medium #String #Stack #Counting #Senior #Weekly_Contest_476
// #2026_04_26_Time_3_ms_(95.94%)_Space_47.34_MB_(25.76%)

import kotlin.math.abs

class Solution {
    fun minLengthAfterRemovals(s: String): Int {
        val hash = IntArray(2)
        for (c in s.toCharArray()) {
            hash[c.code - 'a'.code]++
        }
        return abs(hash[0] - hash[1])
    }
}
