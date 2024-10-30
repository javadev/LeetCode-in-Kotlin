package g3301_3400.s3332_maximum_points_tourist_can_earn

// #Medium #Array #Dynamic_Programming #Matrix
// #2024_10_29_Time_216_ms_(100.00%)_Space_64_MB_(78.95%)

import kotlin.math.max

class Solution {
    fun maxScore(n: Int, k: Int, stayScores: Array<IntArray>, travelScores: Array<IntArray>): Int {
        // dp[day][city]
        val dp = Array<IntArray>(k + 1) { IntArray(n) }
        var result = 0
        for (day in k - 1 downTo 0) {
            for (city in 0 until n) {
                val stayScore = stayScores[day][city] + dp[day + 1][city]
                var travelScore = 0
                for (nextCity in 0 until n) {
                    val nextScore = travelScores[city][nextCity] + dp[day + 1][nextCity]
                    travelScore = max(nextScore, travelScore)
                }
                dp[day][city] = max(stayScore, travelScore)
                result = max(dp[day][city], result)
            }
        }
        return result
    }
}
