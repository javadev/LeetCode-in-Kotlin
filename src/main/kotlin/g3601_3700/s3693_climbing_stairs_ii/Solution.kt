package g3601_3700.s3693_climbing_stairs_ii

// #Medium #Array #Dynamic_Programming #Biweekly_Contest_166
// #2025_10_03_Time_8_ms_(100.00%)_Space_80.61_MB_(12.90%)

import kotlin.math.min

@Suppress("unused")
class Solution {
    fun climbStairs(n: Int, costs: IntArray): Int {
        if (costs.size == 1) {
            return costs[0] + 1
        }
        var one = costs[0] + 1
        var two = min(one + costs[1] + 1, costs[1] + 4)
        if (costs.size < 3) {
            return two
        }
        var three = min(one + costs[2] + 4, min(two + costs[2] + 1, costs[2] + 9))
        if (costs.size < 4) {
            return three
        }
        for (i in 3..<costs.size) {
            val four =
                (
                    min(
                        three + costs[i] + 1,
                        min(two + costs[i] + 4, one + costs[i] + 9),
                    )
                    )
            one = two
            two = three
            three = four
        }
        return three
    }
}
