package g3001_3100.s3030_find_the_grid_of_region_average

// #Medium #Array #Matrix #2024_03_01_Time_53_ms_(98.79%)_Space_88.4_MB_(35.20%)

import kotlin.math.abs

class Solution {
    fun resultGrid(image: Array<IntArray>, threshold: Int): Array<IntArray> {
        val n = image.size
        val m = image[0].size
        val intensity = Array(n) { IntArray(m) }
        val count = Array(n) { IntArray(m) }
        for (i in 1 until n - 1) {
            for (j in 1 until m - 1) {
                var regionPossible = true
                var regionSum = 0
                val r0c0 = image[i - 1][j - 1]
                val r0c1 = image[i - 1][j]
                val r0c2 = image[i - 1][j + 1]
                val r1c0 = image[i][j - 1]
                val r1c1 = image[i][j]
                val r1c2 = image[i][j + 1]
                val r2c0 = image[i + 1][j - 1]
                val r2c1 = image[i + 1][j]
                val r2c2 = image[i + 1][j + 1]
                regionSum += (r0c0 + r0c1 + r0c2 + r1c0 + r1c1 + r1c2 + r2c0 + r2c1 + r2c2)
                if (abs((r0c0 - r0c1)) > threshold || abs((r0c0 - r1c0)) > threshold || abs(
                        (r0c1 - r0c0)
                    ) > threshold || abs((r0c1 - r1c1)) > threshold || abs((r0c1 - r0c2)) > threshold || abs(
                            (r0c2 - r0c1)
                        ) > threshold || abs((r0c2 - r1c2)) > threshold || abs((r1c0 - r1c1)) > threshold || abs(
                            (r1c2 - r1c1)
                        ) > threshold || abs((r2c0 - r2c1)) > threshold || abs((r2c0 - r1c0)) > threshold || abs(
                            (r2c1 - r2c0)
                        ) > threshold || abs((r2c1 - r1c1)) > threshold || abs((r2c1 - r2c2)) > threshold || abs(
                            (r2c2 - r2c1)
                        ) > threshold || abs((r2c2 - r1c2)) > threshold
                ) {
                    regionPossible = false
                }
                if (regionPossible) {
                    regionSum /= 9
                    for (k in -1..1) {
                        for (l in -1..1) {
                            intensity[i + k][j + l] += regionSum
                            count[i + k][j + l]++
                        }
                    }
                }
            }
        }
        for (i in 0 until n) {
            for (j in 0 until m) {
                if (count[i][j] == 0) {
                    intensity[i][j] = image[i][j]
                } else {
                    intensity[i][j] = intensity[i][j] / count[i][j]
                }
            }
        }
        return intensity
    }
}
