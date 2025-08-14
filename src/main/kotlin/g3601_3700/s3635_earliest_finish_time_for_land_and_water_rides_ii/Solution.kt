package g3601_3700.s3635_earliest_finish_time_for_land_and_water_rides_ii

// #Medium #Array #Sorting #Greedy #Binary_Search #Two_Pointers #Biweekly_Contest_162
// #2025_08_03_Time_5_ms_(100.00%)_Space_73.02_MB_(100.00%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun earliestFinishTime(
        landStartTime: IntArray,
        landDuration: IntArray,
        waterStartTime: IntArray,
        waterDuration: IntArray,
    ): Int {
        var ans = Int.Companion.MAX_VALUE
        // take land first
        val n = landStartTime.size
        var minEnd = Int.Companion.MAX_VALUE
        for (i in 0..<n) {
            minEnd = min(minEnd, landStartTime[i] + landDuration[i])
        }
        val m = waterStartTime.size
        for (i in 0..<m) {
            ans = min(ans, waterDuration[i] + max(minEnd, waterStartTime[i]))
        }
        // take water first
        minEnd = Int.Companion.MAX_VALUE
        for (i in 0..<m) {
            minEnd = min(minEnd, waterStartTime[i] + waterDuration[i])
        }
        for (i in 0..<n) {
            ans = min(ans, landDuration[i] + max(minEnd, landStartTime[i]))
        }
        return ans
    }
}
