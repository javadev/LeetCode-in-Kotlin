package g1201_1300.s1288_remove_covered_intervals

// #Medium #Array #Sorting #2023_06_08_Time_184_ms_(100.00%)_Space_38.2_MB_(80.00%)

import java.util.PriorityQueue
import java.util.Queue

class Solution {
    fun removeCoveredIntervals(intervals: Array<IntArray>): Int {
        val q: Queue<IntArray> = PriorityQueue { a: IntArray, b: IntArray
            ->
            if (a[0] == b[0]) b[1] - a[1] else a[0] - b[0]
        }
        for (interval in intervals) {
            q.offer(interval)
        }
        var prev = q.poll()
        var count = 0
        while (q.isNotEmpty()) {
            val curr = q.poll()
            if (curr[0] >= prev[0] && curr[1] <= prev[1]) {
                count++
            } else {
                prev = curr
            }
        }
        return intervals.size - count
    }
}
