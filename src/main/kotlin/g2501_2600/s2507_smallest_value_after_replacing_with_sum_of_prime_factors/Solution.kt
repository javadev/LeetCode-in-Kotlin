package g2501_2600.s2507_smallest_value_after_replacing_with_sum_of_prime_factors

// #Medium #Math #Number_Theory
@Suppress("NAME_SHADOWING")
class Solution {
    private val memo: MutableMap<Int, Int> = HashMap()
    fun smallestValue(n: Int): Int {
        var n = n
        while (get(n) != n) {
            n = get(n)
        }
        return n
    }

    private operator fun get(n: Int): Int {
        if (memo.containsKey(n)) {
            return memo[n]!!
        }
        val r = Math.pow(n.toDouble(), 0.5)
        val r1 = r.toInt()
        if (r - r1 == 0.0) {
            return 2 * get(r1)
        }
        var res = 0
        for (i in r1 downTo 2) {
            if (n % i == 0) {
                res = get(i) + get(n / i)
            }
        }
        res = if (res == 0) n else res
        memo[n] = res
        return res
    }
}
