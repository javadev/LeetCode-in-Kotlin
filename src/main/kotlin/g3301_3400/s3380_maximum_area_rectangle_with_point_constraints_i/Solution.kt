package g3301_3400.s3380_maximum_area_rectangle_with_point_constraints_i

// #Medium #Array #Math #Sorting #Enumeration #Geometry #Segment_Tree #Binary_Indexed_Tree
// #2024_12_10_Time_10_ms_(94.74%)_Space_40.1_MB_(84.21%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maxRectangleArea(points: Array<IntArray>): Int {
        val set: MutableSet<String?> = HashSet<String?>()
        for (p in points) {
            set.add(p.contentToString())
        }
        var maxArea = -1
        for (point in points) {
            for (j in 1..<points.size) {
                val p2 = points[j]
                if (point[0] == p2[0] || point[1] == p2[1] || !set.contains(
                        intArrayOf(
                            point[0],
                            p2[1],
                        ).contentToString(),
                    ) || !set.contains(intArrayOf(p2[0], point[1]).contentToString()) ||
                    !validate(points, point, p2)
                ) {
                    continue
                }
                maxArea = max(maxArea, (p2[1] - point[1]) * (p2[0] - point[0]))
            }
        }
        return maxArea
    }

    private fun validate(points: Array<IntArray>, p1: IntArray, p2: IntArray): Boolean {
        val top = max(p1[1], p2[1])
        val bot = min(p1[1], p2[1])
        val left = min(p1[0], p2[0])
        val right = max(p1[0], p2[0])
        for (p in points) {
            val x = p[0]
            val y = p[1]
            if ((y == top || y == bot) && x > left && x < right ||
                (x == left || x == right) && y > bot && y < top ||
                (x > left && x < right && y > bot && y < top)
            ) {
                return false
            }
        }
        return true
    }
}
