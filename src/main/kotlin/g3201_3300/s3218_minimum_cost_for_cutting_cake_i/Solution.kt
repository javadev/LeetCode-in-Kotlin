package g3201_3300.s3218_minimum_cost_for_cutting_cake_i

// #Medium #Array #Dynamic_Programming #Sorting #Greedy
// #2024_07_19_Time_175_ms_(78.05%)_Space_35.1_MB_(100.00%)

import kotlin.math.min

class Solution {
    fun minimumCost(m: Int, n: Int, horizontalCut: IntArray, verticalCut: IntArray): Int {
        var sum = 0
        for (hc in horizontalCut) {
            sum += hc
        }
        for (vc in verticalCut) {
            sum += vc
        }
        for (hc in horizontalCut) {
            for (vc in verticalCut) {
                sum += min(hc, vc)
            }
        }
        return sum
    }
}
