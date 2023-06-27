package g1001_1100.s1034_coloring_a_border

// #Medium #Array #Depth_First_Search #Breadth_First_Search #Matrix
// #2023_05_25_Time_332_ms_(100.00%)_Space_63.2_MB_(100.00%)

import kotlin.math.abs

class Solution {
    fun colorBorder(grid: Array<IntArray>, row: Int, col: Int, color: Int): Array<IntArray> {
        getComp(grid, row, col, color, grid[row][col])
        for (i in grid.indices) {
            for (j in grid[0].indices) {
                if (grid[i][j] < 0) {
                    grid[i][j] = color
                }
            }
        }
        return grid
    }

    private fun getComp(grid: Array<IntArray>, r: Int, c: Int, color: Int, stColor: Int): Int {
        if (r < 0 || c < 0 || r >= grid.size || c >= grid[0].size || abs(grid[r][c]) != stColor) {
            return 0
        }
        if (grid[r][c] == -stColor) {
            return 1
        }
        grid[r][c] = -grid[r][c]
        var count = 0
        count += getComp(grid, r - 1, c, color, stColor)
        count += getComp(grid, r + 1, c, color, stColor)
        count += getComp(grid, r, c - 1, color, stColor)
        count += getComp(grid, r, c + 1, color, stColor)
        if (count == 4) {
            grid[r][c] = -grid[r][c]
        }
        return 1
    }
}
