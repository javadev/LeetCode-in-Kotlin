package g3601_3700.s3665_twisted_mirror_path_count

// #Medium #Biweekly_Contest_164 #2025_08_31_Time_114_ms_(100.00%)_Space_120.02_MB_(100.00%)

class Solution {
    fun uniquePaths(grid: Array<IntArray>): Int {
        val n = grid.size
        val m = grid[0].size
        val dp = Array<Array<IntArray>>(n) { Array<IntArray>(m) { IntArray(2) } }
        for (i in 0..<n) {
            for (j in 0..<m) {
                dp[i][j].fill(-1)
            }
        }
        return f(0, 0, 0, grid, n, m, dp)
    }

    private fun f(i: Int, j: Int, dir: Int, grid: Array<IntArray>, n: Int, m: Int, dp: Array<Array<IntArray>>): Int {
        if (i == n - 1 && j == m - 1) {
            return 1
        }
        if (i >= n || j >= m) {
            return 0
        }
        if (dp[i][j][dir] != -1) {
            return dp[i][j][dir]
        }
        var ways: Long = 0
        if (grid[i][j] == 1) {
            ways = if (dir == 0) {
                f(i + 1, j, 1, grid, n, m, dp).toLong()
            } else {
                f(i, j + 1, 0, grid, n, m, dp).toLong()
            }
        } else {
            ways += f(i + 1, j, 1, grid, n, m, dp).toLong()
            ways += f(i, j + 1, 0, grid, n, m, dp).toLong()
        }
        dp[i][j][dir] = ways.toInt() % MOD
        return dp[i][j][dir]
    }

    companion object {
        private const val MOD = 1000000007
    }
}
