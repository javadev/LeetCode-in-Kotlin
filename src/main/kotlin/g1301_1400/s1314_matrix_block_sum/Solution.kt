package g1301_1400.s1314_matrix_block_sum

// #Medium #Array #Matrix #Prefix_Sum #Dynamic_Programming_I_Day_14
class Solution {
    fun matrixBlockSum(mat: Array<IntArray>, k: Int): Array<IntArray> {
        val rows = mat.size
        val cols = mat[0].size
        val prefixSum = Array(rows + 1) { IntArray(cols + 1) }
        for (i in 1..rows) {
            for (j in 1..cols) {
                prefixSum[i][j] = (
                    (
                        mat[i - 1][j - 1] -
                            prefixSum[i - 1][j - 1]
                        ) + prefixSum[i - 1][j] +
                        prefixSum[i][j - 1]
                    )
            }
        }
        val result = Array(rows) { IntArray(cols) }
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                val iMin = Math.max(i - k, 0)
                val iMax = Math.min(i + k, rows - 1)
                val jMin = Math.max(j - k, 0)
                val jMax = Math.min(j + k, cols - 1)
                result[i][j] = (
                    (
                        prefixSum[iMin][jMin] +
                            prefixSum[iMax + 1][jMax + 1]
                        ) - prefixSum[iMax + 1][jMin] -
                        prefixSum[iMin][jMax + 1]
                    )
            }
        }
        return result
    }
}
