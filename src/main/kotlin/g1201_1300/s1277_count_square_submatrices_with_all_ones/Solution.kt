package g1201_1300.s1277_count_square_submatrices_with_all_ones

// #Medium #Array #Dynamic_Programming #Matrix
// #2023_06_08_Time_381_ms_(75.00%)_Space_59.3_MB_(50.00%)

class Solution {
    fun countSquares(matrix: Array<IntArray>): Int {
        var total = 0
        for (ints in matrix) {
            total += ints[0]
        }
        for (i in 1 until matrix[0].size) {
            total += matrix[0][i]
        }
        for (i in 1 until matrix.size) {
            for (j in 1 until matrix[0].size) {
                if (matrix[i][j] == 1) {
                    matrix[i][j] = (
                        Math.min(
                            matrix[i - 1][j - 1],
                            Math.min(matrix[i - 1][j], matrix[i][j - 1]),
                        ) +
                            1
                        )
                }
                total += matrix[i][j]
            }
        }
        return total
    }
}
