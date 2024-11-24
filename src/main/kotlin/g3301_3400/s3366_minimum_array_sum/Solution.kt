package g3301_3400.s3366_minimum_array_sum

// #Medium #2024_11_24_Time_59_ms_(100.00%)_Space_53.4_MB_(100.00%)

import kotlin.math.ceil
import kotlin.math.min

class Solution {
    fun minArraySum(nums: IntArray, k: Int, op1: Int, op2: Int): Int {
        val dp = Array<Array<Array<Int?>?>?>(nums.size) { Array<Array<Int?>?>(op1 + 1) { arrayOfNulls<Int>(op2 + 1) } }
        return sub(dp, nums, 0, k, op1, op2)
    }

    private fun sub(dp: Array<Array<Array<Int?>?>?>, nums: IntArray, i: Int, k: Int, op1: Int, op2: Int): Int {
        if (i == nums.size) {
            return 0
        }
        if (dp[i]!![op1]!![op2] != null) {
            return dp[i]!![op1]!![op2]!!
        }
        var res = sub(dp, nums, i + 1, k, op1, op2) + nums[i]
        if (nums[i] >= k && op2 > 0) {
            res = min(res, (sub(dp, nums, i + 1, k, op1, op2 - 1) + nums[i] - k))
            var v = ceil(nums[i] / 2.0)
            if (v < k) {
                v = ceil((nums[i] - k) / 2.0)
            } else {
                v -= k
            }
            if (op1 > 0) {
                res = min(res, (sub(dp, nums, i + 1, k, op1 - 1, op2 - 1) + v).toInt())
            }
        }
        if (op1 > 0) {
            val v = ceil(nums[i] / 2.0)
            res = min(res, (sub(dp, nums, i + 1, k, op1 - 1, op2) + v).toInt())
        }
        dp[i]!![op1]!![op2] = res
        return res
    }
}
