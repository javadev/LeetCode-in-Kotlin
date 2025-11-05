package g3701_3800.s3733_minimum_time_to_complete_all_deliveries

// #Medium #Math #Binary_Search #Weekly_Contest_474
// #2025_11_05_Time_2_ms_(100.00%)_Space_42.47_MB_(100.00%)

import kotlin.math.max

class Solution {
    private fun pos(k: Long, n1: Long, n2: Long, p1: Int, p2: Int, lVal: Long): Boolean {
        val kP1 = k / p1
        val kP2 = k / p2
        val kL = k / lVal
        val s1 = kP2 - kL
        val s2 = kP1 - kL
        val sB = k - kP1 - kP2 + kL
        val w1 = max(0L, n1 - s1)
        val w2 = max(0L, n2 - s2)
        return (w1 + w2) <= sB
    }

    private fun findGcd(a: Long, b: Long): Long {
        if (b == 0L) {
            return a
        }
        return findGcd(b, a % b)
    }

    fun minimumTime(d: IntArray, r: IntArray): Long {
        val n1 = d[0].toLong()
        val n2 = d[1].toLong()
        val p1 = r[0]
        val p2 = r[1]
        val g = findGcd(p1.toLong(), p2.toLong())
        val l = p1.toLong() * p2 / g
        var lo = n1 + n2
        var hi = (n1 + n2) * max(p1, p2)
        var res = hi
        while (lo <= hi) {
            val mid = lo + (hi - lo) / 2
            if (pos(mid, n1, n2, p1, p2, l)) {
                res = mid
                hi = mid - 1
            } else {
                lo = mid + 1
            }
        }
        return res
    }
}
