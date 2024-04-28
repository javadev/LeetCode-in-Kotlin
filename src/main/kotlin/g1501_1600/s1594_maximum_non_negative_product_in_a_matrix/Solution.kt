package g1501_1600.s1594_maximum_non_negative_product_in_a_matrix

// #Medium #Array #Dynamic_Programming #Matrix
// #2023_06_14_Time_224_ms_(100.00%)_Space_35_MB_(100.00%)

class Solution {
    private class Tuple(var max: Long, var min: Long)

    fun maxProductPath(grid: Array<IntArray>): Int {
        // DP
        if (grid.isEmpty() || grid[0].isEmpty()) {
            return 0
        }
        val rows = grid.size
        val cols = grid[0].size
        val dp = Array(rows) { Array(cols) { Tuple(1, 1) } }
        // Init first row and column
        dp[0][0].max = grid[0][0].toLong()
        dp[0][0].min = grid[0][0].toLong()
        for (i in 1 until rows) {
            dp[i][0].max = grid[i][0] * dp[i - 1][0].max
            dp[i][0].min = grid[i][0] * dp[i - 1][0].min
        }
        for (i in 1 until cols) {
            dp[0][i].max = grid[0][i] * dp[0][i - 1].max
            dp[0][i].min = grid[0][i] * dp[0][i - 1].min
        }
        // DP
        for (i in 1 until rows) {
            for (j in 1 until cols) {
                val up1 = dp[i - 1][j].max * grid[i][j]
                val up2 = dp[i - 1][j].min * grid[i][j]
                val left1 = dp[i][j - 1].max * grid[i][j]
                val left2 = dp[i][j - 1].min * grid[i][j]
                dp[i][j].max = Math.max(up1, Math.max(up2, Math.max(left1, left2)))
                dp[i][j].min = Math.min(up1, Math.min(up2, Math.min(left1, left2)))
            }
        }
        return if (dp[rows - 1][cols - 1].max < 0) {
            -1
        } else (dp[rows - 1][cols - 1].max % (1e9 + 7)).toInt()
    }
}
