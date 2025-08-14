package g3601_3700.s3638_maximum_balanced_shipments

// #Medium #Array #Dynamic_Programming #Greedy #Stack #Monotonic_Stack #Weekly_Contest_461
// #2025_08_03_Time_5_ms_(100.00%)_Space_78.25_MB_(100.00%)

import kotlin.math.max

class Solution {
    fun maxBalancedShipments(weight: IntArray): Int {
        var res = 0
        var maxa = 0
        for (a in weight) {
            maxa = max(maxa, a)
            if (a < maxa) {
                res++
                maxa = 0
            }
        }
        return res
    }
}
