package g0001_0100.s0062_unique_paths

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Dynamic_Programming #Math
// #Combinatorics #LeetCode_75_DP/Multidimensional #Algorithm_II_Day_13_Dynamic_Programming
// #Dynamic_Programming_I_Day_15 #Level_1_Day_11_Dynamic_Programming
// #Big_O_Time_O(m*n)_Space_O(m*n) #2023_07_10_Time_118_ms_(94.65%)_Space_33_MB_(81.62%)

class Solution {
    fun uniquePaths(m: Int, n: Int): Int {
        val dp = Array(m) { IntArray(n) }
        for (i in 0 until m) {
            dp[i][0] = 1
        }
        for (j in 0 until n) {
            dp[0][j] = 1
        }
        for (i in 1 until m) {
            for (j in 1 until n) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1]
            }
        }
        return dp[m - 1][n - 1]
    }
}
