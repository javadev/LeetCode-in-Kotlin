package g0701_0800.s0789_escape_the_ghosts

// #Medium #Array #Math #2023_03_13_Time_187_ms_(100.00%)_Space_34.9_MB_(100.00%)

import kotlin.math.abs

class Solution {
    fun escapeGhosts(ghosts: Array<IntArray>, target: IntArray): Boolean {
        val currPos = intArrayOf(0, 0)
        val selfDist = getDist(currPos, target)
        for (ghost in ghosts) {
            val ghostDist = getDist(ghost, target)
            if (ghostDist <= selfDist) {
                return false
            }
        }
        return true
    }

    private fun getDist(p1: IntArray, p2: IntArray): Int {
        return abs(p1[0] - p2[0]) + abs(p1[1] - p2[1])
    }
}
