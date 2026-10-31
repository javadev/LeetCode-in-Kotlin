package g3801_3900.s3877_minimum_removals_to_achieve_target_xor

import java.util.*
import kotlin.math.max
import kotlin.math.min

// #Medium #Array #Dynamic_Programming #Bit_Manipulation #Staff #Weekly_Contest_494
// #2026_08_13_Time_10_ms_(100.00%)_Space_48.52_MB_(75.00%)

class Solution {
    fun minRemovals(nums: IntArray, target: Int): Int {
        var max = 0
        for (n in nums) {
            max = max(max, n)
        }
        val u = 1 shl (32 - Integer.numberOfLeadingZeros(max))
        if (target >= u) {
            return -1
        }
        val n = nums.size
        val f = Array<IntArray?>(n + 1) { IntArray(u) }
        Arrays.fill(f[0], Int.MAX_VALUE / 2)
        f[0]!![0] = 0
        for (i in 0..<n) {
            for (x in 0..<u) {
                f[i + 1]!![x] = min(f[i]!![x] + 1, f[i]!![x xor nums[i]])
            }
        }
        return if (f[n]!![target] == Int.MAX_VALUE / 2) -1 else f[n]!![target]
    }
}
