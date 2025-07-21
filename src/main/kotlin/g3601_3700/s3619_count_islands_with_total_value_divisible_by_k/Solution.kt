package g3601_3700.s3619_count_islands_with_total_value_divisible_by_k

// #Medium #2025_07_20_Time_16_ms_(96.67%)_Space_70.90_MB_(100.00%)

class Solution {
    private var m = 0
    private var n = 0

    fun countIslands(grid: Array<IntArray>, k: Int): Int {
        var count = 0
        m = grid.size
        n = grid[0].size
        for (i in 0..<m) {
            for (j in 0..<n) {
                if (grid[i][j] != 0) {
                    val curr = dfs(i, j, grid)
                    if (curr % k == 0) {
                        count++
                    }
                }
            }
        }
        return count
    }

    private fun dfs(i: Int, j: Int, grid: Array<IntArray>): Int {
        if (i >= m || j >= n || i < 0 || j < 0 || grid[i][j] == 0) {
            return Int.Companion.MAX_VALUE
        }
        var count = grid[i][j]
        grid[i][j] = 0
        val x = dfs(i + 1, j, grid)
        val y = dfs(i, j + 1, grid)
        val a = dfs(i - 1, j, grid)
        val b = dfs(i, j - 1, grid)
        if (x != Int.Companion.MAX_VALUE) {
            count += x
        }
        if (y != Int.Companion.MAX_VALUE) {
            count += y
        }
        if (a != Int.Companion.MAX_VALUE) {
            count += a
        }
        if (b != Int.Companion.MAX_VALUE) {
            count += b
        }
        return count
    }
}
