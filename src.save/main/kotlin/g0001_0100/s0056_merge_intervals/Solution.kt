package g0001_0100.s0056_merge_intervals

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Sorting
// #Data_Structure_II_Day_2_Array #Level_2_Day_17_Interval #Udemy_2D_Arrays/Matrix
// #2023_02_27_Time_320_ms_(94.22%)_Space_44.4_MB_(72.95%)

class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        val result: MutableList<IntArray> = mutableListOf()
        if (intervals.size <= 1) return intervals
        intervals.sortBy { it.first() }
        var currentRange = 1
        var begin = intervals[0][0]
        var end = intervals[0][1]
        while (currentRange < intervals.size) {
            if (intervals[currentRange][0] > end) {
                result.add(intArrayOf(begin, end))
                begin = intervals[currentRange][0]
                end = intervals[currentRange][1]
            } else if (intervals[currentRange][1] > end) {
                end = intervals[currentRange][1]
            }
            currentRange++
        }
        result.add(intArrayOf(begin, end))
        return result.toTypedArray()
    }
}
