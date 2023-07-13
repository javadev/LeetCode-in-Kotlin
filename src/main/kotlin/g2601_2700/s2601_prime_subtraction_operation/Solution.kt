package g2601_2700.s2601_prime_subtraction_operation

// #Medium #Array #Math #Greedy #Binary_Search #Number_Theory
// #2023_07_13_Time_233_ms_(100.00%)_Space_38.4_MB_(100.00%)

class Solution {
    private fun primesUntil(n: Int): IntArray {
        if (n < 2) return intArrayOf()
        val primes = IntArray(200)
        val composite = BooleanArray(n + 1)
        primes[0] = 2
        var added = 1
        var i = 3
        while (i <= n) {
            if (composite[i]) {
                i += 2
                continue
            }
            primes[added++] = i
            var j = i * i
            while (j <= n) {
                composite[j] = true
                j += i
            }
            i += 2
        }
        return primes.copyOf(added)
    }

    fun primeSubOperation(nums: IntArray): Boolean {
        var max = 0
        for (n in nums) {
            max = max.coerceAtLeast(n)
        }
        val primes = primesUntil(max)
        var prev = 0
        for (n in nums) {
            val pos = Arrays.binarySearch(primes, n - prev - 1)
            if (pos == -1 && n <= prev) return false
            prev = n - if (pos == -1) 0 else if (pos < 0) primes[-pos - 2] else primes[pos]
        }
        return true
    }
}
