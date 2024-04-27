package g3101_3200.s3122_minimum_number_of_operations_to_satisfy_conditions

// #Medium #Array #Dynamic_Programming #Matrix
// #2024_04_27_Time_948_ms_(80.77%)_Space_169.5_MB_(50.00%)

import kotlin.math.min

class Solution {
    fun minimumOperations(grid: Array<IntArray>): Int {
        val n = grid.size
        val m = grid[0].size
        val dp = Array(m) { IntArray(10) }
        val cnt = Array(m) { IntArray(10) }
        for (i in 0 until n) {
            for (j in 0 until m) {
                cnt[j][grid[i][j]]++
            }
        }
        var first = Int.MAX_VALUE
        var second = Int.MAX_VALUE
        var firstId = -1
        var secondId = -1
        for (i in 0..9) {
            dp[0][i] = n - cnt[0][i]
            if (dp[0][i] <= first) {
                second = first
                first = dp[0][i]
                secondId = firstId
                firstId = i
            } else if (dp[0][i] < second) {
                second = dp[0][i]
                secondId = i
            }
        }
        for (j in 1 until m) {
            val lastFirstId = firstId
            val lastSecondId = secondId
            second = Int.MAX_VALUE
            first = second
            secondId = -1
            firstId = secondId
            for (i in 0..9) {
                var tmp: Int
                val fix = n - cnt[j][i]
                tmp = if (i == lastFirstId) {
                    fix + dp[j - 1][lastSecondId]
                } else {
                    fix + dp[j - 1][lastFirstId]
                }
                if (tmp <= first) {
                    second = first
                    first = tmp
                    secondId = firstId
                    firstId = i
                } else if (tmp < second) {
                    second = tmp
                    secondId = i
                }
                dp[j][i] = tmp
            }
        }
        var ans = Int.MAX_VALUE
        for (i in 0..9) {
            ans = min(ans, dp[m - 1][i])
        }
        return ans
    }
}
