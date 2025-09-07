package g3601_3700.s3677_count_binary_palindromic_numbers

// #Hard #Weekly_Contest_466 #2025_09_07_Time_1_ms_(100.00%)_Space_41.19_MB_(100.00%)

class Solution {
    private fun makePalin(left: Long, odd: Boolean): Long {
        var left = left
        var ans = left
        if (odd) {
            left = left shr 1
        }
        while (left > 0) {
            ans = (ans shl 1) or (left and 1L)
            left = left shr 1
        }
        return ans
    }

    fun countBinaryPalindromes(n: Long): Int {
        if (n == 0L) {
            return 1
        }
        val len = 64 - java.lang.Long.numberOfLeadingZeros(n)
        var count: Long = 1
        for (i in 1..<len) {
            val half = (i + 1) / 2
            count += 1L shl (half - 1)
        }
        val half = (len + 1) / 2
        val prefix = n shr (len - half)
        val palin = makePalin(prefix, len % 2 == 1)
        count += (prefix - (1L shl (half - 1)))
        if (palin <= n) {
            ++count
        }
        return count.toInt()
    }
}
