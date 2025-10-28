package g3701_3800.s3724_minimum_operations_to_transform_array

// #Medium #Biweekly_Contest_168 #2025_10_28_Time_10_ms_(83.33%)_Space_66.99_MB_(100.00%)

import kotlin.math.abs
import kotlin.math.max
import kotlin.math.min

class Solution {
    fun minOperations(nums1: IntArray, nums2: IntArray): Long {
        val n = nums1.size
        val last = nums2[n]
        var steps: Long = 1
        var minDiffFromLast = Long.MAX_VALUE
        for (i in 0..<n) {
            val min = min(nums1[i], nums2[i])
            val max = max(nums1[i], nums2[i])
            steps += abs(max - min).toLong()
            if (minDiffFromLast > 0) {
                if (min <= last && last <= max) {
                    minDiffFromLast = 0
                } else {
                    minDiffFromLast = min(
                        minDiffFromLast,
                        min(abs(min - last), abs(max - last)).toLong(),
                    )
                }
            }
        }
        return steps + minDiffFromLast
    }
}
