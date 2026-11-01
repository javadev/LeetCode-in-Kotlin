package g3901_4000.s3918_sum_of_primes_between_number_and_its_reverse

// #Medium #Math #Number_Theory #Senior #Weekly_Contest_500
// #2026_09_15_Time_3_ms_(96.45%)_Space_42.41_MB_(83.95%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    private fun isPrime(x: Int): Boolean {
        if (x <= 1) {
            return false
        }
        if (x == 2) {
            return true
        }
        if (x % 2 == 0) {
            return false
        }
        var i = 3
        while (i * i <= x) {
            if (x % i == 0) {
                return false
            }
            i += 2
        }
        return true
    }

    private fun reverseNum(n: Int): Int {
        var n = n
        var r = 0
        while (n > 0) {
            r = r * 10 + (n % 10)
            n /= 10
        }
        return r
    }

    fun sumOfPrimesInRange(n: Int): Int {
        val r = reverseNum(n)
        val low = min(n, r)
        val high = max(n, r)
        var sum = 0
        for (i in low..high) {
            if (isPrime(i)) {
                sum += i
            }
        }
        return sum
    }
}
