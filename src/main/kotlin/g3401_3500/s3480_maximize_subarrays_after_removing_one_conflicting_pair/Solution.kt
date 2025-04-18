package g3401_3500.s3480_maximize_subarrays_after_removing_one_conflicting_pair

// #Hard #Array #Prefix_Sum #Enumeration #Segment_Tree
// #2025_03_11_Time_48_ms_(100.00%)_Space_164.15_MB_(100.00%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maxSubarrays(n: Int, conflictingPairs: Array<IntArray>): Long {
        val totalSubarrays = n.toLong() * (n + 1) / 2
        val h = IntArray(n + 1)
        val d2 = IntArray(n + 1)
        h.fill(n + 1)
        d2.fill(n + 1)
        for (pair in conflictingPairs) {
            var a = pair[0]
            var b = pair[1]
            if (a > b) {
                val temp = a
                a = b
                b = temp
            }
            if (b < h[a]) {
                d2[a] = h[a]
                h[a] = b
            } else if (b < d2[a]) {
                d2[a] = b
            }
        }
        val f = IntArray(n + 2)
        f[n + 1] = n + 1
        f[n] = h[n]
        for (i in n - 1 downTo 1) {
            f[i] = min(h[i], f[i + 1])
        }
        // forbiddenCount(x) returns (n - x + 1) if x <= n, else 0.
        // This is the number of forbidden subarrays starting at some i when f[i] = x.
        var originalUnion: Long = 0
        for (i in 1..n) {
            if (f[i] <= n) {
                originalUnion += (n - f[i] + 1).toLong()
            }
        }
        val originalValid = totalSubarrays - originalUnion
        var best = originalValid
        // For each index j (1 <= j <= n) where a candidate conflicting pair exists,
        // simulate removal of the pair that gave h[j] (if any).
        // (If there is no candidate pair at j, h[j] remains n+1.)
        for (j in 1..n) {
            // no conflicting pair at index j
            if (h[j] == n + 1) {
                continue
            }
            // Simulate removal: new candidate at j becomes d2[j]
            val newCandidate = if (j < n) min(d2[j], f[j + 1]) else d2[j]
            // We'll recompute the new f values for indices 1..j.
            // Let newF[i] denote the updated value.
            // For i > j, newF[i] remains as original f[i].
            // For i = j, newF[j] = min( newCandidate, f[j+1] ) (which is newCandidate by
            // definition).
            val newFj = newCandidate
            // forbiddenCount(x) is defined as (n - x + 1) if x<= n, else 0.
            var delta = forbiddenCount(newFj, n) - forbiddenCount(f[j], n)
            var cur = newFj
            // Now update backwards for i = j-1 down to 1.
            for (i in j - 1 downTo 1) {
                val newVal = min(h[i], cur)
                // no further change for i' <= i
                if (newVal == f[i]) {
                    break
                }
                delta += forbiddenCount(newVal, n) - forbiddenCount(f[i], n)
                cur = newVal
            }
            val newUnion = originalUnion + delta
            val newValid = totalSubarrays - newUnion
            best = max(best, newValid)
        }
        return best
    }

    private fun forbiddenCount(x: Int, n: Int): Long {
        return (if (x <= n) (n - x + 1) else 0).toLong()
    }
}
