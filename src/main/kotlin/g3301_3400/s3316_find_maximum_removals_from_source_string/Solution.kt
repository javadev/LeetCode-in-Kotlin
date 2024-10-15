package g3301_3400.s3316_find_maximum_removals_from_source_string

// #Medium #Array #String #Hash_Table #Dynamic_Programming #Two_Pointers
// #2024_10_15_Time_220_ms_(100.00%)_Space_37.5_MB_(45.45%)

import kotlin.math.max

class Solution {
    fun maxRemovals(source: String, pattern: String, targetIndices: IntArray): Int {
        val sChars = source.toCharArray()
        val sn = sChars.size
        val pChars = ("$pattern#").toCharArray()
        val pn = pattern.length
        var tn = targetIndices.size
        val maxPat = IntArray(tn + 1)
        var i = 0
        var di = 0
        var nextTI = targetIndices[0]
        while (i < sn) {
            val c = sChars[i]
            if (i == nextTI) {
                maxPat[di + 1] = maxPat[di]
                var p = maxPat[di + 1]
                for (j in di downTo 1) {
                    val q = maxPat[j - 1]
                    maxPat[j] = if (c != pChars[p]) q else max((p + 1), q)
                    p = q
                }
                if (c == pChars[p]) {
                    maxPat[0] = p + 1
                }
                nextTI = if (++di < tn) targetIndices[di] else -1
            } else {
                for (j in 0..di) {
                    val p = maxPat[j]
                    if (c == pChars[p]) {
                        maxPat[j] = p + 1
                    }
                }
            }
            i++
        }
        while (maxPat[tn] < pn) {
            tn--
        }
        return tn
    }
}
