package g3501_3600.s3548_equal_sum_grid_partition_ii

// #Hard #2025_05_11_Time_8_ms_(100.00%)_Space_94.22_MB_(100.00%)

class Solution {
    fun canPartitionGrid(grid: Array<IntArray>): Boolean {
        if (grid.size == 1 && grid[0].size == 1) {
            return false
        }
        var total: Long = 0
        var k = 0
        val r = IntArray(grid.size)
        for (i in grid) {
            var t = 0
            for (j in i) {
                t += j
            }
            total += t.toLong()
            r[k++] = t
        }
        val m = grid.size
        val n = grid[0].size
        var s: Long = 0
        for (i in 0..<r.size - 1) {
            s += r[i].toLong()
            if (s * 2 == total || s * 2 - grid[i][n - 1] == total || s * 2 - grid[i][0] == total || s * 2 - grid[0][0] == total || s * 2 - grid[0][n - 1] == total) {
                return true
            }
            if (s * 2 > total) {
                break
            }
        }
        s = 0
        for (i in m - 1 downTo 0) {
            s += r[i].toLong()
            if (s * 2 == total || s * 2 - grid[i][n - 1] == total || s * 2 - grid[i][0] == total || s * 2 - grid[m - 1][n - 1] == total || s * 2 - grid[m - 1][0] == total) {
                return true
            }
            if (s * 2 > total) {
                break
            }
        }
        s = 0
        for (i in 0..<grid[0].size - 1) {
            for (ints in grid) {
                s += ints[i].toLong()
            }
            if (s * 2 == total || s * 2 - grid[0][0] == total || s * 2 - grid[m - 1][0] == total || s * 2 - grid[0][i] == total || s * 2 - grid[m - 1][i] == total) {
                return true
            }
            if (s * 2 > total) {
                break
            }
        }
        s = 0
        for (i in n - 1 downTo 0) {
            for (j in m - 1 downTo 0) {
                s += grid[j][i].toLong()
            }
            if (s * 2 == total || s * 2 - grid[m - 1][n - 1] == total || s * 2 - grid[0][n - 1] == total || s * 2 - grid[0][i] == total || s * 2 - grid[m - 1][i] == total) {
                return true
            }
            if (s * 2 > total) {
                break
            }
        }
        return false
    }
}
