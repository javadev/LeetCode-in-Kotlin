package g2501_2600.s2556_disconnect_path_in_a_binary_matrix_by_at_most_one_flip

// #Medium #Array #Dynamic_Programming #Matrix #Depth_First_Search #Breadth_First_Search
// #2023_07_06_Time_571_ms_(100.00%)_Space_68_MB_(100.00%)

class Solution {
    fun isPossibleToCutPath(grid: Array<IntArray>): Boolean {
        val n = grid.size
        val m = grid[0].size
        dfs(0, 0, grid, n, m)
        grid[0][0] = 1
        return !dfs(0, 0, grid, n, m)
    }

    private fun dfs(i: Int, j: Int, a: Array<IntArray>, n: Int, m: Int): Boolean {
        if (i >= n || j >= m || i < 0 || j < 0 || a[i][j] == 0) return false
        if (i == n - 1 && j == m - 1) return true
        a[i][j] = 0
        return dfs(i + 1, j, a, n, m) || dfs(i, j + 1, a, n, m)
    }
}
