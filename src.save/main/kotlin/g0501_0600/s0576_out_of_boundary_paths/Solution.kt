package g0501_0600.s0576_out_of_boundary_paths

// #Medium #Dynamic_Programming #2023_01_23_Time_153_ms_(100.00%)_Space_34.7_MB_(80.00%)

class Solution {
    private val dRowCol = arrayOf(intArrayOf(1, 0), intArrayOf(-1, 0), intArrayOf(0, 1), intArrayOf(0, -1))
    private fun dfs(
        m: Int,
        n: Int,
        remainingMoves: Int,
        currRow: Int,
        currCol: Int,
        cache: Array<Array<IntArray>>
    ): Int {
        if (currRow < 0 || currRow == m || currCol < 0 || currCol == n) {
            return 1
        }
        if (remainingMoves == 0) {
            return 0
        }
        if (cache[currRow][currCol][remainingMoves] == -1) {
            var paths = 0
            for (i in 0..3) {
                val newRow = currRow + dRowCol[i][0]
                val newCol = currCol + dRowCol[i][1]
                val m1 = 1000000007
                paths = (paths + dfs(m, n, remainingMoves - 1, newRow, newCol, cache)) % m1
            }
            cache[currRow][currCol][remainingMoves] = paths
        }
        return cache[currRow][currCol][remainingMoves]
    }

    fun findPaths(m: Int, n: Int, maxMoves: Int, startRow: Int, startCol: Int): Int {
        val cache = Array(m) {
            Array(n) {
                IntArray(
                    maxMoves + 1
                )
            }
        }
        for (c1 in cache) {
            for (c2 in c1) {
                c2.fill(-1)
            }
        }
        return dfs(m, n, maxMoves, startRow, startCol, cache)
    }
}
