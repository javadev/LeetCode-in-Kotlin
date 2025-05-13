package g3501_3600.s3546_equal_sum_grid_partition_i

// #Medium #Array #Matrix #Prefix_Sum #Enumeration
// #2025_05_13_Time_7_ms_(82.61%)_Space_90.22_MB_(17.39%)

class Solution {
    fun canPartitionGrid(grid: Array<IntArray>): Boolean {
        val n = grid.size
        val m = grid[0].size
        var totalRowSum = 0L
        val prefixRowWise = LongArray(n)
        val prefixColWise = LongArray(m)
        for (i in 0..<n) {
            for (j in 0..<m) {
                val v = grid[i][j]
                prefixRowWise[i] += v.toLong()
                prefixColWise[j] += v.toLong()
            }
        }
        for (r in prefixRowWise) {
            totalRowSum += r
        }
        val totalColSum: Long = totalRowSum
        var currentRowUpperSum = 0L
        for (i in 0..<n - 1) {
            currentRowUpperSum += prefixRowWise[i]
            val lowerSegmentSum = totalRowSum - currentRowUpperSum
            if (currentRowUpperSum == lowerSegmentSum) {
                return true
            }
        }
        var currentColLeftSum = 0L
        for (j in 0..<m - 1) {
            currentColLeftSum += prefixColWise[j]
            val rightSegmentSum = totalColSum - currentColLeftSum
            if (currentColLeftSum == rightSegmentSum) {
                return true
            }
        }
        return false
    }
}
