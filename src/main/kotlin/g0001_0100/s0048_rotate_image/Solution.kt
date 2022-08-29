package g0001_0100.s0048_rotate_image

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Math #Matrix
// #Data_Structure_II_Day_3_Array #Programming_Skills_II_Day_7 #Udemy_2D_Arrays/Matrix
// #2022_08_29_Time_287_ms_(46.50%)_Space_35.9_MB_(45.39%)

class Solution {
    fun rotate(matrix: Array<IntArray>) {
        val n: Int = matrix.size
        for (i in 0 until n / 2) {
            for (j in i until n - i - 1) {
                val pos = arrayOf(
                    intArrayOf(i, j),
                    intArrayOf(j, n - 1 - i),
                    intArrayOf(n - 1 - i, n - 1 - j),
                    intArrayOf(n - 1 - j, i)
                )
                var t = matrix[pos[0][0]][pos[0][1]]
                for (k in 1 until pos.size) {
                    val temp = matrix[pos[k][0]][pos[k][1]]
                    matrix[pos[k][0]][pos[k][1]] = t
                    t = temp
                }
                matrix[pos[0][0]][pos[0][1]] = t
            }
        }
    }
}
