package g0001_0100.s0074_search_a_2d_matrix

// #Medium #Top_100_Liked_Questions #Array #Binary_Search #Matrix #Data_Structure_I_Day_5_Array
// #Algorithm_II_Day_1_Binary_Search #Binary_Search_I_Day_8 #Level_2_Day_8_Binary_Search
// #Udemy_2D_Arrays/Matrix #2022_08_31_Time_308_ms_(26.39%)_Space_39.2_MB_(12.61%)

class Solution {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean =
        matrix.flatMap { it.asIterable() }.binarySearch(target) >= 0
}
