package g1401_1500.s1463_cherry_pickup_ii

// #Hard #Array #Dynamic_Programming #Matrix
class Solution {
    fun cherryPickup(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size
        val dp = Array(n) { Array(n) { IntArray(m) } }
        dp[0][n - 1][0] = grid[0][0] + grid[0][n - 1]
        for (k in 1 until m) {
            for (i in 0..Math.min(n - 1, k)) {
                for (j in n - 1 downTo Math.max(0, n - 1 - k)) {
                    dp[i][j][k] = maxOfLast(dp, i, j, k) + grid[k][i] + if (i == j) 0 else grid[k][j]
                }
            }
        }
        var result = 0
        for (i in 0..Math.min(n - 1, m)) {
            for (j in n - 1 downTo Math.max(0, n - 1 - m)) {
                result = Math.max(result, dp[i][j][m - 1])
            }
        }
        return result
    }

    private fun maxOfLast(dp: Array<Array<IntArray>>, i: Int, j: Int, k: Int): Int {
        var result = 0
        for (x in -1..1) {
            for (y in -1..1) {
                val r = i + x
                val c = j + y
                if (r >= 0 && r < dp[0].size && c >= 0 && c < dp[0].size) {
                    result = Math.max(result, dp[r][c][k - 1])
                }
            }
        }
        return result
    }
}
