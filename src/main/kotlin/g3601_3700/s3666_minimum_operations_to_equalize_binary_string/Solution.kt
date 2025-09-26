package g3601_3700.s3666_minimum_operations_to_equalize_binary_string

// #Hard #String #Hash_Table #Math #Breadth_First_Search #Biweekly_Contest_164
// #2025_09_07_Time_8_ms_(100.00%)_Space_46.70_MB_(100.00%)

import kotlin.math.max

class Solution {
    fun minOperations(s: String, k: Int): Int {
        val n = s.length
        var cnt0 = 0
        for (c in s.toCharArray()) {
            if (c == '0') {
                cnt0++
            }
        }
        if (cnt0 == 0) {
            return 0
        }
        if (k == n) {
            return if (cnt0 == n) 1 else -1
        }
        val kP = k and 1
        val needP = cnt0 and 1
        var best = Long.Companion.MAX_VALUE
        for (p in 0..1) {
            if ((p * kP) % 2 != needP) {
                continue
            }
            val mismatch = (if (p == 0) cnt0 else (n - cnt0)).toLong()
            val b1 = (cnt0 + k - 1L) / k
            val b2: Long
            b2 = (mismatch + (n - k) - 1L) / (n - k)
            var lb = max(b1, b2)
            if (lb < 1) {
                lb = 1
            }
            if ((lb and 1L) != p.toLong()) {
                lb++
            }
            if (lb < best) {
                best = lb
            }
        }
        return if (best == Long.Companion.MAX_VALUE) -1 else best.toInt()
    }
}
