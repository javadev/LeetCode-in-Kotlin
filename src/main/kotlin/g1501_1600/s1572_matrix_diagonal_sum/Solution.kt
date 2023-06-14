package g1501_1600.s1572_matrix_diagonal_sum

// #Easy #Array #Matrix #Programming_Skills_I_Day_7_Array #Udemy_2D_Arrays/Matrix
// #2023_06_14_Time_221_ms_(67.61%)_Space_38.6_MB_(96.15%)

class Solution {
    fun diagonalSum(mat: Array<IntArray>): Int {
        val m = mat.size
        val added: MutableSet<Int> = HashSet()
        var sum = 0
        for (i in 0 until m) {
            for (j in 0 until m) {
                if (i == j) {
                    added.add(i * m + j)
                    sum += mat[i][j]
                }
            }
        }
        for (i in 0 until m) {
            for (j in m - 1 downTo 0) {
                if (i + j == m - 1 && added.add(i * m + j)) {
                    sum += mat[i][j]
                }
            }
        }
        return sum
    }
}
