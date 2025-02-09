package g3301_3400.s3394_check_if_grid_can_be_cut_into_sections

// #Medium #Geometry #Line_Sweep #2025_01_06_Time_61_ms_(100.00%)_Space_152.17_MB_(45.00%)

import kotlin.math.max

@Suppress("unused")
class Solution {
    fun checkValidCuts(m: Int, rectangles: Array<IntArray>): Boolean {
        val n = rectangles.size
        val start = LongArray(n)
        for (i in 0..<n) {
            start[i] = (rectangles[i][1].toLong() shl 32) + rectangles[i][3]
        }
        start.sort()
        if (validate(start)) {
            return true
        }
        for (i in 0..<n) {
            start[i] = (rectangles[i][0].toLong() shl 32) + rectangles[i][2]
        }
        start.sort()
        return validate(start)
    }

    private fun validate(arr: LongArray): Boolean {
        var cut = 0
        val n = arr.size
        var max = arr[0].toInt() and MASK
        for (i in 0..<n) {
            val start = (arr[i] shr 32).toInt()
            if (start >= max && ++cut == 2) {
                return true
            }
            max = max(max.toDouble(), (arr[i] and MASK.toLong()).toInt().toDouble()).toInt()
        }
        return false
    }

    companion object {
        private val MASK = (1 shl 30) - 1
    }
}
