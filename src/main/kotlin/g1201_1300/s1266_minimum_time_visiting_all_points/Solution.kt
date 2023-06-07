package g1201_1300.s1266_minimum_time_visiting_all_points

// #Easy #Array #Math #Geometry
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
