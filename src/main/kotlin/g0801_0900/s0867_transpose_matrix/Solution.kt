package g0801_0900.s0867_transpose_matrix

// #Easy #Array #Matrix #Simulation #2023_04_05_Time_201_ms_(100.00%)_Space_38.4_MB_(8.70%)

class Solution {
    fun transpose(input: Array<IntArray>): Array<IntArray> {
        val output = Array(input[0].size) {
            IntArray(
                input.size
            )
        }
        var i = 0
        var b = 0
        while (i < input.size) {
            var j = 0
            var a = 0
            while (j < input[0].size) {
                output[a][b] = input[i][j]
                j++
                a++
            }
            i++
            b++
        }
        return output
    }
}
