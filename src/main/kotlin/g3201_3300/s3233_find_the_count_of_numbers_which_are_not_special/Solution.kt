package g3201_3300.s3233_find_the_count_of_numbers_which_are_not_special

// #Medium #Array #Math #Number_Theory #2024_08_03_Time_215_ms_(76.19%)_Space_36.9_MB_(61.90%)

import kotlin.math.sqrt

class Solution {
    fun nonSpecialCount(l: Int, r: Int): Int {
        val primes = sieveOfEratosthenes(sqrt(r.toDouble()).toInt())
        var specialCount = 0

        for (prime in primes) {
            val primeSquare = prime.toLong() * prime
            if (primeSquare in l..r) {
                specialCount++
            }
        }

        val totalNumbersInRange = r - l + 1
        return totalNumbersInRange - specialCount
    }

    private fun sieveOfEratosthenes(n: Int): List<Int> {
        val isPrime = BooleanArray(n + 1)
        for (i in 2..n) {
            isPrime[i] = true
        }

        var p = 2
        while (p * p <= n) {
            if (isPrime[p]) {
                var i = p * p
                while (i <= n) {
                    isPrime[i] = false
                    i += p
                }
            }
            p++
        }

        val primes: MutableList<Int> = ArrayList()
        for (i in 2..n) {
            if (isPrime[i]) {
                primes.add(i)
            }
        }
        return primes
    }
}
