package g0101_0200.s0118_pascals_triangle

// #Easy #Top_Interview_Questions #Array #Dynamic_Programming #Data_Structure_I_Day_4_Array
// #Dynamic_Programming_I_Day_12 #Udemy_Dynamic_Programming
// #2022_10_08_Time_277_ms_(33.22%)_Space_34.2_MB_(90.60%)

class Solution {
    fun generate(numRows: Int): List<List<Int>> {
        val output: MutableList<List<Int>> = ArrayList()
        for (i in 0 until numRows) {
            val currRow: MutableList<Int> = ArrayList()
            for (j in 0..i) {
                if (j == 0 || j == i || i <= 1) {
                    currRow.add(1)
                } else {
                    val currCell = output[i - 1][j - 1] + output[i - 1][j]
                    currRow.add(currCell)
                }
            }
            output.add(currRow)
        }
        return output
    }
}
