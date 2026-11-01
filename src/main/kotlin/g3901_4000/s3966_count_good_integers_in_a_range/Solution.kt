package g3901_4000.s3966_count_good_integers_in_a_range

// #Hard #Dynamic_Programming #Math #Senior_Staff #Biweekly_Contest_185
// #2026_10_20_Time_3_ms_(100.00%)_Space_42.43_MB_(100.00%)

import kotlin.math.abs

class Solution {
    private val dp: Array<Array<Array<Array<Long?>>>> = Array(16) {
        Array(2) {
            Array(10) {
                arrayOfNulls<Long>(10)
            }
        }
    }
    private val digits = IntArray(16)

    fun goodIntegers(l: Long, r: Long, k: Int): Long = calc(r, k) - calc(l - 1, k)

    private fun calc(num: Long, k: Int): Long {
        var temp = num
        var len = 0
        while (temp > 0) {
            digits[len++] = (temp % 10).toInt()
            temp /= 10
        }
        return dfs(len - 1, 0, 1, true, k)
    }

    private fun dfs(index: Int, pre: Int, isLeadingZero: Int, isMaxDigit: Boolean, k: Int): Long {
        if (index == -1) {
            return 1
        }
        if (!isMaxDigit && dp[index][isLeadingZero][pre][k] != null) {
            return dp[index][isLeadingZero][pre][k]!!
        }
        val maxDigit = if (isMaxDigit) digits[index] else 9
        var result = 0L
        for (d in 0..maxDigit) {
            if (isLeadingZero == 1 || abs(d - pre) <= k) {
                result += dfs(
                    index - 1,
                    d,
                    if (isLeadingZero == 1 && d == 0) 1 else 0,
                    isMaxDigit && d == maxDigit,
                    k,
                )
            }
        }
        if (!isMaxDigit) {
            dp[index][isLeadingZero][pre][k] = result
        }
        return result
    }
}
