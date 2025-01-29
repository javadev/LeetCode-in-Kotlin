package g0001_0100.s0054_spiral_matrix

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Matrix #Simulation
// #Programming_Skills_II_Day_8 #Level_2_Day_1_Implementation/Simulation #Udemy_2D_Arrays/Matrix
// #Top_Interview_150_Matrix #2023_07_10_Time_132_ms_(95.12%)_Space_33.5_MB_(93.17%)

class Solution {
    fun spiralOrder(matrix: Array<IntArray>): List<Int> {
        val list: MutableList<Int> = ArrayList()
        var r = 0
        var c = 0
        var bigR = matrix.size - 1
        var bigC: Int = matrix[0].size - 1
        while (r <= bigR && c <= bigC) {
            for (i in c..bigC) {
                list.add(matrix[r][i])
            }
            r++
            for (i in r..bigR) {
                list.add(matrix[i][bigC])
            }
            bigC--
            run {
                var i = bigC
                while (i >= c && r <= bigR) {
                    list.add(matrix[bigR][i])
                    i--
                }
            }
            bigR--
            var i = bigR
            while (i >= r && c <= bigC) {
                list.add(matrix[i][c])
                i--
            }
            c++
        }
        return list
    }
}
