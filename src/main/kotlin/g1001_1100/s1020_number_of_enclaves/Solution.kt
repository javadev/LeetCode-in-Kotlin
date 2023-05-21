package g1001_1100.s1020_number_of_enclaves

// #Medium #Array #Depth_First_Search #Breadth_First_Search #Matrix #Union_Find
// #Graph_Theory_I_Day_3_Matrix_Related_Problems
// #2023_05_21_Time_369_ms_(76.26%)_Space_90.3_MB_(16.91%)

class Solution {
    fun numEnclaves(grid: Array<IntArray>): Int {
        val visited = Array(grid.size) {
            BooleanArray(
                grid[0].size
            )
        }
        for (i in grid.indices) {
            for (j in grid[0].indices) {
                if (grid[i][j] == 1 && (i == 0 || j == 0 || i == grid.size - 1 || j == grid[0].size - 1)) {
                    move(grid, i, j, visited)
                }
            }
        }
        var count = 0
        for (i in 1 until visited.size - 1) {
            for (j in 1 until visited[0].size - 1) {
                if (!visited[i][j] && grid[i][j] == 1) count++
            }
        }
        return count
    }

    companion object {
        fun move(g: Array<IntArray>, i: Int, j: Int, b: Array<BooleanArray>) {
            if (i < 0 || j < 0 || i == g.size || j == g[0].size || g[i][j] == 0 || b[i][j]) return
            b[i][j] = true
            move(g, i + 1, j, b)
            move(g, i - 1, j, b)
            move(g, i, j - 1, b)
            move(g, i, j + 1, b)
        }
    }
}
