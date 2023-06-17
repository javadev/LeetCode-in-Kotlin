package g1601_1700.s1637_widest_vertical_area_between_two_points_containing_no_points

// #Medium #Array #Sorting #2023_06_17_Time_616_ms_(100.00%)_Space_80.5_MB_(100.00%)

class Solution {
    fun maxWidthOfVerticalArea(points: Array<IntArray>): Int {
        val xValues = IntArray(points.size)
        for (i in points.indices) {
            xValues[i] = points[i][0]
        }
        xValues.sort()
        var max = 0
        for (j in 0 until xValues.size - 1) {
            if (xValues[j + 1] - xValues[j] > max) {
                max = xValues[j + 1] - xValues[j]
            }
        }
        return max
    }
}
