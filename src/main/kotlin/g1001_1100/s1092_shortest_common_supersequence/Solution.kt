package g1001_1100.s1092_shortest_common_supersequence

// #Hard #String #Dynamic_Programming #2023_06_02_Time_174_ms_(100.00%)_Space_37.9_MB_(100.00%)

class Solution {
    fun shortestCommonSupersequence(str1: String, str2: String): String {
        val m = str1.length
        val n = str2.length
        val dp = Array(m + 1) { IntArray(n + 1) }
        for (i in 0..m) {
            for (j in 0..n) {
                if (i == 0) {
                    dp[i][j] = j
                } else if (j == 0) {
                    dp[i][j] = i
                } else if (str1[i - 1] == str2[j - 1]) {
                    dp[i][j] = 1 + dp[i - 1][j - 1]
                } else {
                    dp[i][j] = 1 + Math.min(dp[i - 1][j], dp[i][j - 1])
                }
            }
        }
        // Length of the ShortestSuperSequence
        var l = dp[m][n]
        val arr = CharArray(l)
        var i = m
        var j = n
        while (i > 0 && j > 0) {
            /* If current character in str1 and str2 are same, then
            current character is part of shortest supersequence */
            if (str1[i - 1] == str2[j - 1]) {
                arr[--l] = str1[i - 1]
                i--
                j--
            } else if (dp[i - 1][j] < dp[i][j - 1]) {
                arr[--l] = str1[i - 1]
                i--
            } else {
                arr[--l] = str2[j - 1]
                j--
            }
        }
        while (i > 0) {
            arr[--l] = str1[i - 1]
            i--
        }
        while (j > 0) {
            arr[--l] = str2[j - 1]
            j--
        }
        return String(arr)
    }
}
