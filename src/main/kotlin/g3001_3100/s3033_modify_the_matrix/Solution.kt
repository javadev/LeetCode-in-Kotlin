package g3001_3100.s3033_modify_the_matrix

// #Easy #Array #Matrix #2024_03_03_Time_270_ms_(41.94%)_Space_45.5_MB_(33.87%)

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
