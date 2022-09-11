package g0201_0300.s0240_search_a_2d_matrix_ii

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Binary_Search #Matrix
// #Divide_and_Conquer #Data_Structure_II_Day_4_Array #Binary_Search_II_Day_8
// #2022_09_10_Time_460_ms_(66.08%)_Space_55.9_MB_(65.19%)

class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        var r = 0
        var c: Int = matrix[0].size - 1
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
