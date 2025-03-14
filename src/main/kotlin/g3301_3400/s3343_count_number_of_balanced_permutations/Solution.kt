package g3301_3400.s3343_count_number_of_balanced_permutations

// #Hard #String #Dynamic_Programming #Math #Combinatorics
// #2024_11_05_Time_66_ms_(100.00%)_Space_38.1_MB_(100.00%)

class Solution {
    fun countBalancedPermutations(num: String): Int {
        val l = num.length
        var ts = 0
        val c = IntArray(10)
        for (d in num.toCharArray()) {
            c[d.code - '0'.code]++
            ts += d.code - '0'.code
        }
        if (ts % 2 != 0) {
            return 0
        }
        val hs = ts / 2
        val m = (l + 1) / 2
        val f = LongArray(l + 1)
        f[0] = 1
        for (i in 1..l) {
            f[i] = f[i - 1] * i % M
        }
        val invF = LongArray(l + 1)
        invF[l] = modInverse(f[l], M)
        for (i in l - 1 downTo 0) {
            invF[i] = invF[i + 1] * (i + 1) % M
        }
        val dp = Array<LongArray>(m + 1) { LongArray(hs + 1) }
        dp[0][0] = 1
        for (d in 0..9) {
            if (c[d] == 0) {
                continue
            }
            for (k in m downTo 0) {
                for (s in hs downTo 0) {
                    if (dp[k][s] == 0L) {
                        continue
                    }
                    var t = 1
                    while (t <= c[d] && k + t <= m && s + d * t <= hs) {
                        dp[k + t][s + d * t] =
                            (
                                dp[k + t][s + d * t] + dp[k][s] * comb(
                                    c[d],
                                    t,
                                    f,
                                    invF,
                                    M,
                                )
                                ) % M
                        t++
                    }
                }
            }
        }
        val w = dp[m][hs]
        var r: Long = f[m] * f[l - m] % M
        for (d in 0..9) {
            r = r * invF[c[d]] % M
        }
        r = r * w % M
        return r.toInt()
    }

    private fun modInverse(a: Long, m: Int): Long {
        var r: Long = 1
        var p = m - 2L
        var b = a
        while (p > 0) {
            if ((p and 1L) == 1L) {
                r = r * b % m
            }
            b = b * b % m
            p = p shr 1
        }
        return r
    }

    private fun comb(n: Int, k: Int, f: LongArray, invF: LongArray, m: Int): Long {
        if (k > n) {
            return 0
        }
        return f[n] * invF[k] % m * invF[n - k] % m
    }

    companion object {
        private const val M = 1000000007
    }
}
