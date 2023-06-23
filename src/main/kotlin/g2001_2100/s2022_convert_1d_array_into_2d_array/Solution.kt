package g2001_2100.s2022_convert_1d_array_into_2d_array

// #Easy #Array #Matrix #Simulation #2023_06_23_Time_631_ms_(100.00%)_Space_52.7_MB_(90.00%)

class Solution {
    fun construct2DArray(original: IntArray, m: Int, n: Int): Array<IntArray> {
        val size = original.size
        if (m * n != size) {
            return arrayOf()
        }
        val ans = Array(m) { IntArray(n) }
        var k = 0
        for (i in 0 until m) {
            for (j in 0 until n) {
                ans[i][j] = original[k++]
            }
        }
        return ans
    }
}
