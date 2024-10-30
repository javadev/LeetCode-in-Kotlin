package g3301_3400.s3337_total_characters_in_string_after_transformations_ii

// #Hard #String #Hash_Table #Dynamic_Programming #Math #Counting
// #2024_10_29_Time_320_ms_(100.00%)_Space_44_MB_(33.33%)

class Solution {
    fun lengthAfterTransformations(s: String, t: Int, nums: List<Int>): Int {
        val m = Array<IntArray>(26) { IntArray(26) }
        for (i in 0..25) {
            for (j in 1..nums[i]) {
                m[(i + j) % 26][i] = m[(i + j) % 26][i] + 1
            }
        }
        var v = IntArray(26)
        for (c in s.toCharArray()) {
            v[c.code - 'a'.code]++
        }
        v = pow(m, v, t.toLong())
        var ans: Long = 0
        for (x in v) {
            ans += x.toLong()
        }
        return (ans % MOD).toInt()
    }

    // A^e*v
    private fun pow(a: Array<IntArray>, v: IntArray, e: Long): IntArray {
        var v = v
        var e = e
        for (i in v.indices) {
            if (v[i] >= MOD) {
                v[i] %= MOD
            }
        }
        var mul = a
        while (e > 0) {
            if ((e and 1L) == 1L) {
                v = mul(mul, v)
            }
            mul = p2(mul)
            e = e ushr 1
        }
        return v
    }

    // int matrix*int vector
    private fun mul(a: Array<IntArray>, v: IntArray): IntArray {
        val m = a.size
        val n = v.size
        val w = IntArray(m)
        for (i in 0 until m) {
            var sum: Long = 0
            for (k in 0 until n) {
                sum += a[i][k].toLong() * v[k]
                if (sum >= BIG) {
                    sum -= BIG
                }
            }
            w[i] = (sum % MOD).toInt()
        }
        return w
    }

    // int matrix^2 (be careful about negative value)
    private fun p2(a: Array<IntArray>): Array<IntArray> {
        val n = a.size
        val c = Array<IntArray>(n) { IntArray(n) }
        for (i in 0 until n) {
            val sum = LongArray(n)
            for (k in 0 until n) {
                for (j in 0 until n) {
                    sum[j] += a[i][k].toLong() * a[k][j]
                    if (sum[j] >= BIG) {
                        sum[j] -= BIG
                    }
                }
            }
            for (j in 0 until n) {
                c[i][j] = (sum[j] % MOD).toInt()
            }
        }
        return c
    }

    companion object {
        const val MOD: Int = 1000000007
        const val M2: Long = MOD.toLong() * MOD
        const val BIG: Long = 8L * M2
    }
}
