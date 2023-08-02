package g2701_2800.s2719_count_of_integers

// #Hard #String #Dynamic_Programming #Math #2023_08_02_Time_208_ms_(100.00%)_Space_38_MB_(68.42%)

import java.util.Arrays

class Solution {
    private lateinit var dp: Array<Array<Array<IntArray>>>
    private fun countStrings(i: Int, tight1: Boolean, tight2: Boolean, sum: Int, num1: String, num2: String): Int {
        if (sum < 0) return 0
        if (i == num2.length) return 1
        if (dp[i][if (tight1) 1 else 0][if (tight2) 1 else 0][sum] != -1)
            return dp[i][if (tight1) 1 else 0][if (tight2) 1 else 0][sum]
        val lo = if (tight1) num1[i].code - '0'.code else 0
        val hi = if (tight2) num2[i].code - '0'.code else 9
        var count = 0
        for (idx in lo..hi) {
            count = (
                count % MOD + countStrings(
                    i + 1,
                    tight1 and (idx == lo), tight2 and (idx == hi),
                    sum - idx, num1, num2
                ) % MOD
                ) % MOD
        }
        return count.also { dp[i][if (tight1) 1 else 0][if (tight2) 1 else 0][sum] = it }
    }

    fun count(num1: String, num2: String, minSum: Int, maxSum: Int): Int {
        val maxLength = num2.length
        val minLength = num1.length
        val leadingZeroes = maxLength - minLength
        val num1extended: String = "0".repeat(leadingZeroes) + num1
        dp = Array(maxLength) {
            Array(2) {
                Array(2) {
                    IntArray(401)
                }
            }
        }
        for (dim1 in dp) {
            for (dim2 in dim1) {
                for (dim3 in dim2) {
                    Arrays.fill(dim3, -1)
                }
            }
        }
        val total = countStrings(0, true, true, maxSum, num1extended, num2)
        val unnecessary = countStrings(0, true, true, minSum - 1, num1extended, num2)
        var ans = (total - unnecessary) % MOD
        if (ans < 0) {
            ans += MOD
        }
        return ans
    }

    companion object {
        private const val MOD = 1e9.toInt() + 7
    }
}
