package g3301_3400.s3394_check_if_grid_can_be_cut_into_sections

// #Medium #2024_12_22_Time_298_ms_(100.00%)_Space_132.4_MB_(100.00%)

import kotlin.math.max

@Suppress("unused")
class Solution {
    fun checkValidCuts(n: Int, rectangles: Array<IntArray>): Boolean {
        val m = rectangles.size
        val xAxis = Array<IntArray>(m) { IntArray(2) }
        val yAxis = Array<IntArray>(m) { IntArray(2) }
        var ind = 0
        for (axis in rectangles) {
            val startX = axis[0]
            val startY = axis[1]
            val endX = axis[2]
            val endY = axis[3]
            xAxis[ind] = intArrayOf(startX, endX)
            yAxis[ind] = intArrayOf(startY, endY)
            ind++
        }

        xAxis.sortWith<IntArray>(
            Comparator { a: IntArray, b: IntArray -> if (a[0] == b[0]) a[1] - b[1] else a[0] - b[0] },
        )

        yAxis.sortWith<IntArray>(
            Comparator { a: IntArray, b: IntArray -> if (a[0] == b[0]) a[1] - b[1] else a[0] - b[0] },
        )
        val verticalCuts = findSections(xAxis)
        if (verticalCuts > 2) {
            return true
        }
        val horizontalCuts = findSections(yAxis)
        return horizontalCuts > 2
    }

    private fun findSections(axis: Array<IntArray>): Int {
        var end = axis[0][1]
        var sections = 1
        for (i in 1..<axis.size) {
            if (end > axis[i][0]) {
                end = max(end, axis[i][1])
            } else {
                sections++
                end = axis[i][1]
            }
            if (sections > 2) {
                return sections
            }
        }
        return sections
    }
}
