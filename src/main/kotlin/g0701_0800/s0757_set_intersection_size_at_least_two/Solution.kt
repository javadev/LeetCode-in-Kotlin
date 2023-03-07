package g0701_0800.s0757_set_intersection_size_at_least_two

// #Hard #Array #Sorting #Greedy #2023_03_07_Time_298_ms_(100.00%)_Space_39.7_MB_(100.00%)

import java.util.Arrays

class Solution {
    fun intersectionSizeTwo(intervals: Array<IntArray>): Int {
        Arrays.sort(intervals) { a, b ->
            if (a[1] == b[1]) {
                b[0] - a[0]
            } else a[1] - b[1]
        }
        val list: MutableList<Int> = ArrayList()
        list.add(intervals[0][1] - 1)
        list.add(intervals[0][1])
        for (i in 1 until intervals.size) {
            val lastOne = list[list.size - 1]
            val lastTwo = list[list.size - 2]
            val interval = intervals[i]
            val start = interval[0]
            val end = interval[1]
            if (lastOne >= start && lastTwo >= start) {
                continue
            } else if (lastOne >= start) {
                list.add(end)
            } else {
                list.add(end - 1)
                list.add(end)
            }
        }
        return list.size
    }
}
