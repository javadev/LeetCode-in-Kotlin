package g3401_3500.s3472_longest_palindromic_subsequence_after_at_most_k_operations

// #Medium #String #Dynamic_Programming #2025_03_06_Time_142_ms_(55.00%)_Space_116.30_MB_(10.00%)

import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

class Solution {
    fun longestPalindromicSubsequence(s: String, k: Int): Int {
        val n = s.length
        val arr = Array<IntArray>(26) { IntArray(26) }
        for (i in 0..25) {
            for (j in 0..25) {
                arr[i][j] = min(abs(i - j), 26 - abs(i - j))
            }
        }
        val dp = Array<Array<IntArray>>(n) { Array<IntArray>(n) { IntArray(k + 1) } }
        for (i in 0..<n) {
            for (it in 0..k) {
                dp[i][i][it] = 1
            }
        }
        for (length in 2..n) {
            for (i in 0..n - length) {
                val j = i + length - 1
                for (it in 0..k) {
                    if (s[i] == s[j]) {
                        dp[i][j][it] = 2 + dp[i + 1][j - 1][it]
                    } else {
                        val num1 = dp[i + 1][j][it]
                        val num2 = dp[i][j - 1][it]
                        val c = arr[s[i].code - 'a'.code][s[j].code - 'a'.code]
                        val num3 = if (it >= c) 2 + dp[i + 1][j - 1][it - c] else 0
                        dp[i][j][it] = max(max(num1, num2), num3)
                    }
                }
            }
        }
        return dp[0][n - 1][k]
    }
}
