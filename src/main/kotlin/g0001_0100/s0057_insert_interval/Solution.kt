package g0001_0100.s0057_insert_interval

// #Medium #Array #Level_2_Day_17_Interval #2022_09_21_Time_257_ms_(99.52%)_Space_37.1_MB_(99.52%)

import java.util.Arrays

class Solution {
    fun insert(intervals: Array<IntArray>, newInterval: IntArray): Array<IntArray> {
        val n = intervals.size
        var l = 0
        var r = n - 1
        while (l < n && newInterval[0] > intervals[l][1]) {
            l++
        }
        while (r >= 0 && newInterval[1] < intervals[r][0]) {
            r--
        }
        val res = Array(l + n - r) { IntArray(2) }
        for (i in 0 until l) {
            res[i] = Arrays.copyOf(intervals[i], intervals[i].size)
        }
        res[l][0] = Math.min(newInterval[0], if (l == n) newInterval[0] else intervals[l][0])
        res[l][1] = Math.max(newInterval[1], if (r == -1) newInterval[1] else intervals[r][1])
        var i = l + 1
        var j = r + 1
        while (j < n) {
            res[i] = intervals[j]
            i++
            j++
        }
        return res
    }
}
