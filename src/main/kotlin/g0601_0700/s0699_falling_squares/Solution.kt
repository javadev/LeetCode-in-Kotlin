package g0601_0700.s0699_falling_squares

// #Hard #Array #Ordered_Set #Segment_Tree #2023_02_22_Time_293_ms_(100.00%)_Space_48.8_MB_(50.00%)

import java.util.Collections
import java.util.TreeSet

class Solution {
    fun fallingSquares(positions: Array<IntArray>): List<Int> {
        // Coordinate compression using TreeSet
        val unique: MutableSet<Int> = TreeSet()
        for (square in positions) {
            unique.add(square[0])
            unique.add(square[0] + square[1] - 1)
        }
        // converted the TreeSet to a List
        val sorted: List<Int> = ArrayList(unique)
        // Storing the max heights for compressed coordinates
        val heights = IntArray(sorted.size)
        // Our answer list
        val list: MutableList<Int> = ArrayList(positions.size)
        // Global Max
        var max = 0
        for (square in positions) {
            // coordinate compression lookup
            val x1 = Collections.binarySearch(sorted, square[0])
            val x2 = Collections.binarySearch(sorted, square[0] + square[1] - 1)
            // get the current max for the interval between x1 and x2
            var current = 0
            for (i in x1..x2) {
                current = current.coerceAtLeast(heights[i])
            }
            // add the new square on the top
            current += square[1]
            // update the interval with the new value
            for (i in x1..x2) {
                heights[i] = current
            }
            // recalculate the global max
            max = max.coerceAtLeast(current)
            list.add(max)
        }
        return list
    }
}
