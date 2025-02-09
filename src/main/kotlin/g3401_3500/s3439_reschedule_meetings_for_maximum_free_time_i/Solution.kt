package g3401_3500.s3439_reschedule_meetings_for_maximum_free_time_i

// #Medium #Array #Greedy #Sliding_Window #2025_02_05_Time_5_ms_(80.00%)_Space_78.59_MB_(17.14%)

import kotlin.math.max

class Solution {
    fun maxFreeTime(eventTime: Int, k: Int, startTime: IntArray, endTime: IntArray): Int {
        val gap = IntArray(startTime.size + 1)
        gap[0] = startTime[0]
        for (i in 1..<startTime.size) {
            gap[i] = startTime[i] - endTime[i - 1]
        }
        gap[startTime.size] = eventTime - endTime[endTime.size - 1]
        var ans = 0
        var sum = 0
        for (i in gap.indices) {
            sum += gap[i] - (if (i >= k + 1) gap[i - (k + 1)] else 0)
            ans = max(ans, sum)
        }
        return ans
    }
}
