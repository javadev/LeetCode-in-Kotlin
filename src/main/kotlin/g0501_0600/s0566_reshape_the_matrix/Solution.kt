package g0501_0600.s0566_reshape_the_matrix

// #Easy #Array #Matrix #Simulation #Data_Structure_I_Day_4_Array #Programming_Skills_I_Day_7_Array
// #2023_01_23_Time_239_ms_(99.05%)_Space_36.7_MB_(99.05%)

class Solution {
    fun matrixReshape(mat: Array<IntArray>, r: Int, c: Int): Array<IntArray> {
        if (mat.size * mat[0].size != r * c) {
            return mat
        }
        var p = 0
        val flatArr = IntArray(mat.size * mat[0].size)
        for (ints in mat) {
            for (anInt in ints) {
                flatArr[p++] = anInt
            }
        }
        val ansMat = Array(r) { IntArray(c) }
        var k = 0
        for (i in ansMat.indices) {
            for (j in ansMat[i].indices) {
                ansMat[i][j] = flatArr[k++]
            }
        }
        return ansMat
    }
}
