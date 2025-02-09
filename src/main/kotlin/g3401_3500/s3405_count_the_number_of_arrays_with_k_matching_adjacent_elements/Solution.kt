package g3401_3500.s3405_count_the_number_of_arrays_with_k_matching_adjacent_elements

// #Hard #Math #Combinatorics #2024_12_29_Time_57_ms_(100.00%)_Space_37.63_MB_(100.00%)

class Solution {
    fun countGoodArrays(n: Int, m: Int, k: Int): Int {
        val f = LongArray(n + 1)
        f[0] = 1
        f[1] = 1
        for (i in 2..<f.size) {
            f[i] = f[i - 1] * i % MOD
        }
        var ans = comb(n - 1, k, f)
        ans = ans * m % MOD
        ans = ans * ex(m - 1L, n - k - 1L) % MOD
        return ans.toInt()
    }

    private fun ex(b: Long, e: Long): Long {
        var b = b
        var e = e
        var ans: Long = 1
        while (e > 0) {
            if (e % 2 == 1L) {
                ans = (ans * b) % MOD
            }
            b = (b * b) % MOD
            e = e shr 1
        }
        return ans
    }

    private fun comb(n: Int, r: Int, f: LongArray): Long {
        return f[n] * ff(f[r]) % MOD * ff(f[n - r]) % MOD
    }

    private fun ff(x: Long): Long {
        return ex(x, MOD - 2L)
    }

    companion object {
        private val MOD = (1e9 + 7).toInt()
    }
}
