package g0401_0500.s0435_non_overlapping_intervals

// #Medium #Array #Dynamic_Programming #Sorting #Greedy #Data_Structure_II_Day_4_Array
// #2022_12_22_Time_1040_ms_(85.07%)_Space_117.9_MB_(82.09%)

import java.util.Arrays

class Solution {
    fun eraseOverlapIntervals(intervals: Array<IntArray>): Int {
        Arrays.sort(intervals) { a: IntArray, b: IntArray ->
            if (a[0] != b[0]
            ) a[0] - b[0] else a[1] - b[1]
        }
        var erasures = 0
        var end = intervals[0][1]
        for (i in 1 until intervals.size) {
            end = if (intervals[i][0] < end) {
                erasures++
                Math.min(end, intervals[i][1])
            } else {
                intervals[i][1]
            }
        }
        return erasures
    }
}
