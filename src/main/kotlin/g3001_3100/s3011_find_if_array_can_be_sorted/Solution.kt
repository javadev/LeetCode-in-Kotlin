package g3001_3100.s3011_find_if_array_can_be_sorted

// #Medium #Array #Sorting #Bit_Manipulation #2024_02_28_Time_199_ms_(79.49%)_Space_38.9_MB_(58.97%)

import kotlin.math.max

class Solution {
    fun canSortArray(nums: IntArray): Boolean {
        var lastGroupMax = Int.MIN_VALUE
        var max = nums[0]
        var lastBit = Integer.bitCount(nums[0])
        for (i in 1 until nums.size) {
            val bit = Integer.bitCount(nums[i])
            if (bit == lastBit) {
                max = max(max, nums[i])
            } else {
                lastGroupMax = max
                max = nums[i]
                lastBit = bit
            }
            if (nums[i] < lastGroupMax) {
                return false
            }
        }
        return true
    }
}
