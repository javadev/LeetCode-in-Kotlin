package g1401_1500.s1401_circle_and_rectangle_overlapping

// #Medium #Math #Geometry #2023_06_07_Time_116_ms_(100.00%)_Space_32.3_MB_(100.00%)

class Solution {
    fun checkOverlap(
        radius: Int,
        xCenter: Int,
        yCenter: Int,
        x1: Int,
        y1: Int,
        x2: Int,
        y2: Int
    ): Boolean {
        // Find the closest point to the circle within the rectangle
        val closestX = clamp(xCenter, x1, x2)
        val closestY = clamp(yCenter, y1, y2)
        // Calculate the distance between the circle's center and this closest point
        val distanceX = xCenter - closestX
        val distanceY = yCenter - closestY
        // If the distance is less than the circle's radius, an intersection occurs
        val distanceSquared = distanceX * distanceX + distanceY * distanceY
        return distanceSquared <= radius * radius
    }

    private fun clamp(`val`: Int, min: Int, max: Int): Int {
        return Math.max(min, Math.min(max, `val`))
    }
}
