package g2201_2300.s2280_minimum_lines_to_represent_a_line_chart

// #Medium #Array #Math #Sorting #Geometry #Number_Theory
// #2023_06_28_Time_765_ms_(100.00%)_Space_98.8_MB_(100.00%)

import java.util.Arrays

class Solution {
    fun minimumLines(stockPrices: Array<IntArray>): Int {
        if (stockPrices.size == 1) {
            return 0
        }
        Arrays.sort(stockPrices) { a: IntArray, b: IntArray -> a[0] - b[0] }
        // multiply with 1.0 to make it double and multiply with 100 for making it big so that
        // difference won't come out to be very less and after division it become 0.
        // failing for one of the case without multiply 100
        var lastSlope = (
            (stockPrices[1][1] - stockPrices[0][1]) *
                100 /
                ((stockPrices[1][0] - stockPrices[0][0]) * 1.0)
            )
        var ans = 1
        for (i in 2 until stockPrices.size) {
            val curSlope = (
                (stockPrices[i][1] - stockPrices[i - 1][1]) *
                    100 /
                    ((stockPrices[i][0] - stockPrices[i - 1][0]) * 1.0)
                )
            if (lastSlope != curSlope) {
                lastSlope = curSlope
                ans++
            }
        }
        return ans
    }
}
