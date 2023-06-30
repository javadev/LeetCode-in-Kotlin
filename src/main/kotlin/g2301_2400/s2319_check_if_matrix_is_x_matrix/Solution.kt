package g2301_2400.s2319_check_if_matrix_is_x_matrix

// #Easy #Array #Matrix #2023_06_30_Time_247_ms_(100.00%)_Space_39_MB_(70.00%)

class Solution {
    fun checkXMatrix(grid: Array<IntArray>): Boolean {
        for (i in grid.indices) {
            for (j in grid[0].indices) {
                if (i == j || i + j == grid.size - 1) {
                    if (grid[i][j] == 0) {
                        return false
                    }
                } else {
                    if (grid[i][j] != 0) {
                        return false
                    }
                }
            }
        }
        return true
    }
}
