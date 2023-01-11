package g0301_0400.s0304_range_sum_query_2d_immutable

// #Medium #Array #Matrix #Design #Prefix_Sum #Dynamic_Programming_I_Day_14
// #Programming_Skills_II_Day_13 #Udemy_2D_Arrays/Matrix
// #2022_11_07_Time_1373_ms_(85.71%)_Space_129.1_MB_(75.00%)

class NumMatrix(matrix: Array<IntArray>) {

    private val M = matrix.size
    private val N = if (M > 0) matrix[0].size else 0

    var array = Array<IntArray> (M + 1) { IntArray(N + 1) }

    init {
        for (i in 1..M) {
            for (j in 1..N) {
                array[i][j] = matrix[i - 1][j - 1] + array[i][j - 1] + array[i - 1][j] - array[i - 1][j - 1]
            }
        }
    }

    fun sumRegion(row1: Int, col1: Int, row2: Int, col2: Int): Int {
        return array[row2 + 1][col2 + 1] - array[row2 + 1][col1] - array[row1][col2 + 1] + array[row1][col1]
    }
}

/*
 * Your NumMatrix object will be instantiated and called as such:
 * var obj = NumMatrix(matrix)
 * var param_1 = obj.sumRegion(row1,col1,row2,col2)
 */
