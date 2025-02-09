package g3401_3500.s3429_paint_house_iv

// #Medium #Array #Dynamic_Programming #2025_01_22_Time_10_ms_(100.00%)_Space_119.77_MB_(84.62%)

import kotlin.math.min

class Solution {
    fun minCost(n: Int, cost: Array<IntArray>): Long {
        var dp0: Long = 0
        var dp1: Long = 0
        var dp2: Long = 0
        var dp3: Long = 0
        var dp4: Long = 0
        var dp5: Long = 0
        for (i in 0..<n / 2) {
            val nextdp0: Long =
                min(min(dp2, dp3), dp4) + cost[i][0] + cost[n - i - 1][1]
            val nextdp1: Long =
                min(min(dp2, dp4), dp5) + cost[i][0] + cost[n - i - 1][2]
            val nextdp2: Long =
                min(min(dp0, dp1), dp5) + cost[i][1] + cost[n - i - 1][0]
            val nextdp3: Long =
                min(min(dp0, dp4), dp5) + cost[i][1] + cost[n - i - 1][2]
            val nextdp4: Long =
                min(min(dp0, dp1), dp3) + cost[i][2] + cost[n - i - 1][0]
            val nextdp5: Long =
                min(min(dp1, dp2), dp3) + cost[i][2] + cost[n - i - 1][1]
            dp0 = nextdp0
            dp1 = nextdp1
            dp2 = nextdp2
            dp3 = nextdp3
            dp4 = nextdp4
            dp5 = nextdp5
        }
        var ans = Long.Companion.MAX_VALUE
        for (x in longArrayOf(dp0, dp1, dp2, dp3, dp4, dp5)) {
            ans = min(ans, x).toLong()
        }
        return ans
    }
}
