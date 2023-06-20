package g1901_2000.s1922_count_good_numbers

// #Medium #Math #Recursion #2023_06_20_Time_135_ms_(100.00%)_Space_32.7_MB_(100.00%)

class Solution {
    fun countGoodNumbers(n: Long): Int {
        val mod = 1000000007L
        var result = if (n % 2 == 0L) 1L else 5L
        var base = 20L
        var time = n / 2L
        while (time > 0) {
            if (time % 2L > 0) {
                result *= base
                result %= mod
            }
            time /= 2L
            base = base * base % mod
        }
        return result.toInt()
    }
}
