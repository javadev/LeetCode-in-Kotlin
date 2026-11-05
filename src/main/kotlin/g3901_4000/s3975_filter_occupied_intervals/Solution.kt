package g3901_4000.s3975_filter_occupied_intervals

import java.util.function.ToIntFunction
import kotlin.math.max

// #Medium #Array #Sorting #Senior #Weekly_Contest_508
// #2026_11_03_Time_63_ms_(99.08%)_Space_149.43_MB_(90.83%)

class Solution {
    fun filterOccupiedIntervals(
        occupiedIntervals: Array<IntArray>,
        freeStart: Int,
        freeEnd: Int,
    ): MutableList<MutableList<Int>> {
        val intervals: MutableList<IntArray> = ArrayList<IntArray>()
        for (occupiedInterval in occupiedIntervals) {
            val first = occupiedInterval[0]
            val second = occupiedInterval[1]
            if (second < freeStart || first > freeEnd) {
                intervals.add(intArrayOf(first, second))
            } else {
                if (first < freeStart) {
                    intervals.add(intArrayOf(first, freeStart - 1))
                }
                if (second > freeEnd) {
                    intervals.add(intArrayOf(freeEnd + 1, second))
                }
            }
        }
        intervals.sortWith(Comparator.comparingInt<IntArray?>(ToIntFunction { a: IntArray? -> a!![0] }))
        return getLists(intervals)
    }

    companion object {
        private fun getLists(intervals: MutableList<IntArray>): MutableList<MutableList<Int>> {
            var index = 0
            val res: MutableList<MutableList<Int>> = ArrayList<MutableList<Int>>()
            while (index < intervals.size) {
                val first = intervals[index][0]
                var second = intervals[index][1]
                while (index + 1 < intervals.size && second + 1 >= intervals[index + 1][0]) {
                    index++
                    second = max(second, intervals[index][1])
                }
                val temp = mutableListOf(first, second)
                res.add(temp)
                index++
            }
            return res
        }
    }
}
