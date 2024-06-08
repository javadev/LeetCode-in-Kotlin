package g3101_3200.s3171_find_subarray_with_bitwise_and_closest_to_k

// #Hard #Array #Binary_Search #Bit_Manipulation #Segment_Tree
// #2024_06_08_Time_520_ms_(100.00%)_Space_63.6_MB_(96.15%)

import kotlin.math.abs
import kotlin.math.min

class Solution {
    fun minimumDifference(nums: IntArray, k: Int): Int {
        var res = Int.MAX_VALUE
        for (i in nums.indices) {
            res = min(res, abs((nums[i] - k)))
            var j = i - 1
            while (j >= 0 && (nums[j] and nums[i]) != nums[j]) {
                nums[j] = nums[j] and nums[i]
                res = min(res, abs((nums[j] - k)))
                j--
            }
        }
        return res
    }
}
