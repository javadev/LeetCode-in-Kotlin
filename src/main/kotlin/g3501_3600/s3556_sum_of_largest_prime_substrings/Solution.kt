package g3501_3600.s3556_sum_of_largest_prime_substrings

// #Medium #2025_05_25_Time_21_ms_(100.00%)_Space_42.82_MB_(100.00%)

class Solution {
    fun sumOfLargestPrimes(s: String): Long {
        val primeSet: MutableSet<Long> = HashSet<Long>()
        val n = s.length
        for (i in 0..<n) {
            var temp: Long = 0
            for (j in i..<n) {
                temp = temp * 10 + (s[j].code - '0'.code)
                if (isPrime(temp)) {
                    primeSet.add(temp)
                }
            }
        }
        val primes: MutableList<Long> = ArrayList<Long>(primeSet)
        primes.sort()
        val m = primes.size
        if (m < 3) {
            var sum: Long = 0
            for (p in primes) {
                sum += p
            }
            return sum
        }
        return primes[m - 1] + primes[m - 2] + primes[m - 3]
    }

    private fun isPrime(n: Long): Boolean {
        if (n < 2) {
            return false
        }
        var i: Long = 2
        while (i * i <= n) {
            if (n % i == 0L) {
                return false
            }
            ++i
        }
        return true
    }
}
