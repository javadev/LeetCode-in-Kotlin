package g3601_3700.s3689_maximum_total_subarray_value_i

// #Medium #Array #Greedy #Weekly_Contest_468 #2025_09_26_Time_3_ms_(98.11%)_Space_64.20_MB_(92.45%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maxTotalValue(num: IntArray, k: Int): Long {
        var mxv = Int.Companion.MIN_VALUE
        var mnv = Int.Companion.MAX_VALUE
        for (`val` in num) {
            mxv = max(mxv, `val`)
            mnv = min(mnv, `val`)
        }
        return (mxv - mnv).toLong() * k
    }
}
