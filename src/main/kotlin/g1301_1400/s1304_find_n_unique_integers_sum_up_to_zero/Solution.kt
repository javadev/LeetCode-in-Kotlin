package g1301_1400.s1304_find_n_unique_integers_sum_up_to_zero

// #Easy #Array #Math
class Solution {
    fun sumZero(n: Int): IntArray {
        val result = IntArray(n)
        var start = -n / 2
        for (i in 0 until n / 2) {
            result[i] = start++
        }
        if (n % 2 == 0) {
            start++
        }
        for (i in n / 2 until n) {
            result[i] = start++
        }
        return result
    }
}
