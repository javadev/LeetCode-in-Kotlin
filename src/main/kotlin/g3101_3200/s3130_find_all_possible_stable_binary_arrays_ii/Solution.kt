package g3101_3200.s3130_find_all_possible_stable_binary_arrays_ii

// #Hard #Dynamic_Programming #Prefix_Sum #2024_05_02_Time_242_ms_(100.00%)_Space_36.7_MB_(100.00%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    private var factorial: LongArray? = null
    private lateinit var reverse: LongArray

    fun numberOfStableArrays(zero: Int, one: Int, limit: Int): Int {
        if (factorial == null) {
            factorial = LongArray(N + 1)
            reverse = LongArray(N + 1)
            factorial!![0] = 1
            reverse[0] = 1
            var x: Long = 1
            for (i in 1..N) {
                x = (x * i) % MOD
                factorial!![i] = x.toInt().toLong()
                reverse[i] = getInverse(x, MOD.toLong())
            }
        }
        var ans: Long = 0
        val s = LongArray(one + 1)
        val n = (min(zero, one) + 1).toInt()
        for (
            groups0 in (zero + limit - 1) / limit..min(zero, n)
                .toInt()
        ) {
            val s0 = calc(groups0, zero, limit)
            for (
                groups1 in max(
                    groups0 - 1,
                    (one + limit - 1) / limit
                )..min((groups0 + 1), one)
            ) {
                var s1: Long
                if (s[groups1] != 0L) {
                    s1 = s[groups1]
                } else {
                    s[groups1] = calc(groups1, one, limit)
                    s1 = s[groups1]
                }
                ans = (ans + s0 * s1 * (if (groups1 == groups0) 2 else 1)) % MOD
            }
        }
        return ((ans + MOD) % MOD).toInt()
    }

    fun calc(groups: Int, x: Int, limit: Int): Long {
        var s: Long = 0
        var sign = 1
        var k = 0
        while (k * limit <= x - groups && k <= groups) {
            s = (s + sign * comb(groups, k) * comb(x - k * limit - 1, groups - 1)) % MOD
            sign *= -1
            k++
        }
        return s
    }

    fun comb(n: Int, k: Int): Long {
        return (factorial!![n] * reverse[k] % MOD) * reverse[n - k] % MOD
    }

    fun getInverse(n: Long, mod: Long): Long {
        var n = n
        var p = mod
        var x: Long = 1
        var y: Long = 0
        while (p > 0) {
            val quotient = n / p
            val remainder = n % p
            val tempY = x - quotient * y
            x = y
            y = tempY
            n = p
            p = remainder
        }
        return ((x % mod) + mod) % mod
    }

    companion object {
        private const val MOD = 1e9.toInt() + 7
        private const val N = 1000
    }
}
