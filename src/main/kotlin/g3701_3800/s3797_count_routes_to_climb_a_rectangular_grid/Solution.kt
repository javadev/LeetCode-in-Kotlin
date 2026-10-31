package g3701_3800.s3797_count_routes_to_climb_a_rectangular_grid

// #Hard #Array #Dynamic_Programming #Matrix #Prefix_Sum #Senior_Staff #Biweekly_Contest_173
// #2026_05_22_Time_89_ms_(89.19%)_Space_57.00_MB_(81.08%)

import kotlin.math.min
import kotlin.math.sqrt

class Solution {
    fun numberOfRoutes(grid: Array<String>, d: Int): Int {
        val n = grid.size
        val m = grid[0].length
        val mod: Long = 1000000007
        var dp: LongArray? = null
        for (i in n - 1 downTo 0) {
            val r = grid[i]
            if (dp == null) {
                val init = LongArray(m)
                init.fill(1)
                dp = f(init, 0, r, m, mod)
            } else {
                val d2 = sqrt(d.toDouble() * d - 1).toInt()
                dp = f(dp, d2, r, m, mod)
            }
            dp = f(dp, d, r, m, mod)
        }
        var res: Long = 0
        for (v in dp!!) {
            res = (res + v) % mod
        }
        return (res).toInt()
    }

    private fun f(dp: LongArray, dist: Int, r: String, m: Int, mod: Long): LongArray {
        val dp2 = LongArray(m)
        var window: Long = 0
        for (k in 0..min(m - 1, dist)) {
            window += dp[k]
        }
        dp2[0] = window
        for (j in 1..<m) {
            window = dp2[j - 1]
            if (j - dist - 1 >= 0) {
                window -= dp[j - dist - 1]
            }
            if (j + dist < m) {
                window += dp[j + dist]
            }
            dp2[j] = window
        }
        for (j in 0..<m) {
            dp2[j] = if (r[j] == '#') 0 else dp2[j] % mod
        }
        return dp2
    }
}
