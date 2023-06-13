package g1501_1600.s1559_detect_cycles_in_2d_grid

// #Medium #Array #Depth_First_Search #Breadth_First_Search #Matrix #Union_Find
// #2023_06_13_Time_871_ms_(33.33%)_Space_103.6_MB_(33.33%)

class Solution {
    fun containsCycle(grid: Array<CharArray>): Boolean {
        val n = grid.size
        val m = grid[0].size
        val visited = Array(n + 1) { BooleanArray(m + 1) }
        for (i in 0 until n) {
            for (j in 0 until m) {
                if (!visited[i][j] && cycle(grid, i, j, visited, grid[i][j])) {
                    return true
                }
            }
        }
        return false
    }

    private fun cycle(grid: Array<CharArray>, i: Int, j: Int, visited: Array<BooleanArray>, cc: Char): Boolean {
        if (i < 0 || j < 0 || i >= grid.size || j >= grid[0].size || grid[i][j] != cc) {
            return false
        }
        if (visited[i][j]) {
            return true
        }
        visited[i][j] = true
        val temp = grid[i][j]
        grid[i][j] = '*'
        val ans = (
            cycle(grid, i + 1, j, visited, cc) ||
                cycle(grid, i - 1, j, visited, cc) ||
                cycle(grid, i, j + 1, visited, cc) ||
                cycle(grid, i, j - 1, visited, cc)
            )
        grid[i][j] = temp
        return ans
    }
}
