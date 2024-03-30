package g2901_3000.s2954_count_the_number_of_infection_sequences

// #Hard #Array #Math #Combinatorics #2024_03_30_Time_1493_ms_(100.00%)_Space_69.7_MB_(100.00%)

import kotlin.math.max

class Solution {
    private val fact = LongArray(M + 1)
    private val invFact = LongArray(M + 1)
    private var init: Long = 0

    private fun modPow(x: Int, y: Int, mod: Int): Int {
        if (y == 0) {
            return 1
        }
        var p = (modPow(x, y / 2, mod) % mod).toLong()
        p = (p * p) % mod
        return if (y % 2 == 1) (p * x % mod).toInt() else p.toInt()
    }

    private fun binomCoeff(n: Int, k: Int): Long {
        return max(
            1.0,
            (fact[n] * invFact[k] % MOD * invFact[n - k] % MOD).toDouble()
        ).toLong()
    }

    fun numberOfSequence(n: Int, sick: IntArray): Int {
        if (init == 0L) {
            init = 1
            fact[0] = 1
            for (i in 1..M) {
                fact[i] = fact[i - 1] * i % MOD
            }
            invFact[M] = modPow(fact[M].toInt(), MOD - 2, MOD).toLong()
            for (i in M - 1 downTo 1) {
                invFact[i] = invFact[i + 1] * (i + 1) % MOD
            }
        }
        var res: Long = 1
        for (i in 1 until sick.size) {
            val group = sick[i] - sick[i - 1] - 1
            res = res * modPow(2, max(0.0, (group - 1).toDouble()).toInt(), MOD) % MOD
            res = res * binomCoeff(sick[i] - i, group) % MOD
        }
        return (res * binomCoeff(n - sick.size, n - sick[sick.size - 1] - 1) % MOD).toInt()
    }

    companion object {
        private const val M = 100000
        private const val MOD = 1000000007
    }
}
