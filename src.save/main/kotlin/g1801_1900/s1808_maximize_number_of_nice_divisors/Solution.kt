package g1801_1900.s1808_maximize_number_of_nice_divisors

// #Hard #Math #Recursion #2023_06_19_Time_135_ms_(100.00%)_Space_33.1_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    private fun modPow(b: Long, e: Int, m: Int): Long {
        var b = b
        var e = e
        if (m == 1) {
            return 0
        }
        if (e == 0 || b == 1L) {
            return 1
        }
        b %= m.toLong()
        var r: Long = 1
        while (e > 0) {
            if (e and 1 == 1) {
                r = r * b % m
            }
            e = e shr 1
            b = b * b % m
        }
        return r
    }

    fun maxNiceDivisors(pf: Int): Int {
        val mod = 1000000007
        val st = intArrayOf(0, 1, 2, 3, 4, 6)
        return if (pf < 5) pf else (modPow(3, pf / 3 - 1, mod) * st[3 + pf % 3] % mod).toInt()
    }
}
