package g3801_3900.s3809_best_reachable_tower

// #Medium #Array #Senior #Biweekly_Contest_174
// #2026_06_09_Time_3_ms_(70.30%)_Space_219.56_MB_(26.73%)

import kotlin.math.abs

class Solution {
    fun bestTower(towers: Array<IntArray>, center: IntArray, radius: Int): IntArray? {
        var bestX = -1
        var bestY = -1
        var bestQ = -1
        val cx = center[0]
        val cy = center[1]
        for (t in towers) {
            val x = t[0]
            val y = t[1]
            val q = t[2]
            val dx = abs(x.toLong() - cx)
            val dy = abs(y.toLong() - cy)
            if (dx + dy <= radius &&
                (
                    q > bestQ ||
                        (
                            q == bestQ &&
                                (bestX == -1 || x < bestX || (x == bestX && y < bestY))
                            )
                    )
            ) {
                bestQ = q
                bestX = x
                bestY = y
            }
        }
        return if (bestQ == -1) intArrayOf(-1, -1) else intArrayOf(bestX, bestY)
    }
}
