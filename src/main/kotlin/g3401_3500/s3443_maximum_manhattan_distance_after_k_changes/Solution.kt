package g3401_3500.s3443_maximum_manhattan_distance_after_k_changes

// #Medium #String #Hash_Table #Math #Counting
// #2025_02_05_Time_52_ms_(100.00%)_Space_39.63_MB_(100.00%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maxDistance(s: String, k: Int): Int {
        var north = 0
        var south = 0
        var west = 0
        var east = 0
        var result = 0
        for (c in s.toCharArray()) {
            if (c == 'N') {
                north++
            } else if (c == 'S') {
                south++
            } else if (c == 'E') {
                east++
            } else if (c == 'W') {
                west++
            }
            val hMax = max(north, south)
            val vMax = max(west, east)
            val hMin = min(north, south)
            val vMin = min(west, east)
            if (hMin + vMin >= k) {
                val curr = hMax + vMax + k - (hMin + vMin - k)
                result = max(result, curr)
            } else {
                val curr = hMax + vMax + hMin + vMin
                result = max(result, curr)
            }
        }
        return result
    }
}
