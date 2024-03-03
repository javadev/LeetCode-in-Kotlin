package g3001_3100.s3033_modify_the_matrix

// #Easy #Array #Matrix #2024_03_01_Time_1_ms_(100.00%)_Space_45.4_MB_(77.37%)

class Solution {
    fun modifiedMatrix(matrix: Array<IntArray>): Array<IntArray> {
        for (i in matrix.indices) {
            for (j in matrix[0].indices) {
                if (matrix[i][j] == -1) {
                    var y = 0
                    for (ints in matrix) {
                        if (ints[j] > y) {
                            y = ints[j]
                        }
                    }
                    matrix[i][j] = y
                }
            }
        }
        return matrix
    }
}
