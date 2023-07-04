package g2501_2600.s2521_distinct_prime_factors_of_product_of_array

// #Medium #Array #Hash_Table #Math #Number_Theory
// #2023_07_04_Time_229_ms_(100.00%)_Space_37.9_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun distinctPrimeFactors(nums: IntArray): Int {
        val hasprime = BooleanArray(primes.size)
        val nr = BooleanArray(1001)
        var r = 0
        a@ for (n in nums) {
            var n = n
            if (nr[n]) continue
            nr[n] = true
            var i = 0
            while (i < primes.size && n > 1) {
                val prime = primes[i]
                while (n % prime == 0) {
                    n /= prime
                    hasprime[i] = true
                    if (nr[n]) continue@a
                    nr[n] = true
                }
                i++
            }
            if (n > 1) {
                r++
            }
        }
        for (p in hasprime) {
            if (p) r++
        }
        return r
    }

    companion object {
        val primes = intArrayOf(2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31)
    }
}
