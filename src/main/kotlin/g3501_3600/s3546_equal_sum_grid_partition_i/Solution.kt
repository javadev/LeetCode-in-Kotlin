package g3501_3600.s3546_equal_sum_grid_partition_i

// #Medium #2025_05_11_Time_5_ms_(100.00%)_Space_90.42_MB_(15.00%)

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
        if (total % 2 != 0L) {
            return false
        }
        var s: Long = 0
        for (i in 0..<r.size - 1) {
            s += r[i].toLong()
            if (s * 2 == total) {
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
            if (s * 2 == total) {
                return true
            }
            if (s * 2 > total) {
                break
            }
        }
        return false
    }
}
