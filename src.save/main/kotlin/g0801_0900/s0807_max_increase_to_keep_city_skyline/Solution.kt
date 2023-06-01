package g0801_0900.s0807_max_increase_to_keep_city_skyline

// #Medium #Array #Greedy #Matrix #2023_03_17_Time_158_ms_(100.00%)_Space_35.7_MB_(100.00%)

class Solution {
    fun maxIncreaseKeepingSkyline(grid: Array<IntArray>): Int {
        val rows = grid.size
        val cols = grid[0].size
        val tallestR = IntArray(rows)
        val tallestC = IntArray(cols)
        var max: Int
        for (i in 0 until rows) {
            max = 0
            for (j in 0 until cols) {
                if (grid[i][j] > max) {
                    max = grid[i][j]
                }
            }
            tallestR[i] = max
        }
        for (i in 0 until cols) {
            max = 0
            for (ints in grid) {
                if (ints[i] > max) {
                    max = ints[i]
                }
            }
            tallestC[i] = max
        }
        var increase = 0
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                if (tallestR[i] < tallestC[j]) {
                    increase += tallestR[i] - grid[i][j]
                    grid[i][j] += tallestR[i] - grid[i][j]
                } else {
                    increase += tallestC[j] - grid[i][j]
                    grid[i][j] += tallestC[j] - grid[i][j]
                }
            }
        }
        return increase
    }
}
