package g0201_0300.s0223_rectangle_area

// #Medium #Math #Geometry #2022_10_25_Time_291_ms_(66.67%)_Space_37.8_MB_(55.56%)

class Solution {
    fun computeArea(ax1: Int, ay1: Int, ax2: Int, ay2: Int, bx1: Int, by1: Int, bx2: Int, by2: Int): Int {
        val left = Math.max(ax1, bx1).toLong()
        val right = Math.min(ax2, bx2).toLong()
        val top = Math.min(ay2, by2).toLong()
        val bottom = Math.max(ay1, by1).toLong()
        var area = (right - left) * (top - bottom)
        // if not overlaping, either of these two will be non-posittive
        // if right - left = 0, are will automtically be 0 as well
        if (right - left < 0 || top - bottom < 0) {
            area = 0
        }
        return ((ax2 - ax1) * (ay2 - ay1) + (bx2 - bx1) * (by2 - by1) - area).toInt()
    }
}