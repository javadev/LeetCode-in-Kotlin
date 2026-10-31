package g3701_3800.s3765_complete_prime_number

// #Medium #Math #Enumeration #Number_Theory #Senior #Biweekly_Contest_171
// #2026_05_08_Time_2_ms_(91.62%)_Space_42.93_MB_(55.39%)

class Solution {
    private fun isPrime(n: Int): Boolean {
        if (n != 2 && n % 2 == 0) {
            return false
        }
        var i = 3
        while (i * i <= n) {
            if (n % i == 0) {
                return false
            }
            i += 2
        }
        return true
    }

    fun completePrime(num: Int): Boolean {
        var y = 0
        var z = 1
        var x = num
        while (x > 0) {
            y = z * (x % 10) + y
            if (y == 1 || !isPrime(y)) {
                return false
            }
            if (x == 1 || !isPrime(x)) {
                return false
            }
            x /= 10
            z *= 10
        }
        return true
    }
}
