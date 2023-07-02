package g2001_2100.s2088_count_fertile_pyramids_in_a_land

// #Hard #Array #Dynamic_Programming #Matrix
// #2023_06_27_Time_489_ms_(100.00%)_Space_63.2_MB_(100.00%)

class Solution {
    fun countPyramids(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size
        val rev = Array(m) { IntArray(n) }
        for (i in 0 until m) {
            System.arraycopy(grid[i], 0, rev[m - i - 1], 0, n)
        }
        return cal(grid) + cal(rev)
    }

    private fun cal(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size
        var res = 0
        for (i in 1 until m) {
            var cnt = 0
            for (j in 0 until n) {
                if (0 != grid[i][j]) {
                    cnt++
                } else {
                    cnt = 0
                }
                if (0 == cnt || 0 == j) {
                    continue
                }
                grid[i][j] = (grid[i - 1][j - 1] + 1).coerceAtMost(cnt + 1 shr 1)
                res += grid[i][j] - 1
            }
        }
        return res
    }
}
