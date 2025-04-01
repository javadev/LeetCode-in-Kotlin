package g3501_3600.s3502_minimum_cost_to_reach_every_position

// #Easy #Array #2025_04_01_Time_1_ms_(100.00%)_Space_46.62_MB_(96.30%)

import kotlin.math.min

class Solution {
    fun minCosts(cost: IntArray): IntArray {
        var min = cost[0]
        val ans = IntArray(cost.size)
        ans[0] = min
        for (i in 1..<cost.size) {
            min = min(min, cost[i])
            ans[i] = min
        }
        return ans
    }
}
