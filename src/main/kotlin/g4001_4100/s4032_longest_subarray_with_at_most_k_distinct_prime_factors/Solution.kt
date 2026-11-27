package g4001_4100.s4032_longest_subarray_with_at_most_k_distinct_prime_factors

// #Medium #Array #Hash_Table #Math #Sliding_Window #Number_Theory #Staff #Weekly_Contest_516
// #2026_11_25_Time_40_ms_(100.00%)_Space_84.33_MB_(76.79%)

import kotlin.math.max

class Solution {
    fun longestSubarray(nums: IntArray, k: Int): Int {
        val n = nums.size
        var maxVal = 0
        for (x in nums) {
            if (x > maxVal) {
                maxVal = x
            }
        }
        // 1. Sieve of Eratosthenes to compute Smallest Prime Factor (SPF)
        val spf = IntArray(maxVal + 1)
        for (i in 2..maxVal) {
            spf[i] = i
        }
        var i = 2
        while (i * i <= maxVal) {
            if (spf[i] == i) {
                var j = i * i
                while (j <= maxVal) {
                    if (spf[j] == j) {
                        spf[j] = i
                    }
                    j += i
                }
            }
            i++
        }
        // 2. Precompute distinct prime factors for each unique element present in nums
        val primeFactors = arrayOfNulls<IntArray>(maxVal + 1)
        for (x in nums) {
            if (primeFactors[x] == null) {
                primeFactors[x] = getDistinctPrimeFactors(x, spf)
            }
        }
        // 3. Sliding Window (Two Pointers)
        val primeCount = IntArray(maxVal + 1)
        var distinctPrimes = 0
        var maxLen = 0
        var left = 0
        for (right in 0..<n) {
            // Add all prime factors of nums[right] to the window
            for (prime in primeFactors[nums[right]]!!) {
                if (primeCount[prime] == 0) {
                    distinctPrimes++
                }
                primeCount[prime]++
            }
            // Shrink the window from the left if distinct prime factor count exceeds k
            while (distinctPrimes > k) {
                for (prime in primeFactors[nums[left]]!!) {
                    primeCount[prime]--
                    if (primeCount[prime] == 0) {
                        distinctPrimes--
                    }
                }
                left++
            }
            // If the valid window has length >= 1, update maxLen
            if (left <= right) {
                maxLen = max(maxLen, right - left + 1)
            }
        }
        return maxLen
    }

    private fun getDistinctPrimeFactors(n: Int, spf: IntArray): IntArray {
        var n = n
        val temp = IntArray(7)
        var size = 0
        while (n > 1) {
            val p = spf[n]
            temp[size++] = p
            while (n % p == 0) {
                n /= p
            }
        }
        return temp.copyOf(size)
    }
}
