package g3401_3500.s3402_minimum_operations_to_make_columns_strictly_increasing

// #Easy #Matrix #Simulation #2024_12_29_Time_1_ms_(100.00%)_Space_44.94_MB_(100.00%)

class Solution {
    fun minimumOperations(grid: Array<IntArray>): Int {
        var ans = 0
        for (c in grid[0].indices) {
            for (r in 1..<grid.size) {
                if (grid[r][c] <= grid[r - 1][c]) {
                    ans += grid[r - 1][c] + 1 - grid[r][c]
                    grid[r][c] = grid[r - 1][c] + 1
                }
            }
        }
        return ans
    }
}
