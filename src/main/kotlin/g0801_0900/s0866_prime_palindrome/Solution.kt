package g0801_0900.s0866_prime_palindrome

// #Medium #Math #2023_04_04_Time_143_ms_(100.00%)_Space_33.4_MB_(100.00%)

import kotlin.math.sqrt

@Suppress("NAME_SHADOWING")
class Solution {
    private fun isPrime(n: Int): Boolean {
        if (n % 2 == 0) {
            return n == 2
        }
        var i = 3
        val s = sqrt(n.toDouble()).toInt()
        while (i <= s) {
            if (n % i == 0) {
                return false
            }
            i += 2
        }
        return true
    }

    private fun next(num: Int): Int {
        val s = (num + 1).toString().toCharArray()
        var i = 0
        val n = s.size
        while (i < n shr 1) {
            while (s[i] != s[n - 1 - i]) {
                increment(s, n - 1 - i)
            }
            i++
        }
        return String(s).toInt()
    }

    private fun increment(s: CharArray, i: Int) {
        var i = i
        while (s[i] == '9') {
            s[i--] = '0'
        }
        s[i]++
    }

    fun primePalindrome(n: Int): Int {
        if (n <= 2) {
            return 2
        }
        var p = next(n - 1)
        while (!isPrime(p)) {
            if (p in 10000000..99999999) {
                p = 100000000
            }
            p = next(p)
        }
        return p
    }
}
