package g1801_1900.s1830_minimum_number_of_operations_to_make_string_sorted

// #Hard #String #Math #Combinatorics #2023_06_21_Time_226_ms_(100.00%)_Space_36.3_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun makeStringSorted(s: String): Int {
        val n = s.length
        val count = IntArray(26)
        for (i in 0 until n) {
            count[s[i].code - 'a'.code]++
        }
        val fact = LongArray(n + 1)
        fact[0] = 1
        val mod = 1000000007
        for (i in 1..n) {
            fact[i] = fact[i - 1] * i % mod
        }
        var len = n
        var ans: Long = 0
        for (i in 0 until n) {
            len--
            val bound = s[i].code - 'a'.code
            var first = 0
            var rev: Long = 1
            for (k in 0..25) {
                if (k < bound) {
                    first += count[k]
                }
                rev = rev * fact[count[k]] % mod
            }
            ans = (
                ans % mod +
                    (
                    first * fact[len] % mod
                        * modPow(rev, mod.toLong() - 2, mod) %
                        mod
                    ) %
                    mod
                )
            ans %= mod
            count[bound]--
        }
        return ans.toInt()
    }

    private fun modPow(x: Long, n: Long, m: Int): Long {
        var x = x
        var n = n
        var result: Long = 1
        while (n > 0) {
            if (n and 1L != 0L) {
                result = result * x % m
            }
            x = x * x % m
            n = n shr 1
        }
        return result
    }
}
