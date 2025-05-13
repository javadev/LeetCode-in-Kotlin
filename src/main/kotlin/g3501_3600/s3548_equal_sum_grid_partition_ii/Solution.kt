package g3501_3600.s3548_equal_sum_grid_partition_ii

// #Hard #Array #Hash_Table #Matrix #Prefix_Sum #Enumeration
// #2025_05_13_Time_61_ms_(100.00%)_Space_98.01_MB_(100.00%)

class Solution {
    private fun calculateSum(grid: Array<IntArray>, count: IntArray): Long {
        var sum: Long = 0
        for (line in grid) {
            for (num in line) {
                sum += num.toLong()
                count[num]++
            }
        }
        return sum
    }

    private fun checkHorizontalPartition(grid: Array<IntArray>, sum: Long, count: IntArray): Boolean {
        val half = IntArray(MAX_SIZE)
        var now: Long = 0
        val m = grid.size
        val n = grid[0].size
        for (i in 0..<m - 1) {
            for (j in 0..<n) {
                now += grid[i][j].toLong()
                count[grid[i][j]]--
                half[grid[i][j]]++
            }
            if (now * 2 == sum) {
                return true
            }
            if (now * 2 > sum) {
                val diff = now * 2 - sum
                if (diff <= MAX_SIZE - 1 && half[diff.toInt()] > 0) {
                    if (n > 1) {
                        if (i > 0 || grid[0][0].toLong() == diff || grid[0][n - 1].toLong() == diff) {
                            return true
                        }
                    } else {
                        if (i > 0 && (grid[0][0].toLong() == diff || grid[i][0].toLong() == diff)) {
                            return true
                        }
                    }
                }
            } else {
                val diff = sum - now * 2
                if (diff <= MAX_SIZE - 1 && count[diff.toInt()] > 0) {
                    if (n > 1) {
                        if (i < m - 2 || grid[m - 1][0].toLong() == diff || grid[m - 1][n - 1].toLong() == diff) {
                            return true
                        }
                    } else {
                        if (i > 0 && (grid[m - 1][0].toLong() == diff || grid[i + 1][0].toLong() == diff)) {
                            return true
                        }
                    }
                }
            }
        }
        return false
    }

    private fun checkVerticalPartition(grid: Array<IntArray>, sum: Long): Boolean {
        val count = IntArray(MAX_SIZE)
        val half = IntArray(MAX_SIZE)
        for (line in grid) {
            for (num in line) {
                count[num]++
            }
        }
        var now: Long = 0
        val m = grid.size
        val n = grid[0].size
        for (i in 0..<n - 1) {
            for (ints in grid) {
                now += ints[i].toLong()
                count[ints[i]]--
                half[ints[i]]++
            }
            if (now * 2 == sum) {
                return true
            }
            if (now * 2 > sum) {
                val diff = now * 2 - sum
                if (diff <= MAX_SIZE - 1 && half[diff.toInt()] > 0) {
                    if (m > 1) {
                        if (i > 0 || grid[0][0].toLong() == diff || grid[m - 1][0].toLong() == diff) {
                            return true
                        }
                    } else {
                        if (i > 0 && (grid[0][0].toLong() == diff || grid[0][i].toLong() == diff)) {
                            return true
                        }
                    }
                }
            } else {
                val diff = sum - now * 2
                if (diff <= MAX_SIZE - 1 && count[diff.toInt()] > 0) {
                    if (m > 1) {
                        if (i < n - 2 || grid[0][n - 1].toLong() == diff || grid[m - 1][n - 1].toLong() == diff) {
                            return true
                        }
                    } else {
                        if (i > 0 && (grid[0][n - 1].toLong() == diff || grid[0][i + 1].toLong() == diff)) {
                            return true
                        }
                    }
                }
            }
        }
        return false
    }

    fun canPartitionGrid(grid: Array<IntArray>): Boolean {
        val count = IntArray(MAX_SIZE)
        val sum = calculateSum(grid, count)
        return checkHorizontalPartition(grid, sum, count) || checkVerticalPartition(grid, sum)
    }

    companion object {
        private const val MAX_SIZE = 100001
    }
}
