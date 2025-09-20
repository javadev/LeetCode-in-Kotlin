package g3601_3700.s3679_minimum_discards_to_balance_inventory

// #Medium #Biweekly_Contest_165 #2025_09_20_Time_6_ms_(100.00%)_Space_68.59_MB_(76.92%)

import kotlin.math.max

class Solution {
    fun minArrivalsToDiscard(arrivals: IntArray, w: Int, m: Int): Int {
        val n = arrivals.size
        var dis = 0
        val removed = BooleanArray(n)
        var maxVal = 0
        for (v in arrivals) {
            maxVal = max(maxVal, v)
        }
        val freq = IntArray(maxVal + 1)
        for (i in 0..<n) {
            val outIdx = i - w
            if (outIdx >= 0 && !removed[outIdx]) {
                val oldVal = arrivals[outIdx]
                freq[oldVal]--
            }
            val `val` = arrivals[i]
            if (freq[`val`] >= m) {
                dis++
                removed[i] = true
            } else {
                freq[`val`]++
            }
        }
        return dis
    }
}
