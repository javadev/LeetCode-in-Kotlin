package g3801_3900.s3864_minimum_cost_to_partition_a_binary_string

import kotlin.math.min

// #Hard #String #Prefix_Sum #Divide_and_Conquer #Senior_Staff #Weekly_Contest_492
// #2026_07_28_Time_28_ms_(100.00%)_Space_47.92_MB_(60.00%)

class Solution {
    private var encCost = 0
    private var flatCost = 0
    private lateinit var pre: IntArray

    fun minCost(s: String, encCost: Int, flatCost: Int): Long {
        pre = IntArray(s.length + 1)
        for (i in 1..<pre.size) {
            pre[i] = pre[i - 1] + (s.get(i - 1).code - '0'.code)
        }
        this.encCost = encCost
        this.flatCost = flatCost
        return helper(0, s.length)
    }

    private fun helper(l: Int, r: Int): Long {
        val gap = r - l
        val x = pre[r] - pre[l]
        if (x == 0) {
            return flatCost.toLong()
        }
        var cost = gap.toLong() * x * encCost
        if (gap % 2 == 0) {
            val mid = l + (r - l) / 2
            cost = min(cost, helper(l, mid) + helper(mid, r))
        }
        return cost
    }
}
