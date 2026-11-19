package g4001_4100.s4021_minimum_operations_to_make_a_rotated_palindrome_i

// #Medium #String #Math #Enumeration #Staff #Biweekly_Contest_189
// #2026_11_19_Time_40_ms_(98.85%)_Space_46.02_MB_(33.33%)

import kotlin.math.abs
import kotlin.math.min

class Solution {
    fun minOperations(s: String): Int {
        val chars = s.toCharArray()
        val n = s.length
        val dist = Array<IntArray?>(26) { IntArray(26) }
        for (a in 0..25) {
            for (b in 0..25) {
                val diff = abs(a - b)
                dist[a]!![b] = min(diff, 26 - diff)
            }
        }
        val vals = IntArray(n)
        for (i in 0..<n) {
            vals[i] = chars[i].code - 97
        }
        val mid = n shr 1
        var min = 0
        for (i in 0..<mid) {
            min += dist[vals[i]]!![vals[n - 1 - i]]
        }
        val diff = IntArray(n shl 1)
        for (i in 0..<2 * n) {
            diff[i] = vals[i % n]
        }
        var shift = 1
        while (shift < n shr (1 - (n and 1)) && shift < min) {
            var curr = shift
            for (i in 0..<mid) {
                curr += dist[diff[shift + i]]!![diff[shift + n - 1 - i]]
                if (curr >= min) {
                    break
                }
            }
            min = min(min, curr)
            ++shift
        }
        return min
    }
}
