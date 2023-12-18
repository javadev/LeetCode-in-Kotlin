package g2801_2900.s2827_number_of_beautiful_integers_in_the_range

// #Hard #Dynamic_Programming #Math #2023_12_18_Time_169_ms_(100.00%)_Space_38.7_MB_(100.00%)

import kotlin.math.max

class Solution {
    private lateinit var dp: Array<Array<Array<Array<IntArray>>>>
    private var maxLength = 0

    fun numberOfBeautifulIntegers(low: Int, high: Int, k: Int): Int {
        val num1 = low.toString()
        val num2 = high.toString()
        maxLength = max(num1.length.toDouble(), num2.length.toDouble()).toInt()
        dp = Array(4) { Array(maxLength) { Array(maxLength) { Array(maxLength) { IntArray(k) } } } }
        for (a in dp) {
            for (b in a) {
                for (c in b) {
                    for (d in c) {
                        d.fill(-1)
                    }
                }
            }
        }
        return dp(num1, num2, 0, 3, 0, 0, 0, 0, k)
    }

    private fun dp(
        low: String, high: String, i: Int, mode: Int, odd: Int, even: Int, num: Int, rem: Int, k: Int
    ): Int {
        if (i == maxLength) {
            return if (num % k == 0 && odd == even) 1 else 0
        }
        if (dp[mode][i][odd][even][rem] != -1) {
            return dp[mode][i][odd][even][rem]
        }
        var res = 0
        val lowLimit = mode % 2 == 1
        val highLimit = mode / 2 == 1
        var start = 0
        var end = 9
        if (lowLimit) {
            start = digitAt(low, i)
        }
        if (highLimit) {
            end = digitAt(high, i)
        }
        for (j in start..end) {
            var newMode = 0
            if (j == start && lowLimit) {
                newMode += 1
            }
            if (j == end && highLimit) {
                newMode += 2
            }
            var newEven = even
            if (num != 0 || j != 0) {
                newEven += if (j % 2 == 0) 1 else 0
            }
            val newOdd = odd + (if (j % 2 == 1) 1 else 0)
            res +=
                dp(
                    low,
                    high,
                    i + 1,
                    newMode,
                    newOdd,
                    newEven,
                    num * 10 + j,
                    (num * 10 + j) % k,
                    k
                )
        }
        dp[mode][i][odd][even][rem] = res
        return res
    }

    private fun digitAt(num: String, i: Int): Int {
        val index = num.length - maxLength + i
        return if (index < 0) 0 else num[index].code - '0'.code
    }
}
