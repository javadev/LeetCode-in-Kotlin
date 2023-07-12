package g2501_2600.s2589_minimum_time_to_complete_all_tasks

// #Hard #Array #Sorting #Greedy #Binary_Search #Stack
// #2023_07_12_Time_422_ms_(100.00%)_Space_58.7_MB_(50.00%)

import java.util.Arrays

class Solution {
    fun findMinimumTime(tasks: Array<IntArray>): Int {
        var res = 0
        val arr = BooleanArray(2001)
        Arrays.sort(tasks) { a: IntArray, b: IntArray ->
            a[1] - b[1]
        }
        for (task in tasks) {
            val start = task[0]
            val end = task[1]
            val dur = task[2]
            var cur = 0
            for (i in start..end) {
                if (arr[i]) {
                    cur++
                }
            }
            if (cur < dur) {
                var i = end
                while (i >= start && cur < dur) {
                    if (!arr[i]) {
                        arr[i] = true
                        res++
                        cur++
                    }
                    i--
                }
            }
        }
        return res
    }
}
