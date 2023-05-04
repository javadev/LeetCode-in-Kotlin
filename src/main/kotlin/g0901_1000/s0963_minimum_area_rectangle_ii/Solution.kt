package g0901_1000.s0963_minimum_area_rectangle_ii

// #Medium #Array #Math #Geometry #2023_05_04_Time_183_ms_(100.00%)_Space_38.7_MB_(66.67%)

import kotlin.math.abs

class Solution {
    fun minAreaFreeRect(points: Array<IntArray>): Double {
        val map: MutableMap<Int, MutableSet<Int>?> = HashMap()
        var area: Double
        for (point in points) {
            map.putIfAbsent(point[0], HashSet())
            map[point[0]]!!.add(point[1])
        }
        var minArea = Double.MAX_VALUE
        val n = points.size
        for (i in 0 until n - 2) {
            for (j in i + 1 until n - 1) {
                val dx1 = points[j][0] - points[i][0]
                val dy1 = points[j][1] - points[i][1]
                // get the 3rd point
                for (k in j + 1 until n) {
                    val dx2 = points[k][0] - points[i][0]
                    val dy2 = points[k][1] - points[i][1]
                    if (dx1 * dx2 + dy1 * dy2 != 0) {
                        continue
                    }
                    // find the 4th point
                    val x = dx1 + points[k][0]
                    val y = dy1 + points[k][1]
                    area = calculateArea(points, i, j, k)
                    if (area >= minArea) {
                        continue
                    }
                    // 4th point exists
                    if (map[x] != null && map[x]!!.contains(y)) {
                        minArea = area
                    }
                }
            }
        }
        return if (minArea == Double.MAX_VALUE) 0.0 else minArea
    }

    private fun calculateArea(points: Array<IntArray>, i: Int, j: Int, k: Int): Double {
        val first = points[i]
        val second = points[j]
        val third = points[k]
        return abs(
            first[0] * (second[1] - third[1]) + second[0] * (third[1] - first[1]) + third[0] * (first[1] - second[1])
        ).toDouble()
    }
}
