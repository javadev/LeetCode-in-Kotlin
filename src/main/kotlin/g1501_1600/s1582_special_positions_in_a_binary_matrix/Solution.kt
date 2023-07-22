package g1501_1600.s1582_special_positions_in_a_binary_matrix

// #Easy #Array #Matrix #2023_06_14_Time_212_ms_(60.00%)_Space_37.8_MB_(80.00%)

class Solution {
    fun numSpecial(mat: Array<IntArray>): Int {
        var count = 0
        for (i in mat.indices) {
            for (j in mat[0].indices) {
                if (mat[i][j] == 1 && isSpecial(mat, i, j)) {
                    count++
                }
            }
        }
        return count
    }

    private fun isSpecial(mat: Array<IntArray>, row: Int, col: Int): Boolean {
        for (i in mat.indices) {
            if (i != row && mat[i][col] == 1) {
                return false
            }
        }
        for (j in mat[0].indices) {
            if (j != col && mat[row][j] == 1) {
                return false
            }
        }
        return true
    }
}
