package g3801_3900.s3892_minimum_operations_to_achieve_at_least_k_peaks

import kotlin.math.max
import kotlin.math.min

// #2026_08_13_Time_92_ms_(93.75%)_Space_47.26_MB_(78.13%)

class Solution {
    fun minOperations(nums: IntArray, k: Int): Int {
        val n = nums.size
        if (k == 0) {
            return 0
        }
        if (k > n / 2) {
            return -1
        }
        val c = LongArray(n)
        for (i in 0..<n) {
            val left = nums[(i - 1 + n) % n]
            val right = nums[(i + 1) % n]
            c[i] = max(0L, max(left, right).toLong() + 1 - nums[i])
        }
        var best = pathMin(c, 1, n - 1, k)
        val withZero = pathMin(c, 2, n - 2, k - 1)
        if (withZero < INF) {
            best = min(best, c[0] + withZero)
        }
        return best.toInt()
    }

    private fun pathMin(c: LongArray, lo: Int, hi: Int, need: Int): Long {
        if (need == 0) {
            return 0
        }
        val m = hi - lo + 1
        if (m <= 0 || need > (m + 1) / 2) {
            return INF
        }
        var prev2 = LongArray(need + 1)
        var prev1 = LongArray(need + 1)
        var cur = LongArray(need + 1)
        prev2.fill(INF)
        prev2[0] = 0
        prev1.fill(INF)
        prev1[0] = 0
        for (i in 0..<m) {
            val w = c[lo + i]
            cur[0] = 0
            for (j in 1..need) {
                cur[j] = min(prev1[j], prev2[j - 1] + w)
            }
            val t = prev2
            prev2 = prev1
            prev1 = cur
            cur = t
        }
        return prev1[need]
    }

    companion object {
        private val INF = Long.MAX_VALUE / 4
    }
}
