package g0801_0900.s0812_largest_triangle_area

// #Easy #Array #Math #Geometry #2023_03_17_Time_156_ms_(71.43%)_Space_34.3_MB_(57.14%)

import kotlin.math.abs

class Solution {
    fun largestTriangleArea(points: Array<IntArray>): Double {
        val n = points.size
        var max = 0.0
        for (i in 0 until n) {
            for (j in i + 1 until n) {
                for (k in j + 1 until n) {
                    var area: Double
                    val a = points[i]
                    val b = points[j]
                    val c = points[k]
                    area = abs(area(a, b) + area(b, c) + area(c, a))
                    if (area > max) {
                        max = area
                    }
                }
            }
        }
        return max
    }

    private fun area(a: IntArray, b: IntArray): Double {
        val l = b[0] - a[0]
        val h = (a[1] + b[1] + 200) / 2.0
        return l * h
    }
}
