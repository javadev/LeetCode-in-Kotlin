package g3401_3500.s3459_length_of_longest_v_shaped_diagonal_segment

// #Hard #Array #Dynamic_Programming #Matrix #Memoization
// #2025_02_18_Time_287_ms_(_%)_Space_131.62_MB_(100.00%)

import kotlin.math.max

class Solution {
    private val ds = arrayOf<IntArray>(intArrayOf(1, 1), intArrayOf(1, -1), intArrayOf(-1, -1), intArrayOf(-1, 1))
    private val nx = intArrayOf(2, 2, 0)
    private lateinit var grid: Array<IntArray>
    private var n = 0
    private var m = 0
    private lateinit var dp: Array<Array<Array<IntArray>>>

    fun lenOfVDiagonal(g: Array<IntArray>): Int {
        this.grid = g
        this.n = g.size
        this.m = g[0].size
        this.dp =
            Array<Array<Array<IntArray>>>(n) { Array<Array<IntArray>>(m) { Array<IntArray>(4) { IntArray(2) } } }
        for (d1 in dp) {
            for (d2 in d1) {
                for (d3 in d2) {
                    d3.fill(-1)
                }
            }
        }
        var res = 0
        for (i in 0..<n) {
            for (j in 0..<m) {
                if (g[i][j] == 1) {
                    for (d in 0..3) {
                        res = max(res.toDouble(), dp(i, j, 1, d, 1).toDouble()).toInt()
                    }
                }
            }
        }
        return res
    }

    private fun dp(i: Int, j: Int, x: Int, d: Int, k: Int): Int {
        if (i < 0 || i >= n || j < 0 || j >= m) {
            return 0
        }
        if (grid[i][j] != x) {
            return 0
        }
        if (dp[i][j][d][k] != -1) {
            return dp[i][j][d][k]
        }
        var res = dp(i + ds[d][0], j + ds[d][1], nx[x], d, k) + 1
        if (k > 0) {
            val d2 = (d + 1) % 4
            val res2 = dp(i + ds[d2][0], j + ds[d2][1], nx[x], d2, 0) + 1
            res = max(res, res2)
        }
        dp[i][j][d][k] = res
        return res
    }
}
