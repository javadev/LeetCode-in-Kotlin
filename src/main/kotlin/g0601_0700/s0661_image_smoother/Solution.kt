package g0601_0700.s0661_image_smoother

// #Easy #Array #Matrix #2023_02_14_Time_352_ms_(100.00%)_Space_44.4_MB_(33.33%)

class Solution {
    fun imageSmoother(matrix: Array<IntArray>?): Array<IntArray>? {
        if (matrix.isNullOrEmpty()) {
            return matrix
        }
        val m = matrix.size
        val n = matrix[0].size
        val result = Array(m) { IntArray(n) }
        for (i in 0 until m) {
            for (j in 0 until n) {
                bfs(matrix, i, j, result, m, n)
            }
        }
        return result
    }

    private fun bfs(matrix: Array<IntArray>, i: Int, j: Int, result: Array<IntArray>, m: Int, n: Int) {
        var sum = matrix[i][j]
        var denominator = 1
        if (j + 1 < n) {
            sum += matrix[i][j + 1]
            denominator++
        }
        if (i + 1 < m && j + 1 < n) {
            sum += matrix[i + 1][j + 1]
            denominator++
        }
        if (i + 1 < m) {
            sum += matrix[i + 1][j]
            denominator++
        }
        if (i + 1 < m && j - 1 >= 0) {
            sum += matrix[i + 1][j - 1]
            denominator++
        }
        if (j - 1 >= 0) {
            sum += matrix[i][j - 1]
            denominator++
        }
        if (i - 1 >= 0 && j - 1 >= 0) {
            sum += matrix[i - 1][j - 1]
            denominator++
        }
        if (i - 1 >= 0) {
            sum += matrix[i - 1][j]
            denominator++
        }
        if (i - 1 >= 0 && j + 1 < n) {
            sum += matrix[i - 1][j + 1]
            denominator++
        }
        result[i][j] = sum / denominator
    }
}
