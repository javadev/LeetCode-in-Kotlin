package g3601_3700.s3660_jump_game_ix

// #Medium #Weekly_Contest_464 #2025_08_29_Time_5_ms_(100.00%)_Space_83.83_MB_(92.31%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maxValue(nums: IntArray): IntArray {
        val f = IntArray(nums.size)
        var cur = 0
        for (i in nums.indices) {
            cur = max(cur, nums[i])
            f[i] = cur
        }
        var min = nums[nums.size - 1]
        for (i in nums.size - 2 downTo 0) {
            if (f[i] > min) {
                f[i] = max(f[i], f[i + 1])
            }
            min = min(min, nums[i])
        }
        return f
    }
}
