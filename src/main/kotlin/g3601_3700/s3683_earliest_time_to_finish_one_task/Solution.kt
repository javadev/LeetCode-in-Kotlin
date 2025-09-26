package g3601_3700.s3683_earliest_time_to_finish_one_task

// #Easy #Array #Weekly_Contest_467 #2025_09_20_Time_1_ms_(100.00%)_Space_52.19_MB_(60.38%)

import kotlin.math.min

class Solution {
    fun earliestTime(tasks: Array<IntArray>): Int {
        var ans = 1000
        for (i in tasks.indices) {
            val st = tasks[i][0]
            val tm = tasks[i][1]
            ans = min(ans, st + tm)
        }
        return ans
    }
}
