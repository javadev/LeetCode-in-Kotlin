package g1801_1900.s1888_minimum_number_of_flips_to_make_the_binary_string_alternating

// #Medium #String #Greedy
class Solution {
    fun minFlips(s: String): Int {
        val n = s.length
        val localStr = s + s
        val t = localStr.toCharArray()
        val a = CharArray(n + n)
        val b = CharArray(n + n)
        for (i in 0 until n + n) {
            if (i % 2 == 0) {
                a[i] = '1'
                b[i] = '0'
            } else {
                a[i] = '0'
                b[i] = '1'
            }
        }
        var f = 0
        var sec = 0
        var ans = Int.MAX_VALUE
        for (i in 0 until n + n) {
            if (a[i] != t[i]) {
                f++
            }
            if (b[i] != t[i]) {
                sec++
            }
            if (i >= n) {
                if (a[i - n] != t[i - n]) {
                    f--
                }
                if (b[i - n] != t[i - n]) {
                    sec--
                }
            }
            if (i >= n - 1) {
                ans = Math.min(ans, Math.min(f, sec))
            }
        }
        return ans
    }
}
