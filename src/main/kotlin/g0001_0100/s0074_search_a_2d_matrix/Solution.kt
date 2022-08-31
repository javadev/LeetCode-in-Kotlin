package g0001_0100.s0074_search_a_2d_matrix

// #Medium #Top_100_Liked_Questions #Array #Binary_Search #Matrix #Data_Structure_I_Day_5_Array
// #Algorithm_II_Day_1_Binary_Search #Binary_Search_I_Day_8 #Level_2_Day_8_Binary_Search
// #Udemy_2D_Arrays/Matrix #2022_08_31_Time_290_ms_(40.17%)_Space_35.4_MB_(96.48%)

class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        val endRow = matrix.size
        val endCol: Int = matrix[0].size
        var targetRow = 0
        var result = false
        for (i in 0 until endRow) {
            if (matrix[i][endCol - 1] >= target) {
                targetRow = i
                break
            }
        }
        for (i in 0 until endCol) {
            if (matrix[targetRow][i] == target) {
                result = true
                break
            }
        }
        return result
    }
}
