package g1601_1700.s1610_maximum_number_of_visible_points

// #Hard #Array #Math #Sorting #Sliding_Window #Geometry
// #2023_06_15_Time_1343_ms_(100.00%)_Space_101_MB_(100.00%)

import kotlin.math.atan

class Solution {
    fun visiblePoints(points: List<List<Int>>, angle: Int, location: List<Int>): Int {
        var max = 0
        var count = 0
        val angles: MutableList<Double> = ArrayList(points.size)
        for (point in points) {
            val a = calculateAngle(location, point)
            if (a == 360.0) {
                count++
            } else {
                angles.add(a)
            }
        }
        angles.sort()
        var s = 0
        var e = 0
        var size: Int
        val n = angles.size
        while (s < n && max < n) {
            while (true) {
                val index = (e + 1) % n
                if (s == index || (360 + angles[index] - angles[s]) % 360 > angle) {
                    break
                }
                e = index
            }
            size = if (e >= s) e - s + 1 else n - s + e + 1
            max = max.coerceAtLeast(size)
            if (e == s) {
                e++
            }
            s++
        }
        return max + count
    }

    private fun calculateAngle(location: List<Int>, point: List<Int>): Double {
        val x1 = location[0]
        val y1 = location[1]
        val x2 = point[0]
        val y2 = point[1]
        if (x1 == x2) {
            if (y2 > y1) {
                return 90.0
            }
            return if (y2 < y1) {
                270.0
            } else 360.0
        }
        var angle = Math.toDegrees(atan((y2 - y1).toDouble() / (x2 - x1)))
        if (x2 > x1) {
            angle = (angle + 360.0) % 360.0
        } else {
            angle += 180.0
        }
        return angle
    }
}
