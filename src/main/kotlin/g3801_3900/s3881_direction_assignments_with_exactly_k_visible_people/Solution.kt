package g3801_3900.s3881_direction_assignments_with_exactly_k_visible_people

import kotlin.math.min // #Medium #Math #Combinatorics #Staff #Biweekly_Contest_179

// #2026_08_13_Time_4_ms_(100.00%)_Space_42.91_MB_(67.27%)

class Solution {
    fun countVisiblePeople(n: Int, pos: Int, k: Int): Int {
        val total = n - 1
        val combinations = nCr(total, k)
        return (2L * combinations % MOD).toInt()
    }

    private fun nCr(n: Int, r: Int): Long {
        var r = r
        r = min(r, n - r)
        var numerator: Long = 1
        var denominator: Long = 1
        for (i in 1..r) {
            numerator = numerator * (n - r + i) % MOD
            denominator = denominator * i % MOD
        }
        return numerator * modPow(denominator, MOD - 2) % MOD
    }

    private fun modPow(base: Long, exponent: Long): Long {
        var base = base
        var exponent = exponent
        var result: Long = 1
        while (exponent > 0) {
            if ((exponent and 1L) == 1L) {
                result = result * base % MOD
            }

            base = base * base % MOD
            exponent = exponent shr 1
        }
        return result
    }

    companion object {
        private const val MOD = 1000000007L
    }
}
