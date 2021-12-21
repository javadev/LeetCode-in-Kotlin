package g0001_0100.s0010_regular_expression_matching

class Solution {
    fun isMatch(text: String, pattern: String): Boolean {
        val dp = Array(text.length + 1) { BooleanArray(pattern.length + 1) }
        dp[text.length][pattern.length] = true
        for (i in text.length downTo 0) {
            for (j in pattern.length - 1 downTo 0) {
                val firstMatch = ((i < text.length && ((pattern[j] == text[i] || pattern[j] == '.'))))
                if (j + 1 < pattern.length && pattern[j + 1] == '*') {
                    dp[i][j] = dp[i][j + 2] || firstMatch && dp[i + 1][j]
                } else {
                    dp[i][j] = firstMatch && dp[i + 1][j + 1]
                }
            }
        }
        return dp[0][0]
    }
}
