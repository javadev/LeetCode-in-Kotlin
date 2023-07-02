package g1801_1900.s1895_largest_magic_square

// #Medium #Array #Matrix #Prefix_Sum #2023_06_22_Time_202_ms_(100.00%)_Space_36.7_MB_(100.00%)

class Solution {
    fun largestMagicSquare(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size
        val rows = Array(m) { IntArray(n + 1) }
        val cols = Array(m + 1) { IntArray(n) }
        for (i in 0 until m) {
            for (j in 0 until n) {
                // cumulative sum for each row
                rows[i][j + 1] = rows[i][j] + grid[i][j]
                // cumulative sum for each column
                cols[i + 1][j] = cols[i][j] + grid[i][j]
            }
        }
        // start with the biggest side possible
        for (side in Math.min(m, n) downTo 2) {
            // check every square
            for (i in 0..m - side) {
                for (j in 0..n - side) {
                    // checks if a square with top left [i, j] and side length is magic
                    if (magic(grid, rows, cols, i, j, side)) {
                        return side
                    }
                }
            }
        }
        return 1
    }

    private fun magic(
        grid: Array<IntArray>,
        rows: Array<IntArray>,
        cols: Array<IntArray>,
        r: Int,
        c: Int,
        side: Int
    ): Boolean {
        val sum = rows[r][c + side] - rows[r][c]
        var d1 = 0
        var d2 = 0
        for (k in 0 until side) {
            d1 += grid[r + k][c + k]
            d2 += grid[r + side - 1 - k][c + k]
            // check each row and column
            if (rows[r + k][c + side] - rows[r + k][c] != sum ||
                cols[r + side][c + k] - cols[r][c + k] != sum
            ) {
                return false
            }
        }
        // checks both diagonals
        return d1 == sum && d2 == sum
    }
}
