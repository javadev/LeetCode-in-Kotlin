package g3001_3100.s3047_find_the_largest_area_of_square_inside_two_rectangles

// #Medium #Array #Math #Geometry #2024_03_06_Time_753_ms_(40.42%)_Space_57.7_MB_(72.34%)

import kotlin.math.max
import kotlin.math.min
import kotlin.math.pow

class Solution {
    fun largestSquareArea(bottomLeft: Array<IntArray>, topRight: Array<IntArray>): Long {
        val n = bottomLeft.size
        var maxArea: Long = 0
        for (i in 0 until n) {
            val ax = bottomLeft[i][0]
            val ay = bottomLeft[i][1]
            val bx = topRight[i][0]
            val by = topRight[i][1]
            for (j in i + 1 until n) {
                val cx = bottomLeft[j][0]
                val cy = bottomLeft[j][1]
                val dx = topRight[j][0]
                val dy = topRight[j][1]
                val x1 = max(ax, cx)
                val y1 = max(ay, cy)
                val x2 = min(bx, dx)
                val y2 = min(by, dy)
                val minSide = min((x2 - x1), (y2 - y1))
                val area = max(minSide.toDouble(), 0.0).pow(2.0).toLong()
                maxArea = max(maxArea, area)
            }
        }
        return maxArea
    }
}
