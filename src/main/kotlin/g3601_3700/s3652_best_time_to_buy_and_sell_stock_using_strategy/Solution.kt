package g3601_3700.s3652_best_time_to_buy_and_sell_stock_using_strategy

// #Medium #Array #Prefix_Sum #Sliding_Window #Weekly_Contest_463
// #2025_08_20_Time_6_ms_(100.00%)_Space_78.91_MB_(64.71%)

import kotlin.math.max

class Solution {
    fun maxProfit(p: IntArray, s: IntArray, k: Int): Long {
        val n = p.size
        val p1 = LongArray(n + 1)
        val p2 = LongArray(n + 1)
        for (i in 0..<n) {
            p1[i + 1] = p1[i] + s[i].toLong() * p[i]
            p2[i + 1] = p2[i] + p[i]
        }
        var max: Long = 0
        for (i in 0..n - k) {
            val m = i + k / 2
            val e = i + k
            val op = p1[e] - p1[i]
            val np = p2[e] - p2[m]
            max = max(max, np - op)
        }
        return p1[n] + max
    }
}
