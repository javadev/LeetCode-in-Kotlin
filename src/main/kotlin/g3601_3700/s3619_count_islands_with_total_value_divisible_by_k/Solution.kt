package g3601_3700.s3619_count_islands_with_total_value_divisible_by_k

// #Medium #Array #Depth_First_Search #Breadth_First_Search #Matrix #Union_Find
// #Biweekly_Contest_161 #2025_07_22_Time_14_ms_(100.00%)_Space_86.20_MB_(47.83%)

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
