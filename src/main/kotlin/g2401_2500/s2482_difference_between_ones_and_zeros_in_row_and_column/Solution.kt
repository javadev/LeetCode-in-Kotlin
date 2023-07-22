package g2401_2500.s2482_difference_between_ones_and_zeros_in_row_and_column

// #Medium #Array #Matrix #Simulation #2023_07_05_Time_1061_ms_(100.00%)_Space_78.4_MB_(100.00%)

class Solution {
    fun onesMinusZeros(grid: Array<IntArray>): Array<IntArray> {
        val rowOne = IntArray(grid.size)
        val colOne = IntArray(grid[0].size)
        val m = grid.size
        val n = grid[0].size
        for (i in 0 until m) {
            var c = 0
            for (j in 0 until n) {
                if (grid[i][j] == 1) {
                    c++
                }
            }
            rowOne[i] = c
        }
        for (i in 0 until n) {
            var c = 0
            for (ints in grid) {
                if (ints[i] == 1) {
                    c++
                }
            }
            colOne[i] = c
        }
        for (i in 0 until m) {
            for (j in 0 until n) {
                grid[i][j] = rowOne[i] + colOne[j] - (m - rowOne[i]) - (n - colOne[j])
            }
        }
        return grid
    }
}
