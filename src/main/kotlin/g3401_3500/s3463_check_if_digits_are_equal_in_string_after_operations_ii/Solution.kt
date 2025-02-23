package g3401_3500.s3463_check_if_digits_are_equal_in_string_after_operations_ii

// #Hard #2025_02_23_Time_63_ms_(100.00%)_Space_44.31_MB_(100.00%)

class Solution {
    fun hasSameDigits(s: String): Boolean {
        val n = s.length
        val nMunus2 = n - 2
        var f0 = 0
        var f1 = 0
        for (j in 0..nMunus2) {
            val c = binomMod10(nMunus2, j)
            f0 = (f0 + c * (s[j].code - '0'.code)) % 10
            f1 = (f1 + c * (s[j + 1].code - '0'.code)) % 10
        }
        return f0 == f1
    }

    private fun binomMod10(n: Int, k: Int): Int {
        val r2 = binomMod2(n, k)
        val r5 = binomMod5(n, k)
        for (x in 0..9) {
            if (x % 2 == r2 && x % 5 == r5) {
                return x
            }
        }
        return 0
    }

    private fun binomMod2(n: Int, k: Int): Int {
        return if ((n and k) == k) 1 else 0
    }

    private fun binomMod5(n: Int, k: Int): Int {
        var n = n
        var k = k
        val t = arrayOf<IntArray>(
            intArrayOf(1),
            intArrayOf(1, 1),
            intArrayOf(1, 2, 1),
            intArrayOf(1, 3, 3, 1),
            intArrayOf(1, 4, 1, 4, 1),
        )
        var res = 1
        while (n > 0 || k > 0) {
            val nd = n % 5
            val kd = k % 5
            if (kd > nd) {
                return 0
            }
            res = (res * t[nd][kd]) % 5
            n /= 5
            k /= 5
        }
        return res
    }
}
