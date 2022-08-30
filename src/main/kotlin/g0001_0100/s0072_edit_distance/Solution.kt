package g0001_0100.s0072_edit_distance

// #Hard #Top_100_Liked_Questions #String #Dynamic_Programming
// #Algorithm_II_Day_18_Dynamic_Programming #Dynamic_Programming_I_Day_19
// #Udemy_Dynamic_Programming #2022_08_30_Time_320_ms_(63.53%)_Space_37.2_MB_(83.53%)

class Solution {
    fun minDistance(w1: String, w2: String): Int {
        val n1 = w1.length
        val n2 = w2.length
        if (n2 > n1) {
            return minDistance(w2, w1)
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
                dp[j] = if (w1[i - 1] != w2[j - 1]) 1 + Math.min(pre, Math.min(dp[j], dp[j - 1])) else pre
                pre = tmp
            }
        }
        return dp[n2]
    }
}
