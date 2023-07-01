package g2301_2400.s2328_number_of_increasing_paths_in_a_grid

// #Hard #Array #Dynamic_Programming #Depth_First_Search #Breadth_First_Search #Matrix #Graph
// #Memoization #Topological_Sort #2023_07_01_Time_689_ms_(79.53%)_Space_59.1_MB_(91.34%)

class Solution {
    private fun help(a: Array<IntArray>, i: Int, j: Int, n: Int, m: Int, dp: Array<IntArray>): Int {
        if (i < 0 || i >= n || j >= m || j < 0) {
            return 0
        }
        if (dp[i][j] != 0) {
            return dp[i][j]
        }
        var res: Long = 0
        if (i < n - 1 && a[i + 1][j] > a[i][j]) {
            res += (1 + help(a, i + 1, j, n, m, dp)).toLong()
        }
        if (i > 0 && a[i - 1][j] > a[i][j]) {
            res += (1 + help(a, i - 1, j, n, m, dp)).toLong()
        }
        if (j > 0 && a[i][j - 1] > a[i][j]) {
            res += (1 + help(a, i, j - 1, n, m, dp)).toLong()
        }
        if (j < m - 1 && a[i][j + 1] > a[i][j]) {
            res += (1 + help(a, i, j + 1, n, m, dp)).toLong()
        }
        dp[i][j] = res.toInt() % 1000000007
        return dp[i][j]
    }

    fun countPaths(grid: Array<IntArray>): Int {
        val n = grid.size
        val m = grid[0].size
        var ans = n.toLong() * m
        val dp = Array(n) { IntArray(m) }
        for (i in 0 until n) {
            for (j in 0 until m) {
                ans += (help(grid, i, j, n, m, dp) % 1000000007).toLong()
            }
        }
        ans %= 1000000007
        return ans.toInt()
    }
}