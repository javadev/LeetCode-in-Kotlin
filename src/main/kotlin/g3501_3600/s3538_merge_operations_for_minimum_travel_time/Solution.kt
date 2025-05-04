package g3501_3600.s3538_merge_operations_for_minimum_travel_time

// #Hard #2025_05_04_Time_10_ms_(100.00%)_Space_46.96_MB_(100.00%)

import kotlin.math.min

@Suppress("unused")
class Solution {
    fun minTravelTime(l: Int, n: Int, k: Int, position: IntArray, time: IntArray): Int {
        val dp = Array<Array<IntArray>>(n) { Array<IntArray>(k + 1) { IntArray(k + 1) } }
        for (i in 0..<n) {
            for (j in 0..k) {
                for (m in 0..k) {
                    dp[i][j][m] = Int.Companion.MAX_VALUE
                }
            }
        }
        dp[0][0][0] = 0
        for (i in 0..<n - 1) {
            var currTime = 0
            var curr = 0
            while (curr <= k && curr <= i) {
                currTime += time[i - curr]
                for (used in 0..k) {
                    if (dp[i][curr][used] == Int.Companion.MAX_VALUE) {
                        continue
                    }
                    var next = 0
                    while (next <= k - used && next <= n - i - 2) {
                        val nextI = i + next + 1
                        dp[nextI][next][next + used] = min(
                            dp[nextI][next][next + used],
                            dp[i][curr][used] +
                                (position[nextI] - position[i]) * currTime,
                        )
                        next++
                    }
                }
                curr++
            }
        }
        var ans = Int.Companion.MAX_VALUE
        for (curr in 0..k) {
            ans = min(ans, dp[n - 1][curr][k])
        }
        return ans
    }
}
