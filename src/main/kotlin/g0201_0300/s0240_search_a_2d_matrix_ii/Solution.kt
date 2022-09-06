package g0201_0300.s0240_search_a_2d_matrix_ii

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Binary_Search #Matrix
// #Divide_and_Conquer #Data_Structure_II_Day_4_Array #Binary_Search_II_Day_8
// #2022_07_04_Time_7_ms_(86.73%)_Space_58.4_MB_(9.95%)
class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        var r = 0
        var c = matrix[0].size - 1
        while (r < matrix.size && c >= 0) {
            if (matrix[r][c] == target) {
                return true
            } else if (matrix[r][c] > target) {
                c--
            } else {
                r++
            }
        }
        return false
    }
}
