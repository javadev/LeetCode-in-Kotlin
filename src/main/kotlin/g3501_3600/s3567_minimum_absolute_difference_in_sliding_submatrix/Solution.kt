package g3501_3600.s3567_minimum_absolute_difference_in_sliding_submatrix

// #Medium #2025_06_01_Time_18_ms_(100.00%)_Space_53.66_MB_(25.00%)

import kotlin.math.min

class Solution {
    fun minAbsDiff(grid: Array<IntArray>, k: Int): Array<IntArray> {
        val rows = grid.size
        val cols = grid[0].size
        val result = Array<IntArray>(rows - k + 1) { IntArray(cols - k + 1) }
        for (x in 0..rows - k) {
            for (y in 0..cols - k) {
                val size = k * k
                val elements = IntArray(size)
                var idx = 0
                for (i in x..<x + k) {
                    for (j in y..<y + k) {
                        elements[idx++] = grid[i][j]
                    }
                }
                elements.sort()
                var minDiff = Int.Companion.MAX_VALUE
                for (i in 1..<size) {
                    if (elements[i] != elements[i - 1]) {
                        minDiff = min(minDiff, elements[i] - elements[i - 1])
                        if (minDiff == 1) {
                            break
                        }
                    }
                }
                result[x][y] = if (minDiff == Int.Companion.MAX_VALUE) 0 else minDiff
            }
        }
        return result
    }
}
