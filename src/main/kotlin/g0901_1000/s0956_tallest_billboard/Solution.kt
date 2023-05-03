package g0901_1000.s0956_tallest_billboard

// #Hard #Array #Dynamic_Programming #2023_05_03_Time_182_ms_(100.00%)_Space_49.8_MB_(100.00%)

import java.util.Arrays

class Solution {
    fun tallestBillboard(rods: IntArray): Int {
        var maxDiff = 0
        for (rod in rods) {
            maxDiff += rod
        }
        val dp = IntArray(maxDiff + 1)
        Arrays.fill(dp, -1)
        dp[0] = 0
        for (l in rods) {
            val dpOld = IntArray(maxDiff + 1)
            System.arraycopy(dp, 0, dpOld, 0, maxDiff + 1)
            for (diff in 0 until maxDiff + 1) {
                if (dpOld[diff] == -1) {
                    continue
                }
                if (diff + l <= maxDiff) {
                    dp[diff + l] = dp[diff + l].coerceAtLeast(dpOld[diff] + l)
                }
                if (l - diff >= 0) {
                    dp[l - diff] = dp[l - diff].coerceAtLeast(l + dpOld[diff] - diff)
                } else {
                    dp[diff - l] = dp[diff - l].coerceAtLeast(dpOld[diff])
                }
            }
        }
        return dp[0]
    }
}
