package g0001_0100.s0005_longest_palindromic_substring

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #String #Dynamic_Programming
// #Data_Structure_II_Day_9_String #Algorithm_II_Day_14_Dynamic_Programming
// #Dynamic_Programming_I_Day_17 #Udemy_Strings
// #2023_07_03_Time_162_ms_(99.00%)_Space_36.6_MB_(79.10%)

class Solution {
    fun longestPalindrome(s: String): String {
        val newStr = CharArray(s.length * 2 + 1)
        newStr[0] = '#'
        for (i in s.indices) {
            newStr[2 * i + 1] = s[i]
            newStr[2 * i + 2] = '#'
        }
        val dp = IntArray(newStr.size)
        var friendCenter = 0
        var friendRadius = 0
        var lpsCenter = 0
        var lpsRadius = 0
        for (i in newStr.indices) {
            dp[i] = if (friendCenter + friendRadius > i) Math.min(
                dp[friendCenter * 2 - i],
                friendCenter + friendRadius - i
            ) else 1
            while (i + dp[i] < newStr.size && i - dp[i] >= 0 && newStr[i + dp[i]] == newStr[i - dp[i]]) {
                dp[i]++
            }
            if (friendCenter + friendRadius < i + dp[i]) {
                friendCenter = i
                friendRadius = dp[i]
            }
            if (lpsRadius < dp[i]) {
                lpsCenter = i
                lpsRadius = dp[i]
            }
        }
        return s.substring((lpsCenter - lpsRadius + 1) / 2, (lpsCenter + lpsRadius - 1) / 2)
    }
}
