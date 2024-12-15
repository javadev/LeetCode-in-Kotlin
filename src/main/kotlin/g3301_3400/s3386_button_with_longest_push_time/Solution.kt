package g3301_3400.s3386_button_with_longest_push_time

// #Easy #2024_12_15_Time_1_ms_(100.00%)_Space_40.6_MB_(100.00%)

import kotlin.math.min

class Solution {
    fun buttonWithLongestTime(events: Array<IntArray>): Int {
        var ans = 0
        var time = 0
        var last = 0
        for (event in events) {
            val diff = event[1] - last
            if (diff > time) {
                time = diff
                ans = event[0]
            } else if (diff == time) {
                ans = min(ans, event[0])
            }
            last = event[1]
        }
        return ans
    }
}
