package g0001_0100.s0073_set_matrix_zeroes

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Hash_Table #Matrix
// #Udemy_2D_Arrays/Matrix #Big_O_Time_O(m*n)_Space_O(1)
// #2023_07_10_Time_248_ms_(97.33%)_Space_41.6_MB_(79.87%)

class Solution {
    // Approach: Use first row and first column for storing whether in future
    //           the entire row or column needs to be marked 0
    fun setZeroes(matrix: Array<IntArray>) {
        val m = matrix.size
        val n: Int = matrix[0].size
        var row0 = false
        var col0 = false
        // Check if 0th col needs to be market all 0s in future
        for (ints in matrix) {
            if (ints[0] == 0) {
                col0 = true
                break
            }
        }
        // Check if 0th row needs to be market all 0s in future
        for (i in 0 until n) {
            if (matrix[0][i] == 0) {
                row0 = true
                break
            }
        }
        // Store the signals in 0th row and column
        for (i in 1 until m) {
            for (j in 1 until n) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0
                    matrix[0][j] = 0
                }
            }
        }
        // Mark 0 for all cells based on signal from 0th row and 0th column
        for (i in 1 until m) {
            for (j in 1 until n) {
                if (matrix[i][0] == 0 || matrix[0][j] == 0) {
                    matrix[i][j] = 0
                }
            }
        }
        // Set 0th column
        for (i in 0 until m) {
            if (col0) {
                matrix[i][0] = 0
            }
        }
        // Set 0th row
        for (i in 0 until n) {
            if (row0) {
                matrix[0][i] = 0
            }
        }
    }
}
