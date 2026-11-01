package g3901_4000.s3964_minimum_lights_to_illuminate_a_road

// #Medium #Array #Prefix_Sum #Staff #Biweekly_Contest_185
// #2026_10_20_Time_7_ms_(100.00%)_Space_204.80_MB_(14.68%)

import kotlin.math.max

class Solution {
    fun minLights(lights: IntArray): Int {
        val n = lights.size
        for (i in 0..<n) {
            if (lights[i] != 0) {
                val pos = max(0, i - lights[i])
                lights[pos] = max(lights[i], lights[pos])
            }
        }
        var ans = 0
        var coverage = 0
        for (i in 0..<n) {
            if (lights[i] == 0 && coverage == 0) {
                ans++
                if (i + 1 < n && lights[i + 1] == 0) {
                    coverage = 3
                }
            }
            coverage--
            coverage = max(coverage, lights[i])
        }
        return ans
    }
}
