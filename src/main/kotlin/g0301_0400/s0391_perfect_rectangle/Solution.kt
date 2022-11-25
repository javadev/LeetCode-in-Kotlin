package g0301_0400.s0391_perfect_rectangle

// #Hard #Array #Line_Sweep #2022_11_24_Time_897_ms_(100.00%)_Space_89.8_MB_(100.00%)

import java.util.Objects

class Solution {
    fun isRectangleCover(rectangles: Array<IntArray>): Boolean {
        val container: MutableSet<Point> = HashSet()
        // add each rectangle area to totalArea
        var totalArea = 0
        // A rectangle has four points, if a point appears twice, it will be deleted it from the set
        for (rectangle in rectangles) {
            totalArea += (rectangle[2] - rectangle[0]) * (rectangle[3] - rectangle[1])
            val p1 = Point(rectangle[0], rectangle[1])
            val p2 = Point(rectangle[2], rectangle[1])
            val p3 = Point(rectangle[2], rectangle[3])
            val p4 = Point(rectangle[0], rectangle[3])
            if (container.contains(p1)) {
                container.remove(p1)
            } else {
                container.add(p1)
            }
            if (container.contains(p2)) {
                container.remove(p2)
            } else {
                container.add(p2)
            }
            if (container.contains(p3)) {
                container.remove(p3)
            } else {
                container.add(p3)
            }
            if (container.contains(p4)) {
                container.remove(p4)
            } else {
                container.add(p4)
            }
        }
        // A perfect rectangle must has four points
        if (container.size != 4) {
            return false
        }

        // these four points represent the last perfect rectangle, check this rectangle area to the
        // totalArea
        var minX = Int.MAX_VALUE
        var maxX = Int.MIN_VALUE
        var minY = Int.MAX_VALUE
        var maxY = Int.MIN_VALUE
        for (p in container) {
            minX = Math.min(minX, p.x)
            maxX = Math.max(maxX, p.x)
            minY = Math.min(minY, p.y)
            maxY = Math.max(maxY, p.y)
        }
        return totalArea == (maxX - minX) * (maxY - minY)
    }

    private class Point(val x: Int, val y: Int) {
        override fun equals(o: Any?): Boolean {
            if (this === o) {
                return true
            }
            if (o == null || javaClass != o.javaClass) {
                return false
            }
            val point = o as Point
            return x == point.x && y == point.y
        }

        override fun hashCode(): Int {
            return Objects.hash(x, y)
        }
    }
}
