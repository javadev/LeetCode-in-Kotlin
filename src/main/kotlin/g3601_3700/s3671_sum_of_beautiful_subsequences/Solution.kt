package g3601_3700.s3671_sum_of_beautiful_subsequences

// #Hard #Weekly_Contest_465 #2025_08_31_Time_270_ms_(100.00%)_Space_79.84_MB_(100.00%)

import kotlin.math.sqrt

class Solution {
    fun totalBeauty(nums: IntArray): Int {
        var maxV = 0
        for (v in nums) {
            if (v > maxV) {
                maxV = v
            }
        }
        // index by g
        val fenwicks = arrayOfNulls<Fenwick>(maxV + 1)
        // FDiv[g] = # inc subseq with all elements multiple of g
        val fDiv = LongArray(maxV + 1)
        // temp buffer for divisors (max divisors of any number <= ~128 for this constraint)
        val divisors = IntArray(256)
        // Left-to-right DP restricted to multiples of each divisor g
        for (x in nums) {
            var cnt = 0
            val r = sqrt(x.toDouble()).toInt()
            for (d in 1..r) {
                if (x % d == 0) {
                    divisors[cnt++] = d
                    val d2 = x / d
                    if (d2 != d) {
                        divisors[cnt++] = d2
                    }
                }
            }
            for (i in 0..<cnt) {
                val g = divisors[i]
                // coordinate in [1..maxV/g] for this g
                val idxQ = x / g
                var fw = fenwicks[g]
                if (fw == null) {
                    // Size needs to be >= max index (maxV/g). Use +2 for safety and 1-based
                    // indexing.
                    fw = Fenwick(maxV / g + 2)
                    fenwicks[g] = fw
                }
                var dp = 1 + fw.query(idxQ - 1)
                if (dp >= MOD) {
                    dp -= MOD.toLong()
                }
                fw.add(idxQ, dp)
                fDiv[g] += dp
                if (fDiv[g] >= MOD) {
                    fDiv[g] -= MOD.toLong()
                }
            }
        }
        // Inclusion–exclusion to get exact gcd counts
        val exact = LongArray(maxV + 1)
        for (g in maxV downTo 1) {
            var s = fDiv[g]
            var m = g + g
            while (m <= maxV) {
                s -= exact[m]
                if (s < 0) {
                    s += MOD.toLong()
                }
                m += g
            }
            exact[g] = s
        }
        var ans: Long = 0
        for (g in 1..maxV) {
            if (exact[g] != 0L) {
                ans += exact[g] * g % MOD
                if (ans >= MOD) {
                    ans -= MOD.toLong()
                }
            }
        }
        return ans.toInt()
    }

    private class Fenwick(size: Int) {
        private val tree: LongArray = LongArray(size)

        fun add(indexOneBased: Int, delta: Long) {
            var i = indexOneBased
            while (i < tree.size) {
                var v = tree[i] + delta
                if (v >= MOD) {
                    v -= MOD.toLong()
                }
                tree[i] = v
                i += i and -i
            }
        }

        fun query(indexOneBased: Int): Long {
            var sum: Long = 0
            var i = indexOneBased
            while (i > 0) {
                sum += tree[i]
                if (sum >= MOD) {
                    sum -= MOD.toLong()
                }
                i -= i and -i
            }
            return sum
        }
    }

    companion object {
        private const val MOD = 1000000007
    }
}
