package g0001_0100.s0056_merge_intervals

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Sorting
// #Data_Structure_II_Day_2_Array #Level_2_Day_17_Interval #Udemy_2D_Arrays/Matrix
// #2022_08_29_Time_323_ms_(99.68%)_Space_43_MB_(99.04%)

import java.util.Arrays

class Solution {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        Arrays.sort(
            intervals
        ) { a: IntArray, b: IntArray ->
            Integer.compare(
                a[0],
                b[0]
            )
        }
        val list: MutableList<IntArray> = ArrayList()
        var current = intervals[0]
        list.add(current)
        for (next in intervals) {
            if (current[1] >= next[0]) {
                current[1] = Math.max(current[1], next[1])
            } else {
                current = next
                list.add(current)
            }
        }
        return list.toTypedArray()
    }
}
