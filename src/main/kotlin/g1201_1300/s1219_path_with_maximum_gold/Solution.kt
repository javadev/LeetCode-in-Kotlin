package g1201_1300.s1219_path_with_maximum_gold

// #Medium #Array #Matrix #Backtracking
class Solution {
    private var maxGold = 0
    fun getMaximumGold(grid: Array<IntArray>): Int {
        for (i in grid.indices) {
            for (j in grid[0].indices) {
                if (grid[i][j] != 0) {
                    val g = grid[i][j]
                    grid[i][j] = 0
                    gold(grid, i, j, g)
                    grid[i][j] = g
                }
            }
        }
        return maxGold
    }

    private fun gold(grid: Array<IntArray>, row: Int, col: Int, gold: Int) {
        if (gold > maxGold) {
            maxGold = gold
        }
        if (row > 0 && grid[row - 1][col] != 0) {
            val currGold = grid[row - 1][col]
            grid[row - 1][col] = 0
            gold(grid, row - 1, col, gold + currGold)
            grid[row - 1][col] = currGold
        }
        if (col > 0 && grid[row][col - 1] != 0) {
            val currGold = grid[row][col - 1]
            grid[row][col - 1] = 0
            gold(grid, row, col - 1, gold + currGold)
            grid[row][col - 1] = currGold
        }
        if (row < grid.size - 1 && grid[row + 1][col] != 0) {
            // flag=false;
            val currGold = grid[row + 1][col]
            grid[row + 1][col] = 0
            gold(grid, row + 1, col, gold + currGold)
            grid[row + 1][col] = currGold
        }
        if (col < grid[0].size - 1 && grid[row][col + 1] != 0) {
            val currGold = grid[row][col + 1]
            grid[row][col + 1] = 0
            gold(grid, row, col + 1, gold + currGold)
            grid[row][col + 1] = currGold
        }
    }
}
