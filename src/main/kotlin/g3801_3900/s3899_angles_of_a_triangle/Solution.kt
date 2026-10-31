package g3801_3900.s3899_angles_of_a_triangle

import kotlin.math.acos

// #Medium #Array #Math #Geometry #Senior #Weekly_Contest_497
// #2026_09_17_Time_1_ms_(100.00%)_Space_49.33_MB_(42.62%)

class Solution {
    fun internalAngles(sides: IntArray): DoubleArray? {
        if (sides[0] + sides[1] <= sides[2] || sides[1] + sides[2] <= sides[0] || sides[0] + sides[2] <= sides[1]) {
            return DoubleArray(0)
        }
        val angle = DoubleArray(sides.size)
        angle[0] =
            Math.toDegrees(
                acos(
                    (
                        sides[1] * sides[1] +
                            sides[2] * sides[2] -
                            sides[0] * sides[0]
                        ).toDouble() / (2 * sides[1] * sides[2]),
                ),
            )
        angle[1] =
            Math.toDegrees(
                acos(
                    (
                        sides[0] * sides[0] +
                            sides[2] * sides[2] -
                            sides[1] * sides[1]
                        ).toDouble() / (2 * sides[0] * sides[2]),
                ),
            )
        angle[2] =
            Math.toDegrees(
                acos(
                    (
                        sides[1] * sides[1] +
                            sides[0] * sides[0] -
                            sides[2] * sides[2]
                        ).toDouble() / (2 * sides[1] * sides[0]),
                ),
            )
        var max = angle[0]
        var mid = 0.0
        var min = 0.0
        for (i in 1..<angle.size) {
            if (angle[i] > max) {
                min = mid
                mid = max
                max = angle[i]
            } else {
                if (angle[i] > mid) {
                    min = mid
                    mid = angle[i]
                } else {
                    min = angle[i]
                }
            }
        }
        angle[0] = min
        angle[1] = mid
        angle[2] = max
        return angle
    }
}
