package g3801_3900.s3814_maximum_capacity_within_budget

import kotlin.math.max
import kotlin.math.min

// #Medium #Array #Sorting #Binary_Search #Two_Pointers #Senior #Weekly_Contest_485
// #2026_06_09_Time_8_ms_(100.00%)_Space_162.19_MB_(100.00%)

class Solution {
    fun maxCapacity(costs: IntArray, capacity: IntArray, budget: Int): Int {
        val mxCap = IntArray(budget)
        var maxCap = 0
        for (i in costs.indices) {
            val cost = costs[i]
            val cap = capacity[i]
            if (cost >= budget) {
                continue
            }
            maxCap = max(maxCap, cap)
            if (cost * 2 < budget) {
                maxCap = max(maxCap, mxCap[cost] + cap)
            }
            if (cap > mxCap[cost]) {
                mxCap[cost] = cap
            }
        }
        val preSum = IntArray(budget)
        for (i in 1..<budget) {
            val rem = min(budget - i - 1, i - 1)
            maxCap = max(maxCap, mxCap[i] + preSum[rem])
            preSum[i] = max(preSum[i - 1], mxCap[i])
        }
        return maxCap
    }
}
