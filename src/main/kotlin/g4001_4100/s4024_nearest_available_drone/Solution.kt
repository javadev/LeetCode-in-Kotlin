package g4001_4100.s4024_nearest_available_drone

// #Easy #Array #Enumeration #Mid_Level #Weekly_Contest_515
// #2026_11_25_Time_2_ms_(50.35%)_Space_45.70_MB_(93.36%)

import kotlin.math.abs

class Solution {
    fun nearestDrone(drones: Array<IntArray>, target: IntArray): Int {
        var min = Int.MAX_VALUE
        var idx = -1
        for (i in drones.indices) {
            val d = drones[i]
            val dist = abs(target[0] - d[0]) + abs(target[1] - d[1])
            if (dist <= d[2] && min > dist) {
                min = dist
                idx = i
            }
        }
        return idx
    }
}
