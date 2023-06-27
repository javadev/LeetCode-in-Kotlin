package g0901_1000.s0980_unique_paths_iii

// #Hard #Array #Matrix #Bit_Manipulation #Backtracking
// #2023_05_09_Time_134_ms_(100.00%)_Space_34.8_MB_(76.92%)

class Solution {
    private val row = intArrayOf(0, 0, 1, -1)
    private val col = intArrayOf(1, -1, 0, 0)

    private fun isSafe(grid: Array<IntArray>, rows: Int, cols: Int, i: Int, j: Int): Int {
        if (i < 0 || j < 0 || i >= rows || j >= cols || grid[i][j] == -1) {
            return 0
        }
        if (grid[i][j] == 2) {
            for (l in 0 until rows) {
                for (m in 0 until cols) {
                    if (grid[l][m] == 0) {
                        /* Return 0 if all zeros in the path are not covered */
                        return 0
                    }
                }
            }
            /* Return 1, as we covered all zeros in the path */
            return 1
        }
        /* mark as visited */
        grid[i][j] = -1
        var result = 0
        for (k in 0..3) {
            /* travel in all four directions (up,down,right,left) */
            result += isSafe(grid, rows, cols, i + row[k], j + col[k])
        }
        /* Mark unvisited again to backtrack */
        grid[i][j] = 0
        return result
    }

    fun uniquePathsIII(grid: Array<IntArray>): Int {
        val rows = grid.size
        val cols = grid[0].size
        var result = 0
        for (k in 0 until rows) {
            for (m in 0 until cols) {
                if (grid[k][m] == 1) {
                    /* find indexes where 1 is located and start covering paths */
                    result = isSafe(grid, rows, cols, k, m)
                    break
                }
            }
        }
        return result
    }
}
