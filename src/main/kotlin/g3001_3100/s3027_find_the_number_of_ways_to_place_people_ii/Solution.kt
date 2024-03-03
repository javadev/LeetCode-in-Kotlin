package g3001_3100.s3027_find_the_number_of_ways_to_place_people_ii

// #Hard #Array #Math #Sorting #Enumeration #Geometry
// #2024_03_03_Time_477_ms_(78.95%)_Space_53.5_MB_(84.21%)

class Solution {
    private fun customCompare(p1: IntArray, p2: IntArray): Int {
        if (p1[0] != p2[0]) {
            return Integer.signum(p1[0] - p2[0])
        }
        return Integer.signum(p2[1] - p1[1])
    }

    fun numberOfPairs(points: Array<IntArray>): Int {
        points.sortWith { p1: IntArray, p2: IntArray -> this.customCompare(p1, p2) }
        var count = 0
        for (i in points.indices) {
            var m = Int.MIN_VALUE
            for (j in i + 1 until points.size) {
                if ((points[i][1] >= points[j][1]) && (points[j][1] > m)) {
                    m = points[j][1]
                    count++
                }
            }
        }
        return count
    }
}
