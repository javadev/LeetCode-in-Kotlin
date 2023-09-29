package g0001_0100.s0072_edit_distance

// #Hard #Top_100_Liked_Questions #String #Dynamic_Programming
// #Algorithm_II_Day_18_Dynamic_Programming #Dynamic_Programming_I_Day_19
// #Udemy_Dynamic_Programming #Big_O_Time_O(n^2)_Space_O(n2)
// #2023_07_10_Time_182_ms_(92.16%)_Space_36.2_MB_(98.04%)

class Solution {
    fun minDistance(word1: String, word2: String): Int {
        val n1 = word1.length
        val n2 = word2.length
        if (n2 > n1) {
            return minDistance(word2, word1)
        }
        val dp = IntArray(n2 + 1)
        for (j in 0..n2) {
            dp[j] = j
        }
        for (i in 1..n1) {
            var pre = dp[0]
            dp[0] = i
            for (j in 1..n2) {
                val tmp = dp[j]
                dp[j] = if (word1[i - 1] != word2[j - 1]) 1 + Math.min(pre, Math.min(dp[j], dp[j - 1])) else pre
                pre = tmp
            }
        }
        return dp[n2]
    }
}
