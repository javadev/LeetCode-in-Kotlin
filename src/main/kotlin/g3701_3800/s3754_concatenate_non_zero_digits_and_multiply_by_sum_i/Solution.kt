package g3701_3800.s3754_concatenate_non_zero_digits_and_multiply_by_sum_i

// #Easy #Math #Mid_Level #Weekly_Contest_477
// #2026_04_25_Time_1_ms_(100.00%)_Space_42.50_MB_(73.85%)

import kotlin.math.abs

class Solution {
    fun sumAndMultiply(n: Int): Long {
        var newNum = 0
        var y = abs(n)
        while (y > 0) {
            val rem = y % 10
            if (rem != 0) {
                newNum = newNum * 10 + rem
            }
            y /= 10
        }
        var temp = 0
        while (newNum > 0) {
            val rem = newNum % 10
            temp = temp * 10 + rem
            newNum /= 10
        }
        val x = temp
        var sum: Long = 0
        while (temp > 0) {
            val rem = temp % 10
            sum += rem.toLong()
            temp /= 10
        }
        return sum * x
    }
}
