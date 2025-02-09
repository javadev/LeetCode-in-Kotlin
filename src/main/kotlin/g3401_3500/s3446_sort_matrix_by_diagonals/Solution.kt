package g3401_3500.s3446_sort_matrix_by_diagonals

// #Medium #2025_02_09_Time_64_(100.00%)_Space_60.34_(100.00%)

class Solution {
    fun sortMatrix(matrix: Array<IntArray>): Array<IntArray> {
        val diagonalMap = mutableMapOf<Int, MutableList<Int>>()
        val rows = matrix.size
        val cols = matrix[0].size
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                val key = i - j
                diagonalMap.computeIfAbsent(key) { mutableListOf() }.add(matrix[i][j])
            }
        }
        for ((key, values) in diagonalMap) {
            if (key < 0) {
                values.sort()
            } else {
                values.sortDescending()
            }
        }
        for (i in 0 until rows) {
            for (j in 0 until cols) {
                val key = i - j
                matrix[i][j] = diagonalMap[key]!!.removeAt(0)
            }
        }
        return matrix
    }
}
