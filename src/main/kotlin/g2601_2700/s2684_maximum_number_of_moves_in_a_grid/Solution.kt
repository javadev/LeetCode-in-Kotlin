package g2601_2700.s2684_maximum_number_of_moves_in_a_grid

// #Medium #Array #Dynamic_Programming #Matrix
// #2023_07_28_Time_542_ms_(100.00%)_Space_57.4_MB_(57.14%)

class Solution {
    fun maxMoves(grid: Array<IntArray>): Int {
        val height = grid.size
        val width = grid[0].size
        val dp = Array(height) { IntArray(width) { Int.MIN_VALUE } }
        var result = 0
        for (i in 0 until height) {
            dp[i][0] = 0
        }
        for (c in 1 until width) {
            for (r in 0 until height) {
                if (r > 0 && grid[r - 1][c - 1] < grid[r][c]) {
                    dp[r][c] = dp[r][c].coerceAtLeast(dp[r - 1][c - 1] + 1)
                }
                if (grid[r][c - 1] < grid[r][c]) dp[r][c] = dp[r][c].coerceAtLeast(dp[r][c - 1] + 1)
                if (r < height - 1 && grid[r + 1][c - 1] < grid[r][c]) {
                    dp[r][c] = dp[r][c].coerceAtLeast(dp[r + 1][c - 1] + 1)
                }
                result = result.coerceAtLeast(dp[r][c])
            }
        }
        return result
    }
}
