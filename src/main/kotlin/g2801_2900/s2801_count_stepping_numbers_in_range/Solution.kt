package g2801_2900.s2801_count_stepping_numbers_in_range

// #Hard #String #Dynamic_Programming #2024_01_19_Time_288_ms_(100.00%)_Space_38.2_MB_(100.00%)

import kotlin.math.abs

class Solution {
    private lateinit var dp: Array<Array<Array<Array<Int?>>>>

    fun countSteppingNumbers(low: String, high: String): Int {
        dp = Array(low.length + 1) { Array(10) { Array(2) { arrayOfNulls(2) } } }
        val count1 = solve(low, 0, 0, 1, 1)
        dp = Array(high.length + 1) { Array(10) { Array(2) { arrayOfNulls(2) } } }
        val count2 = solve(high, 0, 0, 1, 1)
        return (count2!! - count1!! + isStep(low) + MOD) % MOD
    }

    private fun solve(s: String, i: Int, prevDigit: Int, hasBound: Int, curIsZero: Int): Int? {
        if (i >= s.length) {
            if (curIsZero == 1) {
                return 0
            }
            return 1
        }
        if (dp[i][prevDigit][hasBound][curIsZero] != null) {
            return dp[i][prevDigit][hasBound][curIsZero]
        }
        var count = 0
        var limit = 9
        if (hasBound == 1) {
            limit = s[i].code - '0'.code
        }
        for (digit in 0..limit) {
            val nextIsZero = if ((curIsZero == 1 && digit == 0)) 1 else 0
            val nextHasBound = if ((hasBound == 1 && digit == limit)) 1 else 0
            if (curIsZero == 1 || abs(digit - prevDigit) == 1) {
                count = (count + solve(s, i + 1, digit, nextHasBound, nextIsZero)!!) % MOD
            }
        }
        dp[i][prevDigit][hasBound][curIsZero] = count
        return dp[i][prevDigit][hasBound][curIsZero]
    }

    private fun isStep(s: String): Int {
        var isValid = true
        for (i in 0 until s.length - 1) {
            if (abs((s[i + 1].code - s[i].code)) != 1) {
                isValid = false
                break
            }
        }
        if (isValid) {
            return 1
        }
        return 0
    }

    companion object {
        private const val MOD = (1e9 + 7).toInt()
    }
}
