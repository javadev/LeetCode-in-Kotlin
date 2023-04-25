package g0501_0600.s0516_longest_palindromic_subsequence

// #Medium #String #Dynamic_Programming #Dynamic_Programming_I_Day_17
// #2023_01_12_Time_243_ms_(87.50%)_Space_45.8_MB_(66.67%)

class Solution {
    fun longestPalindromeSubseq(s: String): Int {
        if (s.isEmpty()) {
            return 0
        }
        val dp = Array(s.length) { IntArray(s.length) }
        for (jidiff in 0 until s.length) {
            for (i in 0 until s.length) {
                val j = i + jidiff
                if (j >= s.length) {
                    continue
                }
                dp[i][j] = when (j) {
                    i -> 1
                    i + 1 -> if (s[i] == s[j]) 2 else 1
                    else -> if (s[i] == s[j]) 2 + dp[i + 1][j - 1] else Math.max(dp[i + 1][j], dp[i][j - 1])
                }
            }
        }
        return dp[0][s.length - 1]
    }
}
