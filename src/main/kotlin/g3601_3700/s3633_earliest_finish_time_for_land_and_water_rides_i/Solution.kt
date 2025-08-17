package g3601_3700.s3633_earliest_finish_time_for_land_and_water_rides_i

// #Easy #Array #Sorting #Greedy #Binary_Search #Two_Pointers #Biweekly_Contest_162
// #2025_08_03_Time_15_ms_(100.00%)_Space_48.53_MB_(100.00%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun earliestFinishTime(
        landStartTime: IntArray,
        landDuration: IntArray,
        waterStartTime: IntArray,
        waterDuration: IntArray,
    ): Int {
        var res = Int.Companion.MAX_VALUE
        val n = landStartTime.size
        val m = waterStartTime.size
        // Try all combinations of one land and one water ride
        for (i in 0..<n) {
            // start time of land ride
            val a = landStartTime[i]
            // duration of land ride
            val d = landDuration[i]
            for (j in 0..<m) {
                // start time of water ride
                val b = waterStartTime[j]
                // duration of water ride
                val e = waterDuration[j]
                // Case 1: Land → Water
                val landEnd = a + d
                // wait if needed
                val startWater = max(landEnd, b)
                val finish1 = startWater + e
                // Case 2: Water → Land
                val waterEnd = b + e
                // wait if needed
                val startLand = max(waterEnd, a)
                val finish2 = startLand + d
                // Take the minimum finish time
                res = min(res, min(finish1, finish2))
            }
        }
        return res
    }
}
