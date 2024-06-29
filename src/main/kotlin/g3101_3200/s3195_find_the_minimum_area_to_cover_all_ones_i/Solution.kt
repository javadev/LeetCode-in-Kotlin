package g3101_3200.s3195_find_the_minimum_area_to_cover_all_ones_i

// #Medium #Array #Matrix #2024_06_29_Time_1068_ms_(73.91%)_Space_212.6_MB_(47.83%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun minimumArea(grid: Array<IntArray>): Int {
        var xmin = Int.MAX_VALUE
        var xmax = -1
        var ymin = Int.MAX_VALUE
        var ymax = -1
        var i = 0
        val m = grid.size
        val n = grid[0].size
        while (i < m) {
            for (j in 0 until n) {
                if (grid[i][j] == 1) {
                    xmin = min(xmin, i)
                    xmax = max(xmax, i)
                    ymin = min(ymin, j)
                    ymax = max(ymax, j)
                }
            }
            i++
        }
        return (xmax - xmin + 1) * (ymax - ymin + 1)
    }
}
