package g1101_1200.s1175_prime_arrangements

// #Easy #Math

@Suppress("NAME_SHADOWING")
class Solution {
    fun numPrimeArrangements(n: Int): Int {
        var n = n
        val a = intArrayOf(
            2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83,
            89, 97
        )
        var c = 0
        while (c < 25 && n >= a[c]) {
            c++
        }
        val m = 1000000007
        var res = 1L
        while (n - c > 0) {
            res *= (n - c).toLong()
            res %= m.toLong()
            n--
        }
        while (c > 0) {
            res *= c.toLong()
            res %= m.toLong()
            c--
        }
        return res.toInt()
    }
}
