package g4001_4100.s4002_count_valid_sequences

// #Medium #Math #Combinatorics #Staff #Weekly_Contest_512
// #2026_11_17_Time_8_ms_(96.61%)_Space_42.35_MB_(61.02%)

import kotlin.math.min

class Solution {
    private fun power(b: Long, e: Long): Long {
        var b = b
        var e = e
        var r: Long = 1
        while (e > 0) {
            if ((e and 1L) == 1L) {
                r = r * b % MOD
            }
            e = e shr 1
            b = b * b % MOD
        }
        return r
    }

    private fun comb(n: Int, k: Int): Long {
        var k = k
        if (k < 0 || k > n) {
            return 0
        }
        k = min(k, n - k)
        var res: Long = 1
        var den: Long = 1
        for (i in 1..k) {
            res = res * (n - i + 1) % MOD
            den = den * i % MOD
        }
        return res * power(den, MOD - 2L) % MOD
    }

    fun countValidSequences(n: Int, k: Int): Int {
        var res = comb(n - 1, k - 1)
        if (n % 2 == k % 2) {
            res = (res - comb((n + k) / 2 - 1, k - 1) + MOD) % MOD
        }
        return res.toInt()
    }

    companion object {
        private const val MOD = 1000000007
    }
}
