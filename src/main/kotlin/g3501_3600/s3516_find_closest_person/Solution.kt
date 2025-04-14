package g3501_3600.s3516_find_closest_person

// #Easy #Math #2025_04_14_Time_1_ms_(100.00%)_Space_41.06_MB_(100.00%)

import kotlin.math.abs

class Solution {
    fun findClosest(x: Int, y: Int, z: Int): Int {
        val d1 = abs(z - x)
        val d2 = abs(z - y)
        return if (d1 == d2) {
            0
        } else if (d1 < d2) {
            1
        } else {
            2
        }
    }
}
