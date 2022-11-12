package g0301_0400.s0313_super_ugly_number

// #Medium #Array #Dynamic_Programming #Math
// #2022_11_10_Time_330_ms_(100.00%)_Space_36.1_MB_(100.00%)

class Solution {
    fun nthSuperUglyNumber(n: Int, primes: IntArray): Int {
        val primes1 = LongArray(primes.size)
        for (i in primes.indices) {
            primes1[i] = primes[i].toLong()
        }
        val index = IntArray(primes.size)
        val n1 = LongArray(n)
        n1[0] = 1L
        for (i in 1 until n) {
            var min = Long.MAX_VALUE
            for (l in primes1) {
                min = Math.min(min, l)
            }
            n1[i] = min
            for (j in primes1.indices) {
                if (min == primes1[j]) {
                    primes1[j] = primes[j] * n1[++index[j]]
                }
            }
        }
        return n1[n - 1].toInt()
    }
}