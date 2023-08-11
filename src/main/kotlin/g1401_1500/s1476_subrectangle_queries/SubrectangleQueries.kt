package g1401_1500.s1476_subrectangle_queries

// #Medium #Array #Matrix #Design #2023_06_13_Time_332_ms_(81.82%)_Space_45_MB_(81.82%)

class SubrectangleQueries(var grid: Array<IntArray>) {
    fun updateSubrectangle(row1: Int, col1: Int, row2: Int, col2: Int, newValue: Int) {
        dfs(grid, row1, col1, row2, col2, newValue)
    }

    fun getValue(row: Int, col: Int): Int {
        return grid[row][col]
    }

    private fun dfs(rectangle: Array<IntArray>, row1: Int, col1: Int, row2: Int, col2: Int, value: Int) {
        for (i in row1..row2) {
            for (j in col1..col2) {
                rectangle[i][j] = value
            }
        }
    }
}
