package g1601_1700.s1620_coordinate_with_maximum_network_quality

// #Medium #Array #Enumeration #2023_06_16_Time_233_ms_(100.00%)_Space_35.4_MB_(100.00%)

import kotlin.math.floor
import kotlin.math.sqrt

class Solution {
    fun bestCoordinate(towers: Array<IntArray>, radius: Int): IntArray {
        val res = IntArray(2)
        var maxQuality = 0.0
        var quality: Double
        var finalX = 0
        var finalY = 0
        for (i in 0..50) {
            for (j in 0..50) {
                quality = 0.0
                for (tower in towers) {
                    val x = tower[0] - i
                    val y = tower[1] - j
                    val dist = sqrt(x.toDouble() * x + y * y)
                    if (dist <= radius) {
                        quality += floor(tower[2] / (1 + dist))
                    }
                }
                if (maxQuality < quality) {
                    maxQuality = quality
                    finalX = i
                    finalY = j
                }
            }
        }
        res[0] = finalX
        res[1] = finalY
        return res
    }
}
