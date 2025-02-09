package g3401_3500.s3440_reschedule_meetings_for_maximum_free_time_ii

// #Medium #Array #Greedy #Enumeration #2025_02_05_Time_8_ms_(100.00%)_Space_70.10_MB_(68.00%)

import kotlin.math.max

class Solution {
    fun maxFreeTime(eventTime: Int, startTime: IntArray, endTime: IntArray): Int {
        val gap = IntArray(startTime.size + 1)
        val largestRight = IntArray(startTime.size + 1)
        gap[0] = startTime[0]
        for (i in 1..<startTime.size) {
            gap[i] = startTime[i] - endTime[i - 1]
        }
        gap[startTime.size] = eventTime - endTime[endTime.size - 1]
        for (i in gap.size - 2 downTo 0) {
            largestRight[i] = max(largestRight[i + 1], gap[i + 1])
        }
        var ans = 0
        var largestLeft = 0
        for (i in 1..<gap.size) {
            val curGap = endTime[i - 1] - startTime[i - 1]
            if (largestLeft >= curGap || largestRight[i] >= curGap) {
                ans = max(ans, (gap[i - 1] + gap[i] + curGap))
            }
            ans = max(ans, (gap[i - 1] + gap[i]))
            largestLeft = max(largestLeft, gap[i - 1])
        }
        return ans
    }
}
