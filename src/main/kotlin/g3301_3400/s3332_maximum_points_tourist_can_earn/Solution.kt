package g3301_3400.s3332_maximum_points_tourist_can_earn

// #Medium #2024_10_27_Time_495_ms_(100.00%)_Space_68.6_MB_(100.00%)

import kotlin.math.max

class Solution {
    var days: Int = 0
    var cities: Int = 0
    lateinit var dp: Array<Array<Int?>?>

    private fun f(day: Int, city: Int, stayScore: Array<IntArray>, travelScore: Array<IntArray>): Int {
        if (day == days) {
            return 0
        }
        if (dp[day]!![city] != null) {
            return dp[day]!![city]!!
        }
        var maxScore = 0
        for (desCity in 0 until cities) {
            var score: Int
            if (desCity == city) {
                score = stayScore[day][city]
            } else {
                score = travelScore[city][desCity]
            }
            maxScore = max(maxScore, (score + f(day + 1, desCity, stayScore, travelScore)))
        }
        dp[day]!![city] = maxScore
        return dp[day]!![city]!!
    }

    fun maxScore(n: Int, k: Int, stayScore: Array<IntArray>, travelScore: Array<IntArray>): Int {
        days = k
        cities = n
        var maxScore = 0
        dp = Array<Array<Int?>?>(days + 1) { arrayOfNulls<Int>(cities + 1) }
        for (city in 0 until cities) {
            maxScore = max(maxScore, f(0, city, stayScore, travelScore))
        }
        return maxScore
    }
}
