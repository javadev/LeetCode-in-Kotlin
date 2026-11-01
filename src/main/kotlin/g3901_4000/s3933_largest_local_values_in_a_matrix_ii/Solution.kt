package g3901_4000.s3933_largest_local_values_in_a_matrix_ii

// #Medium #Array #Matrix #Prefix_Sum #Staff #Weekly_Contest_502
// #2026_09_29_Time_40_ms_(100.00%)_Space_163.99_MB_(56.67%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun countLocalMaximums(matrix: Array<IntArray>): Int {
        val n = matrix.size
        val m = matrix[0].size
        val wn = 32 - Integer.numberOfLeadingZeros(n)
        val wm = 32 - Integer.numberOfLeadingZeros(m)
        val st = buildSparseTable(matrix, n, m, wn, wm)
        return countMaximums(matrix, st, n, m)
    }

    private fun buildSparseTable(
        matrix: Array<IntArray>,
        n: Int,
        m: Int,
        wn: Int,
        wm: Int,
    ): Array<Array<Array<IntArray>>> {
        val st =
            Array<Array<Array<IntArray>>>(wn) { Array<Array<IntArray>>(wm) { Array<IntArray>(n) { IntArray(m) } } }
        st[0][0] = matrix
        buildHorizontalLevels(st, n, m, wm)
        buildVerticalLevels(st, n, m, wn, wm)
        return st
    }

    private fun buildHorizontalLevels(st: Array<Array<Array<IntArray>>>, n: Int, m: Int, wm: Int) {
        for (k2 in 1..<wm) {
            val half = 1 shl (k2 - 1)
            val width = 1 shl k2
            for (i in 0..<n) {
                for (j in 0..m - width) {
                    st[0][k2][i][j] = max(st[0][k2 - 1][i][j], st[0][k2 - 1][i][j + half])
                }
            }
        }
    }

    private fun buildVerticalLevels(st: Array<Array<Array<IntArray>>>, n: Int, m: Int, wn: Int, wm: Int) {
        for (k1 in 1..<wn) {
            val half = 1 shl (k1 - 1)
            val height = 1 shl k1
            for (k2 in 0..<wm) {
                val width = 1 shl k2
                for (i in 0..n - height) {
                    for (j in 0..m - width) {
                        st[k1][k2][i][j] = max(st[k1 - 1][k2][i][j], st[k1 - 1][k2][i + half][j])
                    }
                }
            }
        }
    }

    private fun countMaximums(matrix: Array<IntArray>, st: Array<Array<Array<IntArray>>>, n: Int, m: Int): Int {
        var ans = 0
        for (i in 0..<n) {
            for (j in 0..<m) {
                if (isLocalMaximum(matrix, st, i, j, n, m)) {
                    ans++
                }
            }
        }
        return ans
    }

    private fun isLocalMaximum(
        matrix: Array<IntArray>,
        st: Array<Array<Array<IntArray>>>,
        i: Int,
        j: Int,
        n: Int,
        m: Int,
    ): Boolean {
        val x = matrix[i][j]
        if (x == 0) {
            return false
        }
        val max1 = query(st, i - x, j - x + 1, i + x + 1, j + x, n, m)
        val max2 = query(st, i - x + 1, j - x, i + x, j + x + 1, n, m)
        return max(max1, max2) <= x
    }

    private fun query(st: Array<Array<Array<IntArray>>>, r1: Int, c1: Int, r2: Int, c2: Int, n: Int, m: Int): Int {
        var r1 = r1
        var c1 = c1
        var r2 = r2
        var c2 = c2
        r1 = max(r1, 0)
        c1 = max(c1, 0)
        r2 = min(r2, n)
        c2 = min(c2, m)
        val k1 = 31 - Integer.numberOfLeadingZeros(r2 - r1)
        val k2 = 31 - Integer.numberOfLeadingZeros(c2 - c1)
        val bottom = r2 - (1 shl k1)
        val right = c2 - (1 shl k2)
        return max(
            max(st[k1][k2][r1][c1], st[k1][k2][bottom][c1]),
            max(st[k1][k2][r1][right], st[k1][k2][bottom][right]),
        )
    }
}
