package g0901_1000.s0902_numbers_at_most_n_given_digit_set

// #Hard #Array #Dynamic_Programming #Math #Binary_Search
// #2023_04_13_Time_138_ms_(100.00%)_Space_33.7_MB_(100.00%)

import kotlin.math.pow

class Solution {
    fun atMostNGivenDigitSet(digits: Array<String>, n: Int): Int {
        var ans = 0
        val num = "" + n
        val d = digits.size
        val l = num.length
        for (i in 1 until l) {
            ans += d.toDouble().pow(i.toDouble()).toInt()
        }
        for (i in 0 until l) {
            var flag = false
            for (digit in digits) {
                if (digit[0] < num[i]) {
                    ans += d.toDouble().pow((l - i - 1) * 1.0).toInt()
                } else if (num[i] == digit[0]) {
                    flag = true
                    break
                }
            }
            if (!flag) {
                return ans
            }
        }
        return ans + 1
    }
}
