package g3201_3300.s3296_minimum_number_of_seconds_to_make_mountain_height_zero

// #Medium #Array #Math #Binary_Search #2024_09_24_Time_228_ms_(87.50%)_Space_38.6_MB_(81.25%)

import kotlin.math.sqrt

class Solution {
    fun minNumberOfSeconds(mountainHeight: Int, workerTimes: IntArray): Long {
        var left: Long = 0
        var right = mountainHeight.toLong() * (mountainHeight + 1) / 2 * workerTimes[0]
        while (left < right) {
            val mid = left + (right - left) / 2
            if (canReduceMountain(workerTimes, mountainHeight, mid)) {
                right = mid
            } else {
                left = mid + 1
            }
        }
        return left
    }

    private fun canReduceMountain(workerTimes: IntArray, mountainHeight: Int, timeLimit: Long): Boolean {
        var totalHeightReduced: Long = 0
        for (workerTime in workerTimes) {
            val maxHeightThisWorker = (sqrt(2.0 * timeLimit / workerTime + 0.25) - 0.5).toLong()
            totalHeightReduced += maxHeightThisWorker
            if (totalHeightReduced >= mountainHeight) {
                return true
            }
        }
        return totalHeightReduced >= mountainHeight
    }
}
