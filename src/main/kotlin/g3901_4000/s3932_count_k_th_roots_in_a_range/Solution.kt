package g3901_4000.s3932_count_k_th_roots_in_a_range

// #Medium #Math #Binary_Search #Senior #Weekly_Contest_502
// #2026_09_29_Time_1_ms_(100.00%)_Space_42.94_MB_(7.52%)

import kotlin.math.pow

class Solution {
    fun countKthRoots(l: Int, r: Int, k: Int): Int {
        if (k == 1) {
            return r - l + 1
        }
        var ans = 0
        var start = 0
        var pow = start.toDouble().pow(k.toDouble()).toInt()
        while (l > pow) {
            start++
            pow = start.toDouble().pow(k.toDouble()).toInt()
        }
        while (pow <= r) {
            start++
            pow = start.toDouble().pow(k.toDouble()).toInt()
            ans++
        }
        return ans
    }
}
