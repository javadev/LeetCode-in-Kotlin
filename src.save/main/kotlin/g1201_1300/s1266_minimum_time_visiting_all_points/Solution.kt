package g1201_1300.s1266_minimum_time_visiting_all_points

// #Easy #Array #Math #Geometry #2023_06_08_Time_152_ms_(100.00%)_Space_36.4_MB_(66.67%)

class Solution {
    fun minTimeToVisitAllPoints(points: Array<IntArray>): Int {
        var minTime = 0
        for (i in 0 until points.size - 1) {
            minTime += chebyshevDistance(points[i], points[i + 1])
        }
        return minTime
    }

    private fun chebyshevDistance(pointA: IntArray, pointB: IntArray): Int {
        return Math.max(Math.abs(pointA[0] - pointB[0]), Math.abs(pointA[1] - pointB[1]))
    }
}
