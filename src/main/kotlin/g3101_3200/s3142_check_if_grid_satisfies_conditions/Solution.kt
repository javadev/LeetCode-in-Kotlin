package g3101_3200.s3142_check_if_grid_satisfies_conditions

// #Easy #Array #Matrix #2024_05_15_Time_170_ms_(91.84%)_Space_37.9_MB_(93.88%)

class Solution {
    fun satisfiesConditions(grid: Array<IntArray>): Boolean {
        val m = grid.size
        val n = grid[0].size
        for (i in 0 until m - 1) {
            if (n > 1) {
                for (j in 0 until n - 1) {
                    if ((grid[i][j] != grid[i + 1][j]) || (grid[i][j] == grid[i][j + 1])) {
                        return false
                    }
                }
            } else {
                if (grid[i][0] != grid[i + 1][0]) {
                    return false
                }
            }
        }
        for (j in 0 until n - 1) {
            if (grid[m - 1][j] == grid[m - 1][j + 1]) {
                return false
            }
        }
        return true
    }
}
