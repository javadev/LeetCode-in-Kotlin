package g2801_2900.s2849_determine_if_a_cell_is_reachable_at_a_given_time

// #Medium #Math #2023_12_18_Time_138_ms_(80.95%)_Space_33.7_MB_(79.82%)

import kotlin.math.abs
import kotlin.math.max

class Solution {
    fun isReachableAtTime(sx: Int, sy: Int, fx: Int, fy: Int, t: Int): Boolean {
        if (sx == fx && sy == fy) {
            return t != 1
        }
        val width = abs((sx - fx)) + 1
        val height = abs((sy - fy)) + 1
        return max(width, height) - 1 <= t
    }
}
