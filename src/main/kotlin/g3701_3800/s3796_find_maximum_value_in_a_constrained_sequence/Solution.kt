package g3701_3800.s3796_find_maximum_value_in_a_constrained_sequence

// #Medium #Array #Greedy #Staff #Biweekly_Contest_173
// #2026_05_22_Time_6_ms_(98.18%)_Space_208.10_MB_(32.73%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun findMaxVal(n: Int, restrictions: Array<IntArray>, diff: IntArray): Int {
        val a = IntArray(n)
        a[0] = 0
        for (i in 1..<n) {
            a[i] = Int.MAX_VALUE
        }
        for (r in restrictions) {
            a[r[0]] = min(a[r[0]], r[1])
        }
        for (i in 1..<n) {
            a[i] = min(a[i], a[i - 1] + diff[i - 1])
        }
        for (i in n - 2 downTo 0) {
            a[i] = min(a[i], a[i + 1] + diff[i])
        }
        var maxi = 0
        for (i in a) {
            maxi = max(maxi, i)
        }
        return maxi
    }
}
