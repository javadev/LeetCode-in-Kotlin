package g3901_4000.s3938_maximum_path_intersection_sum_in_a_grid

// #Medium #Array #Dynamic_Programming #Matrix #Prefix_Sum #Staff #Biweekly_Contest_183
// #2026_09_29_Time_9_ms_(100.00%)_Space_181.37_MB_(48.98%)

import kotlin.math.max

class Solution {
    fun maxScore(grid: Array<IntArray>): Int {
        var ans = Int.MIN_VALUE
        val m = grid.size
        val n = grid[0].size
        // 1. Check all strictly interior single cells
        for (i in 1..<m - 1) {
            for (j in 1..<n - 1) {
                ans = max(ans, grid[i][j])
            }
        }
        // 2. Modified Kadane's for Rows (Minimum length 2)
        for (ints in grid) {
            var currentSum = ints[0]
            for (j in 1..<n) {
                ans = max(ans, currentSum + ints[j])
                currentSum = max(ints[j], currentSum + ints[j])
            }
        }
        // 3. Modified Kadane's for Columns (Minimum length 2)
        for (j in 0..<n) {
            var currentSum = grid[0][j]
            for (i in 1..<m) {
                ans = max(ans, currentSum + grid[i][j])
                currentSum = max(grid[i][j], currentSum + grid[i][j])
            }
        }
        return ans
    }
}
