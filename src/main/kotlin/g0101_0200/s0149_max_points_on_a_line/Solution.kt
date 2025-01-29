package g0101_0200.s0149_max_points_on_a_line

// #Hard #Top_Interview_Questions #Array #Hash_Table #Math #Geometry #Algorithm_II_Day_21_Others
// #Top_Interview_150_Math #2022_10_09_Time_307_ms_(83.33%)_Space_34.5_MB_(100.00%)

class Solution {
    fun maxPoints(points: Array<IntArray>): Int {
        if (points.size < 2) {
            return points.size
        }
        var max = 0
        for (i in points.indices) {
            for (j in i + 1 until points.size) {
                val x = points[j][0] - points[i][0]
                val y = points[j][1] - points[i][1]
                val c = x * points[j][1] - y * points[j][0]
                var count = 2
                for (k in j + 1 until points.size) {
                    if (c == x * points[k][1] - y * points[k][0]) {
                        count++
                    }
                }
                max = Math.max(count, max)
            }
        }
        return max
    }
}
