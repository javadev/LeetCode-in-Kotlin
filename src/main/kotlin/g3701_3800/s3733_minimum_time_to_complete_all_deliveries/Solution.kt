package g3701_3800.s3733_minimum_time_to_complete_all_deliveries

// #Medium #Weekly_Contest_474 #2025_11_03_Time_2_ms_(100.00%)_Space_42.94_MB_(100.00%)

import kotlin.math.max

class Solution {
    private fun func(mid: Long, d: IntArray, r: IntArray): Boolean {
        val lcm = r[0].toLong() * r[1] / gcd(r[0].toLong(), r[1].toLong())
        val a1 = mid / r[0]
        val a2 = mid / r[1]
        val a3 = mid / lcm
        val b = mid - a1 - a2 + a3
        val o1 = a2 - a3
        val o2 = a1 - a3
        val d0 = max(d[0] - o1, 0)
        val d1 = max(d[1] - o2, 0)
        return b >= d0 + d1
    }

    private fun gcd(a: Long, b: Long): Long {
        if (b == 0L) {
            return a
        }
        return gcd(b, a % b)
    }

    fun minimumTime(d: IntArray, r: IntArray): Long {
        var lo: Long = 0
        var hi = 1e12.toLong()
        var ans = Long.MAX_VALUE
        while (lo <= hi) {
            val mid = (lo + hi) / 2
            if (func(mid, d, r)) {
                ans = mid
                hi = mid - 1
            } else {
                lo = mid + 1
            }
        }
        return ans
    }
}
