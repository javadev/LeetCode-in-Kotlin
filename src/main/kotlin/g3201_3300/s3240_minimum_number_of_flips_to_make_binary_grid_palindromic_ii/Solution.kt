package g3201_3300.s3240_minimum_number_of_flips_to_make_binary_grid_palindromic_ii

// #Medium #Array #Matrix #Two_Pointers #2024_08_07_Time_805_ms_(100.00%)_Space_99_MB_(100.00%)

import kotlin.math.min

class Solution {
    fun minFlips(grid: Array<IntArray>): Int {
        var res = 0
        var one = 0
        var diff = 0
        val m = grid.size
        val n = grid[0].size
        // Handle quadrants
        for (i in 0 until m / 2) {
            for (j in 0 until n / 2) {
                val v =
                    (
                        grid[i][j] +
                            grid[i][n - 1 - j] +
                            grid[m - 1 - i][j] +
                            grid[m - 1 - i][n - 1 - j]
                        )
                res += min(v, (4 - v))
            }
        }
        // Handle middle column
        if (n % 2 > 0) {
            for (i in 0 until m / 2) {
                diff += grid[i][n / 2] xor grid[m - 1 - i][n / 2]
                one += grid[i][n / 2] + grid[m - 1 - i][n / 2]
            }
        }
        // Handle middle row
        if (m % 2 > 0) {
            for (j in 0 until n / 2) {
                diff += grid[m / 2][j] xor grid[m / 2][n - 1 - j]
                one += grid[m / 2][j] + grid[m / 2][n - 1 - j]
            }
        }
        // Handle center point
        if (n % 2 > 0 && m % 2 > 0) {
            res += grid[m / 2][n / 2]
        }
        // Divisible by 4
        if (diff == 0 && one % 4 > 0) {
            res += 2
        }
        return res + diff
    }
}
