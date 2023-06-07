package g1201_1300.s1252_cells_with_odd_values_in_a_matrix

// #Easy #Array #Math #Simulation
class Solution {
    fun oddCells(n: Int, m: Int, indices: Array<IntArray>): Int {
        val matrix = Array(n) { IntArray(m) }
        for (index in indices) {
            addOneToRow(matrix, index[0])
            addOneToColumn(matrix, index[1])
        }
        var oddNumberCount = 0
        for (ints in matrix) {
            for (j in matrix[0].indices) {
                if (ints[j] % 2 != 0) {
                    oddNumberCount++
                }
            }
        }
        return oddNumberCount
    }

    private fun addOneToColumn(matrix: Array<IntArray>, columnIndex: Int) {
        for (i in matrix.indices) {
            matrix[i][columnIndex] += 1
        }
    }

    private fun addOneToRow(matrix: Array<IntArray>, rowIndex: Int) {
        for (j in matrix[0].indices) {
            matrix[rowIndex][j] += 1
        }
    }
}
