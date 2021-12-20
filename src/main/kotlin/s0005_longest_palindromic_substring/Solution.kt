package s0005_longest_palindromic_substring

class Solution {
    fun longestPalindrome(s: String): String {
        if (s.isEmpty()) {
            return s
        }
        val dp = Array(s.length) { BooleanArray(s.length) }
        var longestPalindromeStart = 0
        var longestPalindromeLength = 1
        for (i in s.length - 1 downTo 0) {
            // single character is a palindrome so making it true
            dp[i][i] = true
            for (j in i + 1 until s.length) {
                // checking for two edge cases 1.if characters are equal check for diagonal lower
                // left one if true make it true
                // 2. or if both equal and its the first elelment in the loop make it as true
                if ((s[i] == s[j] && dp[i + 1][j - 1]) || (i + 1 == j && s[i] == s[j])) {
                    dp[i][j] = true
                    // update the length if greater than previous
                    if (j - i + 1 > longestPalindromeLength) {
                        longestPalindromeLength = j - i + 1
                        longestPalindromeStart = i
                    }
                }
            }
        }
        // return the substring using starting and ending index
        return s.substring(longestPalindromeStart, longestPalindromeStart + longestPalindromeLength)
    }
}
