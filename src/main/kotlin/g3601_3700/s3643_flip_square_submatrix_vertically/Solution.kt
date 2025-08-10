package g3601_3700.s3643_flip_square_submatrix_vertically

// #Easy #Weekly_Contest_462 #2025_08_10_Time_0_ms_(100.00%)_Space_45.80_MB_(59.82%)

class Solution {
    fun reverseSubmatrix(grid: Array<IntArray>, x: Int, y: Int, k: Int): Array<IntArray> {
        for (i in 0..<k / 2) {
            val top = x + i
            val bottom = x + k - 1 - i
            for (col in 0..<k) {
                val temp = grid[top][y + col]
                grid[top][y + col] = grid[bottom][y + col]
                grid[bottom][y + col] = temp
            }
        }
        return grid
    }
}
