package g1001_1100.s1039_minimum_score_triangulation_of_polygon

// #Medium #Array #Dynamic_Programming #2023_05_26_Time_147_ms_(100.00%)_Space_38.9_MB_(50.00%)

import java.util.Arrays

class Solution() {
    private val dp = Array(101) { IntArray(101) }
    fun minScoreTriangulation(values: IntArray): Int {
        val n = values.size
        for (row: IntArray? in dp) {
            Arrays.fill(row!!, -1)
        }
        return util(values, 1, n - 1)
    }

    private fun util(values: IntArray, i: Int, j: Int): Int {
        if (i >= j) {
            return 0
        }
        if (dp[i][j] != -1) {
            return dp[i][j]
        }
        var ans = Int.MAX_VALUE
        for (k in i until j) {
            val temp = (
                util(values, i, k) +
                    util(values, k + 1, j) +
                    (values[i - 1] * values[k] * values[j])
                )
            ans = ans.coerceAtMost(temp)
            dp[i][j] = ans
        }
        return dp[i][j]
    }
}
