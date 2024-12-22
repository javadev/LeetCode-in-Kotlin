package g3301_3400.s3393_count_paths_with_the_given_xor_value

// #Medium #2024_12_22_Time_72_ms_(100.00%)_Space_71.2_MB_(100.00%)

class Solution {
    private var m = -1
    private var n = -1
    private lateinit var dp: Array<Array<IntArray>>

    fun countPathsWithXorValue(grid: Array<IntArray>, k: Int): Int {
        m = grid.size
        n = grid[0].size
        dp = Array<Array<IntArray>>(m) { Array<IntArray>(n) { IntArray(16) } }
        for (a in dp) {
            for (b in a) {
                b.fill(-1)
            }
        }
        return dfs(grid, 0, k, 0, 0)
    }

    private fun dfs(grid: Array<IntArray>, xorVal: Int, k: Int, i: Int, j: Int): Int {
        var xorVal = xorVal
        if (i < 0 || j < 0 || j >= n || i >= m) {
            return 0
        }
        xorVal = xorVal xor grid[i][j]
        if (dp[i][j][xorVal] != -1) {
            return dp[i][j][xorVal]
        }
        if (i == m - 1 && j == n - 1 && xorVal == k) {
            return 1
        }
        val down = dfs(grid, xorVal, k, i + 1, j)
        val right = dfs(grid, xorVal, k, i, j + 1)
        dp[i][j][xorVal] = (down + right) % MOD
        return dp[i][j][xorVal]
    }

    companion object {
        private val MOD = (1e9 + 7).toInt()
    }
}
