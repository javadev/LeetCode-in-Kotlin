package g0801_0900.s0861_score_after_flipping_matrix

// #Medium #Array #Greedy #Matrix #Bit_Manipulation
// #2023_04_03_Time_135_ms_(71.43%)_Space_35_MB_(85.71%)

class Solution {
    fun matrixScore(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size
        var score = 0

        // Flip rows to make the first column all 1's
        for (i in 0 until m) {
            if (grid[i][0] == 0) {
                flipRow(grid, i)
            }
        }

        // Flip columns to maximize the score
        for (j in 1 until n) {
            var ones = 0
            for (i in 0 until m) {
                ones += grid[i][j]
            }
            if (ones < m - ones) {
                flipColumn(grid, j)
            }
        }

        // Calculate the score
        for (i in 0 until m) {
            var rowScore = 0
            for (j in 0 until n) {
                rowScore = rowScore * 2 + grid[i][j]
            }
            score += rowScore
        }
        return score
    }

    private fun flipRow(grid: Array<IntArray>, i: Int) {
        val n = grid[0].size
        for (j in 0 until n) {
            grid[i][j] = 1 - grid[i][j]
        }
    }

    private fun flipColumn(grid: Array<IntArray>, j: Int) {
        val m = grid.size
        for (i in 0 until m) {
            grid[i][j] = 1 - grid[i][j]
        }
    }
}
