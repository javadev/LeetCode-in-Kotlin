package g0001_0100.s0056_merge_intervals

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Sorting
// #Data_Structure_II_Day_2_Array #Level_2_Day_17_Interval #Udemy_2D_Arrays/Matrix
// #Top_Interview_150_Intervals #Big_O_Time_O(n_log_n)_Space_O(n)
// #2023_07_10_Time_334_ms_(80.67%)_Space_43.7_MB_(78.81%)

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
