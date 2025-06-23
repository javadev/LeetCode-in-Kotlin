package g3501_3600.s3591_check_if_any_element_has_prime_frequency

// #Easy #Array #Hash_Table #Math #Counting #Number_Theory
// #2025_06_23_Time_1_ms_(100.00%)_Space_42.48_MB_(100.00%)

import kotlin.math.max

class Solution {
    private fun isPrime(n: Int): Boolean {
        if (n <= 1) {
            return false
        }
        if (n == 2 || n == 3) {
            return true
        }
        for (i in 2..<n) {
            if (n % i == 0) {
                return false
            }
        }
        return true
    }

    fun checkPrimeFrequency(nums: IntArray): Boolean {
        val n = nums.size
        if (n == 1) {
            return false
        }
        var maxi = Int.Companion.MIN_VALUE
        for (`val` in nums) {
            maxi = max(`val`, maxi)
        }
        val hash = IntArray(maxi + 1)
        for (num in nums) {
            hash[num]++
        }
        for (j in hash) {
            if (isPrime(j)) {
                return true
            }
        }
        return false
    }
}
