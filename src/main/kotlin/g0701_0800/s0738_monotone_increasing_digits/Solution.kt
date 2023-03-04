package g0701_0800.s0738_monotone_increasing_digits

// #Medium #Math #Greedy #2023_03_03_Time_127_ms_(100.00%)_Space_32.9_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun monotoneIncreasingDigits(n: Int): Int {
        var n = n
        var i = 10
        while (n / i > 0) {
            val digit = n / i % 10
            val endNum = n % i
            val firstEndNum = endNum * 10 / i
            if (digit > firstEndNum) {
                n -= endNum + 1
            }
            i *= 10
        }
        return n
    }
}
