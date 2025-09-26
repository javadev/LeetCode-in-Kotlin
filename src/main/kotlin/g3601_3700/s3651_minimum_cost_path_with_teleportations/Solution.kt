package g3601_3700.s3651_minimum_cost_path_with_teleportations

// #Hard #Array #Dynamic_Programming #Matrix #Biweekly_Contest_163
// #2025_08_17_Time_78_ms_(100.00%)_Space_45.52_MB_(97.73%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun minCost(grid: Array<IntArray>, k: Int): Int {
        val n = grid.size
        val m = grid[0].size
        var max = -1
        val dp = Array<IntArray>(n) { IntArray(m) }
        for (i in n - 1 downTo 0) {
            for (j in m - 1 downTo 0) {
                max = max(grid[i][j], max)
                if (i == n - 1 && j == m - 1) {
                    continue
                }
                if (i == n - 1) {
                    dp[i][j] = grid[i][j + 1] + dp[i][j + 1]
                } else if (j == m - 1) {
                    dp[i][j] = grid[i + 1][j] + dp[i + 1][j]
                } else {
                    dp[i][j] = min(grid[i + 1][j] + dp[i + 1][j], grid[i][j + 1] + dp[i][j + 1])
                }
            }
        }
        val prev = IntArray(max + 1)
        prev.fill(Int.Companion.MAX_VALUE)
        for (i in 0..<n) {
            for (j in 0..<m) {
                prev[grid[i][j]] = min(prev[grid[i][j]], dp[i][j])
            }
        }
        for (i in 1..max) {
            prev[i] = min(prev[i], prev[i - 1])
        }
        for (tr in 1..k) {
            for (i in n - 1 downTo 0) {
                for (j in m - 1 downTo 0) {
                    if (i == n - 1 && j == m - 1) {
                        continue
                    }
                    dp[i][j] = prev[grid[i][j]]
                    if (i == n - 1) {
                        dp[i][j] = min(dp[i][j], grid[i][j + 1] + dp[i][j + 1])
                    } else if (j == m - 1) {
                        dp[i][j] = min(dp[i][j], grid[i + 1][j] + dp[i + 1][j])
                    } else {
                        dp[i][j] = min(dp[i][j], grid[i + 1][j] + dp[i + 1][j])
                        dp[i][j] = min(dp[i][j], grid[i][j + 1] + dp[i][j + 1])
                    }
                }
            }
            prev.fill(Int.Companion.MAX_VALUE)
            for (i in 0..<n) {
                for (j in 0..<m) {
                    prev[grid[i][j]] = min(prev[grid[i][j]], dp[i][j])
                }
            }
            for (i in 1..max) {
                prev[i] = min(prev[i], prev[i - 1])
            }
        }
        return dp[0][0]
    }
}
