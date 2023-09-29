package g0001_0100.s0064_minimum_path_sum

// #Medium #Top_100_Liked_Questions #Array #Dynamic_Programming #Matrix
// #Dynamic_Programming_I_Day_16 #Udemy_Dynamic_Programming #Big_O_Time_O(m*n)_Space_O(m*n)
// #2023_07_10_Time_164_ms_(100.00%)_Space_37.3_MB_(84.71%)

class Solution {
    fun minPathSum(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size
        val dp = Array(m) { Array(n) { 0 } }
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (i == 0 && j == 0) {
                    dp[i][j] = grid[i][j]
                } else if (i == 0) {
                    dp[i][j] = dp[i][j - 1] + grid[i][j]
                } else if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + grid[i][j]
                } else {
                    dp[i][j] = minOf(dp[i - 1][j], dp[i][j - 1]) + grid[i][j]
                }
            }
        }
        return dp[m - 1][n - 1]
    }
}
