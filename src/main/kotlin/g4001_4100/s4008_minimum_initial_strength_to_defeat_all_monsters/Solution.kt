package g4001_4100.s4008_minimum_initial_strength_to_defeat_all_monsters

// #Medium #Array #Greedy #Binary_Search #Prefix_Sum #Staff #Biweekly_Contest_188
// #2026_11_17_Time_3_ms_(97.92%)_Space_161.18_MB_(66.67%)

import kotlin.math.max

class Solution {
    fun minInitialStrength(monsters: IntArray, boosts: Array<IntArray>): Long {
        val n = monsters.size
        val diff = LongArray(n)
        for (boost in boosts) {
            val l = boost[0]
            val r = boost[1]
            val v = boost[2]
            diff[r] += v.toLong()
            if (l > 0) {
                diff[l - 1] -= v.toLong()
            }
        }
        var res: Long = 0
        var bonus: Long = 0
        for (i in n - 1 downTo 0) {
            bonus += diff[i]
            if (res > 0) {
                res += monsters[i].toLong()
            } else {
                res = max(0L, monsters[i] - bonus)
            }
        }
        return res
    }
}
