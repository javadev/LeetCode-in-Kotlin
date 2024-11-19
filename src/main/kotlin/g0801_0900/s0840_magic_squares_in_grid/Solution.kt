package g0801_0900.s0840_magic_squares_in_grid

// #Medium #Array #Math #Matrix #2023_03_28_Time_149_ms_(100.00%)_Space_34.2_MB_(100.00%)

class Solution {
    fun numMagicSquaresInside(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size
        var count = 0
        for (i in 0 until m - 2) {
            for (j in 0 until n - 2) {
                val set: MutableSet<Int> = HashSet()
                val sum = grid[i][j] + grid[i][j + 1] + grid[i][j + 2]
                if (sum == grid[i + 1][j] + grid[i + 1][j + 1] + grid[i + 1][j + 2] && sum == grid[i + 2][j] +
                    grid[i + 2][j + 1] + grid[i + 2][j + 2] && sum == grid[i][j] + grid[i + 1][j] + grid[i + 2][j] &&
                    sum == grid[i][j + 1] + grid[i + 1][j + 1] + grid[i + 2][j + 1] && sum == grid[i][j + 2] +
                    grid[i + 1][j + 2] + grid[i + 2][j + 2] && sum == grid[i][j] + grid[i + 1][j + 1] +
                    grid[i + 2][j + 2] && sum == grid[i][j + 2] + grid[i + 1][j + 1] + grid[i + 2][j] && set.add(
                        grid[i][j],
                    ) &&
                    isLegit(grid[i][j]) &&
                    set.add(grid[i][j + 1]) &&
                    isLegit(grid[i][j + 1]) &&
                    set.add(grid[i][j + 2]) &&
                    isLegit(grid[i][j + 2]) &&
                    set.add(grid[i + 1][j]) &&
                    isLegit(grid[i + 1][j]) &&
                    set.add(grid[i + 1][j + 1]) &&
                    isLegit(grid[i + 1][j + 1]) &&
                    set.add(grid[i + 1][j + 2]) &&
                    isLegit(grid[i + 1][j + 2]) &&
                    set.add(grid[i + 2][j]) &&
                    isLegit(grid[i + 2][j]) &&
                    set.add(grid[i + 2][j + 1]) &&
                    isLegit(grid[i + 2][j + 1]) &&
                    set.add(grid[i + 2][j + 2]) &&
                    isLegit(grid[i + 2][j + 2])
                ) {
                    count++
                }
            }
        }
        return count
    }

    private fun isLegit(num: Int): Boolean {
        return num in 1..9
    }
}
