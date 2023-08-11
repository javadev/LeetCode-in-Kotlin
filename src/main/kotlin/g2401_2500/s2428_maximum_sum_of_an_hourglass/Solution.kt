package g2401_2500.s2428_maximum_sum_of_an_hourglass

// #Medium #Array #Matrix #Prefix_Sum #2023_07_05_Time_274_ms_(50.00%)_Space_40.5_MB_(100.00%)

class Solution {
    fun maxSum(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size
        var res = 0
        for (i in 0 until m) {
            for (j in 0 until n) {
                res = if (isHourGlass(i, j, m, n)) {
                    res.coerceAtLeast(calculate(i, j, grid))
                } else {
                    // If we cannot form an hour glass from the current row anymore, just move to
                    // the next one
                    break
                }
            }
        }
        return res
    }

    // Check if an hour glass can be formed from the current position
    private fun isHourGlass(r: Int, c: Int, m: Int, n: Int): Boolean {
        return r + 2 < m && c + 2 < n
    }

    // Once we know an hourglass can be formed, just traverse the value
    private fun calculate(r: Int, c: Int, grid: Array<IntArray>): Int {
        var sum = 0
        // Traverse the bottom and the top row of the hour glass at the same time
        for (i in c..c + 2) {
            sum += grid[r][i]
            sum += grid[r + 2][i]
        }
        // Add the middle vlaue
        sum += grid[r + 1][c + 1]
        return sum
    }
}
