package g0801_0900.s0803_bricks_falling_when_hit

// #Hard #Array #Matrix #Union_Find #2023_03_16_Time_742_ms_(100.00%)_Space_53.4_MB_(100.00%)

class Solution {
    private val dirs = arrayOf(intArrayOf(1, 0), intArrayOf(-1, 0), intArrayOf(0, 1), intArrayOf(0, -1))
    fun hitBricks(grid: Array<IntArray>, hits: Array<IntArray>): IntArray {
        val cols = grid[0].size
        for (hit in hits) {
            val x = hit[0]
            val y = hit[1]
            grid[x][y]--
        }
        val row = 0
        for (col in 0 until cols) {
            dfs(row, col, grid)
        }
        val res = IntArray(hits.size)
        for (i in hits.indices.reversed()) {
            val x = hits[i][0]
            val y = hits[i][1]
            grid[x][y]++
            if (grid[x][y] == 1 && isConnectedToRoof(x, y, grid)) {
                res[i] = dfs(x, y, grid) - 1
            }
        }
        return res
    }

    private fun dfs(i: Int, j: Int, grid: Array<IntArray>): Int {
        if (i < 0 || i >= grid.size || j < 0 || j >= grid[0].size || grid[i][j] != 1) {
            return 0
        }
        grid[i][j] = 2
        return (
            dfs(i + 1, j, grid) +
                dfs(i - 1, j, grid) +
                dfs(i, j + 1, grid) +
                dfs(i, j - 1, grid) +
                1
            )
    }

    private fun isConnectedToRoof(i: Int, j: Int, grid: Array<IntArray>): Boolean {
        if (i == 0) {
            return true
        }
        for (d in dirs) {
            val x = i + d[0]
            val y = j + d[1]
            if (x >= 0 && x < grid.size && y >= 0 && y < grid[0].size && grid[x][y] == 2) {
                return true
            }
        }
        return false
    }
}
