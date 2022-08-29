package g0001_0100.s0054_spiral_matrix

// #Medium #Top_Interview_Questions #Array #Matrix #Simulation #Programming_Skills_II_Day_8
// #Level_2_Day_1_Implementation/Simulation #Udemy_2D_Arrays/Matrix
// #2022_08_29_Time_228_ms_(58.19%)_Space_34.5_MB_(50.86%)

class Solution {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        if (matrix.isEmpty() || matrix[0].isEmpty()) {
            return emptyList()
        }

        val result = arrayListOf<Int>()

        var rowBegin = 0
        var rowEnd = matrix.size - 1
        var columnBegin = 0
        var columnEnd = matrix[0].size - 1

        while (rowBegin <= rowEnd && columnBegin <= columnEnd) {
            for (i in columnBegin..columnEnd) {
                result.add(matrix[rowBegin][i])
            }
            rowBegin++

            for (i in rowBegin..rowEnd) {
                result.add(matrix[i][columnEnd])
            }
            columnEnd--

            if (rowBegin <= rowEnd) {
                for (i in columnEnd downTo columnBegin) {
                    result.add(matrix[rowEnd][i])
                }
                rowEnd--
            }
            if (columnBegin <= columnEnd) {
                for (i in rowEnd downTo rowBegin) {
                    result.add(matrix[i][columnBegin])
                }
                columnBegin++
            }
        }
        return result
    }
}
