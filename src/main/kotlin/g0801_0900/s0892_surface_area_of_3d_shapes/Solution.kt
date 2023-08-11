package g0801_0900.s0892_surface_area_of_3d_shapes

// #Easy #Array #Math #Matrix #Geometry #2023_04_11_Time_180_ms_(100.00%)_Space_35.8_MB_(100.00%)

class Solution {
    fun surfaceArea(grid: Array<IntArray>): Int {
        var surfaceArea = 0
        for (i in grid.indices) {
            for (j in grid[i].indices) {
                if (grid[i][j] > 0) {
                    surfaceArea += 4 * grid[i][j] + 2
                    surfaceArea -= hiddenSides(i, j, grid)
                }
            }
        }
        return surfaceArea
    }

    private fun hiddenSides(i: Int, j: Int, grid: Array<IntArray>): Int {
        var hidden = 0
        val tower = grid[i][j]
        if (j + 1 < grid[i].size && grid[i][j + 1] > 0) {
            hidden += tower.coerceAtMost(grid[i][j + 1])
        }
        if (j - 1 >= 0 && grid[i][j - 1] > 0) {
            hidden += tower.coerceAtMost(grid[i][j - 1])
        }
        if (i + 1 < grid.size && grid[i + 1][j] > 0) {
            hidden += tower.coerceAtMost(grid[i + 1][j])
        }
        if (i - 1 >= 0 && grid[i - 1][j] > 0) {
            hidden += tower.coerceAtMost(grid[i - 1][j])
        }
        return hidden
    }
}
