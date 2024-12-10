package g3301_3400.s3381_maximum_subarray_sum_with_length_divisible_by_k

// #Medium #Array #Hash_Table #Prefix_Sum #2024_12_10_Time_6_ms_(100.00%)_Space_83.5_MB_(69.23%)

import kotlin.math.max

class Solution {
    fun maxSubarraySum(nums: IntArray, k: Int): Long {
        val n = nums.size
        val maxSum = LongArray(n)
        var minSum: Long = 0
        for (i in n - 1 downTo n - k + 1) {
            maxSum[i] = Int.Companion.MIN_VALUE.toLong()
            minSum += nums[i]
        }
        minSum += nums[n - k]
        maxSum[n - k] = minSum
        var ans = minSum
        for (i in n - k - 1 downTo 0) {
            minSum = minSum + nums[i] - nums[i + k]
            maxSum[i] = max(minSum, (minSum + maxSum[i + k]))
            ans = max(maxSum[i], ans)
        }
        return ans
    }
}
