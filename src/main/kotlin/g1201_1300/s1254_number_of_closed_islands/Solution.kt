package g1201_1300.s1254_number_of_closed_islands

// #Medium #Array #Depth_First_Search #Breadth_First_Search #Matrix #Union_Find
// #Graph_Theory_I_Day_2_Matrix_Related_Problems
class Solution {
    private var rows = 0
    private var cols = 0
    private var isLand = false
    fun closedIsland(grid: Array<IntArray>): Int {
        rows = grid.size
        cols = grid[0].size
        var result = 0
        for (r in 0 until rows) {
            for (c in 0 until cols) {
                if (grid[r][c] == 0) {
                    isLand = true
                    dfs(grid, r, c)
                    if (isLand) {
                        result++
                    }
                }
            }
        }
        return result
    }

    private fun dfs(grid: Array<IntArray>, r: Int, c: Int) {
        if (r == 0 || c == 0 || r == rows - 1 || c == cols - 1) {
            isLand = false
        }
        grid[r][c] = 'k'.code
        if (r > 0 && grid[r - 1][c] == 0) {
            dfs(grid, r - 1, c)
        }
        if (c > 0 && grid[r][c - 1] == 0) {
            dfs(grid, r, c - 1)
        }
        if (r < rows - 1 && grid[r + 1][c] == 0) {
            dfs(grid, r + 1, c)
        }
        if (c < cols - 1 && grid[r][c + 1] == 0) {
            dfs(grid, r, c + 1)
        }
    }
}
