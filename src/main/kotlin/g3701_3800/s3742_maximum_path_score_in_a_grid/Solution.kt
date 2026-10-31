package g3701_3800.s3742_maximum_path_score_in_a_grid

// #Medium #Array #Dynamic_Programming #Matrix #Staff #Weekly_Contest_475
// #2026_04_26_Time_212_ms_(91.38%)_Space_92.93_MB_(35.06%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maxPathScore(grid: Array<IntArray>, k: Int): Int {
        val n = grid.size
        val m = grid[0].size
        val mxc = min(k + 1, n + m + 5)
        val dp = Array<Array<IntArray>>(n) { Array<IntArray>(m) { IntArray(mxc) } }
        for (i in 0..<n) {
            for (j in 0..<m) {
                for (c in 0..<mxc) {
                    dp[i][j][c] = -1
                }
            }
        }
        dp[0][0][0] = 0
        for (i in 0..<n) {
            for (j in 0..<m) {
                for (c in 0..<mxc) {
                    if (dp[i][j][c] == -1) {
                        continue
                    }
                    // move right
                    if (j + 1 < m) {
                        val cost = c + (if (grid[i][j + 1] > 0) 1 else 0)
                        if (cost < mxc) {
                            dp[i][j + 1][cost] = max(dp[i][j + 1][cost], dp[i][j][c] + grid[i][j + 1])
                        }
                    }
                    // move down
                    if (i + 1 < n) {
                        val cost = c + (if (grid[i + 1][j] > 0) 1 else 0)
                        if (cost < mxc) {
                            dp[i + 1][j][cost] = max(dp[i + 1][j][cost], dp[i][j][c] + grid[i + 1][j])
                        }
                    }
                }
            }
        }
        var ans = -1
        for (c in 0..<mxc) {
            ans = max(ans, dp[n - 1][m - 1][c])
        }
        return ans
    }
}
