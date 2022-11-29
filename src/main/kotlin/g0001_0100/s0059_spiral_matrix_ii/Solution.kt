package g0001_0100.s0059_spiral_matrix_ii

// #Medium #Array #Matrix #Simulation #Data_Structure_II_Day_3_Array
// #2022_09_27_Time_153_ms_(100.00%)_Space_34_MB_(98.15%)

class Solution {
    fun generateMatrix(n: Int): Array<IntArray> {
        var num = 1
        var rStart = 0
        var rEnd = n - 1
        var cStart = 0
        var cEnd = n - 1
        val spiral = Array(n) { IntArray(n) }
        while (rStart <= rEnd && cStart <= cEnd) {
            for (k in cStart..cEnd) {
                spiral[rStart][k] = num++
            }
            rStart++
            for (k in rStart..rEnd) {
                spiral[k][cEnd] = num++
            }
            cEnd--
            if (rStart <= rEnd) {
                for (k in cEnd downTo cStart) {
                    spiral[rEnd][k] = num++
                }
            }
            rEnd--
            if (cStart <= cEnd) {
                for (k in rEnd downTo rStart) {
                    spiral[k][cStart] = num++
                }
            }
            cStart++
        }
        return spiral
    }
}
