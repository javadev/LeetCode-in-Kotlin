package g3901_4000.s3968_maximum_manhattan_distance_after_all_moves

// #Medium #String #Math #Counting #Senior #Weekly_Contest_507
// #2026_10_20_Time_7_ms_(99.64%)_Space_47.68_MB_(80.65%)

import kotlin.math.abs

class Solution {
    fun maxDistance(s: String): Int {
        val d = IntArray(96)
        for (c in s.toCharArray()) {
            d[c.code]++
        }
        return abs(d['U'.code] - d['D'.code]) + abs(d['L'.code] - d['R'.code]) + d['_'.code]
    }
}
