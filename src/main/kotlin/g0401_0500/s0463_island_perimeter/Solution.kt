package g0401_0500.s0463_island_perimeter

// #Easy #Array #Depth_First_Search #Breadth_First_Search #Matrix
// #2022_12_28_Time_381_ms_(98.04%)_Space_57.8_MB_(98.04%)

class Solution {
    fun islandPerimeter(grid: Array<IntArray>): Int {
        var islands = 0
        var neighbours = 0
        for (i in grid.indices) {
            for (j in grid[i].indices) {
                if (grid[i][j] == 1) {
                    islands++
                    if (i < grid.size - 1 && grid[i + 1][j] == 1) {
                        neighbours++
                    }
                    if (j < grid[i].size - 1 && grid[i][j + 1] == 1) {
                        neighbours++
                    }
                }
            }
        }
        return 4 * islands - 2 * neighbours
    }
}
