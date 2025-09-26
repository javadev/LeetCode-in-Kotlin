package g3601_3700.s3665_twisted_mirror_path_count

// #Medium #Array #Dynamic_Programming #Matrix #Biweekly_Contest_164
// #2025_09_07_Time_33_ms_(100.00%)_Space_113.52_MB_(72.73%)

class Solution {
    fun uniquePaths(grid: Array<IntArray>): Int {
        // 0 right, 1 down
        val n = grid.size
        val m = grid[0].size
        val mod = 1000000007
        var dp = IntArray(m)
        dp[0] = 1
        for (j in 1..<m) {
            if (grid[0][j - 1] == 0) {
                dp[j] = dp[j - 1]
            }
        }
        for (i in 1..<n) {
            val next = IntArray(m)
            if (grid[i - 1][0] == 0 && grid[i][0] == 0) {
                next[0] = dp[0]
            }
            for (j in 1..<m) {
                if (grid[i][j] == 0) {
                    next[j] = (next[j] + dp[j]) % mod
                }
                if (grid[i][j - 1] == 0) {
                    next[j] = (next[j] + next[j - 1]) % mod
                } else {
                    next[j] = (next[j] + dp[j - 1]) % mod
                }
            }
            dp = next
        }
        return dp[m - 1]
    }
}
