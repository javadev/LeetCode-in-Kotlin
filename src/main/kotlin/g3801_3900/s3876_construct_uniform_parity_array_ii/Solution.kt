package g3801_3900.s3876_construct_uniform_parity_array_ii

import kotlin.math.min

// #Medium #Array #Math #Senior #Weekly_Contest_494
// #2026_08_13_Time_2_ms_(100.00%)_Space_121.98_MB_(11.30%)

class Solution {
    fun uniformArray(nums1: IntArray): Boolean {
        var min = Int.MAX_VALUE
        for (x in nums1) {
            min = min(min, x)
        }
        if (min % 2 == 1) {
            return true
        }
        for (x in nums1) {
            if (x % 2 == 1) {
                return false
            }
        }
        return true
    }
}
