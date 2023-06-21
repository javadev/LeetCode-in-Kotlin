package g1901_2000.s1960_maximum_product_of_the_length_of_two_palindromic_substrings

// #Hard #String #Hash_Function #Rolling_Hash
// #2023_06_21_Time_247_ms_(100.00%)_Space_37.5_MB_(100.00%)

class Solution {
    fun maxProduct(s: String): Long {
        val n = s.length
        if (n == 2) {
            return 1
        }
        val len = manaCherS(s)
        val left = LongArray(n)
        var max = 1
        left[0] = max.toLong()
        for (i in 1..n - 1) {
            if (len[(i - max - 1 + i) / 2] > max) {
                max += 2
            }
            left[i] = max.toLong()
        }
        max = 1
        val right = LongArray(n)
        right[n - 1] = max.toLong()
        for (i in n - 2 downTo 0) {
            if (len[(i + max + 1 + i) / 2] > max) {
                max += 2
            }
            right[i] = max.toLong()
        }
        var res: Long = 1
        for (i in 1 until n) {
            res = Math.max(res, left[i - 1] * right[i])
        }
        return res
    }

    private fun manaCherS(s: String): IntArray {
        val len = s.length
        val p = IntArray(len)
        var c = 0
        var r = 0
        for (i in 0 until len) {
            val mirror = 2 * c - i
            if (i < r) {
                p[i] = Math.min(r - i, p[mirror])
            }
            var a = i + (1 + p[i])
            var b = i - (1 + p[i])
            while (a < len && b >= 0 && s[a] == s[b]) {
                p[i]++
                a++
                b--
            }
            if (i + p[i] > r) {
                c = i
                r = i + p[i]
            }
        }
        for (i in 0 until len) {
            p[i] = 1 + 2 * p[i]
        }
        return p
    }
}
