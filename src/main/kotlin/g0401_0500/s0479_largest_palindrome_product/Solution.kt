package g0401_0500.s0479_largest_palindrome_product

// #Hard #Math #2023_01_01_Time_147_ms_(100.00%)_Space_32.8_MB_(100.00%)

class Solution {
    fun largestPalindrome(n: Int): Int {
        val pow10 = Math.pow(10.0, n.toDouble()).toLong()
        val max = (pow10 - 1) * (pow10 - Math.sqrt(pow10.toDouble()).toLong() + 1)
        val left = max / pow10
        var t = pow10 / 11
        t -= t.inv() and 1L
        for (i in left downTo 1) {
            var j = t
            val num = gen(i)
            while (j >= i / 11) {
                if (num % j == 0L) {
                    return (num % 1337).toInt()
                }
                j -= 2
            }
        }
        return 9
    }

    private fun gen(x: Long): Long {
        var x = x
        var r = x
        while (x > 0) {
            r = r * 10 + x % 10
            x /= 10
        }
        return r
    }
}
