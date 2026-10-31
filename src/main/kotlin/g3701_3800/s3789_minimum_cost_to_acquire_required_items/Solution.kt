package g3701_3800.s3789_minimum_cost_to_acquire_required_items

// #Medium #Math #Greedy #Staff #Weekly_Contest_482
// #2026_05_22_Time_1_ms_(100.00%)_Space_42.78_MB_(58.24%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun minimumCost(cost1: Int, cost2: Int, costBoth: Int, need1: Int, need2: Int): Long {
        val min: Long = min(need1, need2).toLong()
        val max: Long = max(need1, need2).toLong()
        var ans: Long = need1.toLong() * cost1 + need2.toLong() * cost2
        ans = min(ans, min * costBoth + (need1 - min) * cost1 + (need2 - min) * cost2)
        ans = min(ans, max * costBoth)
        return ans
    }
}
