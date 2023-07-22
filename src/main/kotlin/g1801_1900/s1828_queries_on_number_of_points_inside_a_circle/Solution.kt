package g1801_1900.s1828_queries_on_number_of_points_inside_a_circle

// #Medium #Array #Math #Geometry #2023_06_21_Time_284_ms_(100.00%)_Space_45.8_MB_(100.00%)

class Solution {
    fun countPoints(points: Array<IntArray>, queries: Array<IntArray>): IntArray {
        val result = IntArray(queries.size)
        for ((i, query) in queries.withIndex()) {
            var pts = 0
            for (point in points) {
                if ((point[0] - query[0]) * (point[0] - query[0]) +
                    (point[1] - query[1]) * (point[1] - query[1])
                    <= query[2] * query[2]
                ) {
                    pts++
                }
            }
            result[i] = pts
        }
        return result
    }
}
