package g0701_0800.s0766_toeplitz_matrix

// #Easy #Array #Matrix #2023_03_09_Time_174_ms_(100.00%)_Space_36.6_MB_(93.33%)

class Solution {
    fun isToeplitzMatrix(matrix: Array<IntArray>): Boolean {
        val m = matrix.size
        val n = matrix[0].size
        var i = 0
        var j = 0
        var sameVal = matrix[i][j]
        while (++i < m && ++j < n) {
            if (matrix[i][j] != sameVal) {
                return false
            }
        }
        i = 1
        j = 0
        while (i < m) {
            var tmpI = i
            var tmpJ = j
            sameVal = matrix[i][j]
            while (++tmpI < m && ++tmpJ < n) {
                if (matrix[tmpI][tmpJ] != sameVal) {
                    return false
                }
            }
            i++
        }
        i = 0
        j = 1
        while (j < n) {
            var tmpJ = j
            var tmpI = i
            sameVal = matrix[tmpI][tmpJ]
            while (++tmpI < m && ++tmpJ < n) {
                if (matrix[tmpI][tmpJ] != sameVal) {
                    return false
                }
            }
            j++
        }
        return true
    }
}
