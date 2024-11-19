package g0301_0400.s0372_super_pow

// #Medium #Math #Divide_and_Conquer #2022_11_22_Time_196_ms_(100.00%)_Space_36.9_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun superPow(a: Int, b: IntArray): Int {
        val phi = phi(MOD)
        val arrMod = arrMod(b, phi)
        return if (isGreaterOrEqual(b, phi)) {
            // Cycle has started
            // cycle starts at phi with length phi
            exp(a % MOD, phi + arrMod)
        } else {
            exp(a % MOD, arrMod)
        }
    }

    private fun phi(n: Int): Int {
        var n = n
        var result = n.toDouble()
        var p = 2
        while (p * p <= n) {
            if (n % p > 0) {
                p++
                continue
            }
            while (n % p == 0) {
                n /= p
            }
            result *= 1.0 - 1.0 / p
            p++
        }
        if (n > 1) {
            // if starting n was also prime (so it was greater than sqrt(n))
            result *= 1.0 - 1.0 / n
        }
        return result.toInt()
    }

    // Returns true if number in array is greater than integer named phi
    private fun isGreaterOrEqual(b: IntArray, phi: Int): Boolean {
        var cur = 0
        for (j in b) {
            cur = cur * 10 + j
            if (cur >= phi) {
                return true
            }
        }
        return false
    }

    // Returns number in array mod phi
    private fun arrMod(b: IntArray, phi: Int): Int {
        var res = 0
        for (j in b) {
            res = (res * 10 + j) % phi
        }
        return res
    }

    // Binary exponentiation
    private fun exp(a: Int, b: Int): Int {
        var a = a
        var b = b
        var y = 1
        while (b > 0) {
            if (b % 2 == 1) {
                y = y * a % MOD
            }
            a = a * a % MOD
            b /= 2
        }
        return y
    }

    companion object {
        private const val MOD = 1337
    }
}
