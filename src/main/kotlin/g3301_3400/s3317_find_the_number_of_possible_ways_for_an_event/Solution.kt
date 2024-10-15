package g3301_3400.s3317_find_the_number_of_possible_ways_for_an_event

// #Hard #Dynamic_Programming #Math #Combinatorics
// #2024_10_15_Time_166_ms_(100.00%)_Space_35_MB_(100.00%)

import kotlin.math.min

class Solution {
    fun numberOfWays(n: Int, x: Int, y: Int): Int {
        val fact = LongArray(x + 1)
        fact[0] = 1
        for (i in 1..x) {
            fact[i] = fact[i - 1] * i % MOD
        }
        val invFact = LongArray(x + 1)
        invFact[x] = powMod(fact[x], MOD - 2L)
        for (i in x - 1 downTo 0) {
            invFact[i] = invFact[i + 1] * (i + 1) % MOD
        }
        val powY = LongArray(x + 1)
        powY[0] = 1
        for (k in 1..x) {
            powY[k] = powY[k - 1] * y % MOD
        }
        val localArray = LongArray(x + 1)
        localArray[0] = 1
        for (i in 1..n) {
            val kMax: Int = min(i, x)
            for (k in kMax downTo 1) {
                localArray[k] = (k * localArray[k] + localArray[k - 1]) % MOD
            }
            localArray[0] = 0
        }
        var sum: Long = 0
        val kLimit: Int = min(n, x)
        for (k in 1..kLimit) {
            val localValue: Long = fact[x] * invFact[x - k] % MOD
            var term: Long = localValue * localArray[k] % MOD
            term = term * powY[k] % MOD
            sum = (sum + term) % MOD
        }
        return sum.toInt()
    }

    private fun powMod(a: Long, b: Long): Long {
        var a = a
        var b = b
        var res: Long = 1
        a = a % MOD
        while (b > 0) {
            if ((b and 1L) == 1L) {
                res = res * a % MOD
            }
            a = a * a % MOD
            b = b shr 1
        }
        return res
    }

    companion object {
        private const val MOD = 1000000007
    }
}
