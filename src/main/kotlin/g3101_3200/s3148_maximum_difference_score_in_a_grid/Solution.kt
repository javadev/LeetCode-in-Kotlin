package g3101_3200.s3148_maximum_difference_score_in_a_grid

// #Medium #Array #Dynamic_Programming #Matrix
// #2024_05_15_Time_777_ms_(84.62%)_Space_73.3_MB_(79.49%)

import kotlin.math.max

class Solution {
    fun maxScore(grid: List<List<Int>>): Int {
        val m = grid.size - 1
        var row = grid[m]
        var n = row.size
        val maxRB = IntArray(n--)
        maxRB[n] = row[n]
        var mx = maxRB[n]
        var result = Int.MIN_VALUE
        for (i in n - 1 downTo 0) {
            val x = row[i]
            result = max(result, (mx - x))
            mx = max(mx, x)
            maxRB[i] = mx
        }
        for (i in m - 1 downTo 0) {
            row = grid[i]
            mx = 0
            for (j in n downTo 0) {
                mx = max(mx, maxRB[j])
                val x = row[j]
                result = max(result, (mx - x))
                mx = max(mx, x)
                maxRB[j] = mx
            }
        }
        return result
    }
}
