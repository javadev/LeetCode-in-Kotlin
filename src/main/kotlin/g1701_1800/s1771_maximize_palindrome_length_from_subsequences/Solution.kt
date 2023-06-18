package g1701_1800.s1771_maximize_palindrome_length_from_subsequences

// #Hard #String #Dynamic_Programming #2023_06_18_Time_248_ms_(100.00%)_Space_69.7_MB_(100.00%)

class Solution {
    fun longestPalindrome(word1: String, word2: String): Int {
        val len1 = word1.length
        val len2 = word2.length
        val len = len1 + len2
        val word = word1 + word2
        val dp = Array(len) { IntArray(len) }
        var max = 0
        val arr = word.toCharArray()
        for (d in 1..len) {
            var i = 0
            while (i + d - 1 < len) {
                if (arr[i] == arr[i + d - 1]) {
                    dp[i][i + d - 1] = if (d == 1) 1 else Math.max(dp[i + 1][i + d - 2] + 2, dp[i][i + d - 1])
                    if (i < len1 && i + d - 1 >= len1) {
                        max = Math.max(max, dp[i][i + d - 1])
                    }
                } else {
                    dp[i][i + d - 1] = Math.max(dp[i + 1][i + d - 1], dp[i][i + d - 2])
                }
                i++
            }
        }
        return max
    }
}
