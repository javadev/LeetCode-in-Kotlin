package g2801_2900.s2851_string_transformation

// #Hard #String #Dynamic_Programming #Math #String_Matching
// #2023_12_18_Time_377_ms_(100.00%)_Space_49_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    private lateinit var g: Array<LongArray>

    fun numberOfWays(s: String, t: String, k: Long): Int {
        val n = s.length
        val v = kmp(s + s, t)
        g = arrayOf(longArrayOf((v - 1).toLong(), v.toLong()), longArrayOf((n - v).toLong(), (n - 1 - v).toLong()))
        val f = qmi(k)
        return if (s == t) f[0][0].toInt() else f[0][1].toInt()
    }

    private fun kmp(s: String, p: String): Int {
        var s = s
        var p = p
        val n = p.length
        val m = s.length
        s = "#$s"
        p = "#$p"
        val ne = IntArray(n + 1)
        var j = 0
        for (i in 2..n) {
            while (j > 0 && p[i] != p[j + 1]) {
                j = ne[j]
            }
            if (p[i] == p[j + 1]) {
                j++
            }
            ne[i] = j
        }
        var cnt = 0
        j = 0
        for (i in 1..m) {
            while (j > 0 && s[i] != p[j + 1]) {
                j = ne[j]
            }
            if (s[i] == p[j + 1]) {
                j++
            }
            if (j == n) {
                if (i - n + 1 <= n) {
                    cnt++
                }
                j = ne[j]
            }
        }
        return cnt
    }

    private fun mul(c: Array<LongArray>, a: Array<LongArray>, b: Array<LongArray>) {
        val t = Array(2) { LongArray(2) }
        for (i in 0..1) {
            for (j in 0..1) {
                for (k in 0..1) {
                    val mod = 1e9.toInt() + 7
                    t[i][j] = (t[i][j] + a[i][k] * b[k][j]) % mod
                }
            }
        }
        for (i in 0..1) {
            System.arraycopy(t[i], 0, c[i], 0, 2)
        }
    }

    private fun qmi(k: Long): Array<LongArray> {
        var k = k
        val f = Array(2) { LongArray(2) }
        f[0][0] = 1
        while (k > 0) {
            if ((k and 1L) == 1L) {
                mul(f, f, g)
            }
            mul(g, g, g)
            k = k shr 1
        }
        return f
    }
}
