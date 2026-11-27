package g4001_4100.s4025_minimize_the_maximum_waiting_time_at_synchronized_traffic_lights

// #Medium #Array #Greedy #Senior #Weekly_Contest_515
// #2026_11_25_Time_3_ms_(100.00%)_Space_121.58_MB_(33.61%)

import kotlin.math.max

class Solution {
    fun minPenalty(period: Int, lights: IntArray, arrivalTime: IntArray): Int {
        var greenMax = Int.MIN_VALUE
        for (light in lights) {
            greenMax = max(greenMax, light)
        }
        var ans = 0
        for (i in arrivalTime) {
            val r = i % period
            val curr = period - r
            if (r >= greenMax) {
                ans = max(ans, curr)
            }
        }
        return ans
    }
}
