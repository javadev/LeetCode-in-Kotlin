package g3201_3300.s3239_minimum_number_of_flips_to_make_binary_grid_palindromic_i

// #Medium #Array #Matrix #Two_Pointers #2024_08_07_Time_856_ms_(87.50%)_Space_109.2_MB_(66.67%)

import kotlin.math.min

class Solution {
    fun minFlips(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size
        var rowFlips = 0
        for (i in 0 until m / 2) {
            for (j in 0 until n) {
                val sum = grid[i][j] + grid[m - 1 - i][j]
                rowFlips += min(sum, (2 - sum))
            }
        }
        var columnFlips = 0
        for (j in 0 until n / 2) {
            for (ints in grid) {
                val sum = ints[j] + ints[n - 1 - j]
                columnFlips += min(sum, (2 - sum))
            }
        }
        return min(rowFlips, columnFlips)
    }
}
