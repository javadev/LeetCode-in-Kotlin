package g3601_3700.s3618_split_array_by_prime_indices

// #Medium #Biweekly_Contest_161 #2025_07_22_Time_6_ms_(100.00%)_Space_78.20_MB_(81.48%)

import kotlin.math.abs

class Solution {
    fun splitArray(nums: IntArray): Long {
        val n = nums.size
        val isPrime = sieve(n)
        var sumA: Long = 0
        var sumB: Long = 0
        for (i in 0..<n) {
            if (isPrime[i]) {
                sumA += nums[i].toLong()
            } else {
                sumB += nums[i].toLong()
            }
        }
        return abs(sumA - sumB)
    }

    // Sieve of Eratosthenes to find all prime indices up to n
    private fun sieve(n: Int): BooleanArray {
        val isPrime = BooleanArray(n)
        if (n > 2) {
            isPrime[2] = true
        }
        run {
            var i = 3
            while (i < n) {
                isPrime[i] = true
                i += 2
            }
        }
        if (n > 2) {
            isPrime[2] = true
        }
        var i = 3
        while (i * i < n) {
            if (isPrime[i]) {
                var j = i * i
                while (j < n) {
                    isPrime[j] = false
                    j += i * 2
                }
            }
            i += 2
        }
        isPrime[0] = false
        if (n > 1) {
            isPrime[1] = false
        }
        return isPrime
    }
}
