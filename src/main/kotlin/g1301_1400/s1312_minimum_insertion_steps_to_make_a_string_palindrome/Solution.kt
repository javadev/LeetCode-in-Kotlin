package g1301_1400.s1312_minimum_insertion_steps_to_make_a_string_palindrome

// #Hard #String #Dynamic_Programming
class Solution {
    private fun longestPalindrome(a: String, b: String, n: Int): Int {
        val dp = Array(n + 1) { IntArray(n + 1) }
        for (i in 0 until n + 1) {
            for (j in 0 until n + 1) {
                if (i == 0 || j == 0) {
                    dp[i][j] = 0
                } else if (a[i - 1] == b[j - 1]) {
                    dp[i][j] = 1 + dp[i - 1][j - 1]
                } else {
                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1])
                }
            }
        }
        return dp[n][n]
    }

    fun minInsertions(s: String): Int {
        val n = s.length
        if (n < 2) {
            return 0
        }
        val rs = StringBuilder(s).reverse().toString()
        val l = longestPalindrome(s, rs, n)
        return n - l
    }
}
