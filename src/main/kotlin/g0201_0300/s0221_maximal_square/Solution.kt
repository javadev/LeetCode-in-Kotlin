package g0201_0300.s0221_maximal_square

// #Medium #Array #Dynamic_Programming #Matrix #Dynamic_Programming_I_Day_16
// #Top_Interview_150_Multidimensional_DP #Big_O_Time_O(m*n)_Space_O(m*n)
// #2022_09_10_Time_614_ms_(44.00%)_Space_76.2_MB_(65.33%)

class Solution {
    fun maximalSquare(matrix: Array<CharArray>): Int {
        val m = matrix.size
        if (m == 0) {
            return 0
        }
        val n: Int = matrix[0].size
        if (n == 0) {
            return 0
        }
        val dp = Array(m + 1) { IntArray(n + 1) }
        var max = 0
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (matrix[i][j] == '1') {
                    // 1 + minimum from cell above, cell to the left, cell diagonal upper-left
                    val next = 1 + Math.min(dp[i][j], Math.min(dp[i + 1][j], dp[i][j + 1]))
                    // keep track of the maximum value seen
                    if (next > max) {
                        max = next
                    }
                    dp[i + 1][j + 1] = next
                }
            }
        }
        return max * max
    }
}
