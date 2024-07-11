package g3201_3300.s3212_count_submatrices_with_equal_frequency_of_x_and_y

// #Medium #Array #Matrix #Prefix_Sum #2024_07_11_Time_1009_ms_(78.95%)_Space_158.6_MB_(50.00%)

class Solution {
    fun numberOfSubmatrices(grid: Array<CharArray>): Int {
        val n = grid[0].size
        var ans = 0
        val row = Array(n) { IntArray(2) }
        for (chars in grid) {
            val count = IntArray(2)
            for (j in 0 until n) {
                if (chars[j] != '.') {
                    count[chars[j].code - 'X'.code]++
                }
                row[j][0] += count[0]
                row[j][1] += count[1]
                if (row[j][0] > 0 && row[j][0] == row[j][1]) {
                    ans++
                }
            }
        }
        return ans
    }
}
