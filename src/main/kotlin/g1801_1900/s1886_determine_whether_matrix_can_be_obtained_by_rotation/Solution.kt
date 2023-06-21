package g1801_1900.s1886_determine_whether_matrix_can_be_obtained_by_rotation

import java.util.Arrays

// #Easy #Array #Matrix #Programming_Skills_II_Day_7
class Solution {
    fun findRotation(mat: Array<IntArray>, target: Array<IntArray?>?): Boolean {
        for (i in 0..3) {
            if (Arrays.deepEquals(mat, target)) {
                return true
            }
            rotate(mat)
        }
        return false
    }

    private fun rotate(mat: Array<IntArray>) {
        // Reverse Rows
        run {
            var i = 0
            var j = mat.size - 1
            while (i < j) {
                val tempRow = mat[i]
                mat[i] = mat[j]
                mat[j] = tempRow
                i++
                j--
            }
        }
        // Transpose
        for (i in mat.indices) {
            for (j in i + 1 until mat.size) {
                val temp = mat[i][j]
                mat[i][j] = mat[j][i]
                mat[j][i] = temp
            }
        }
    }
}
