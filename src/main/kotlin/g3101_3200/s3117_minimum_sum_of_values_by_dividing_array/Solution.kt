package g3101_3200.s3117_minimum_sum_of_values_by_dividing_array

// #Hard #Array #Dynamic_Programming #Binary_Search #Bit_Manipulation #Queue #Segment_Tree
// #2024_04_27_Time_244_ms_(100.00%)_Space_40.9_MB_(100.00%)

import kotlin.math.min

class Solution {
    fun minimumValueSum(nums: IntArray, andValues: IntArray): Int {
        val n = nums.size
        var dp = IntArray(n + 1)
        dp.fill(INF)
        dp[0] = 0
        for (target in andValues) {
            var sum = INF
            var minSum = INF
            var rightSum = INF
            val leftSum = IntArray(n + 1)
            leftSum[0] = INF
            var left = 0
            var right = 0
            val nextdp = IntArray(n + 1)
            nextdp[0] = INF
            for (i in 0 until n) {
                sum = sum and nums[i]
                rightSum = rightSum and nums[i]
                ++right
                if (sum < target) {
                    minSum = INF
                    sum = nums[i]
                }
                while ((leftSum[left] and rightSum) <= target) {
                    if ((leftSum[left] and rightSum) == target) {
                        minSum = min(minSum, dp[i - left - right + 1])
                    }
                    if (left-- > 0) {
                        continue
                    }
                    left = right
                    var start = i
                    for (l in 1..left) {
                        leftSum[l] = leftSum[l - 1] and nums[start--]
                    }
                    right = 0
                    rightSum = INF
                }
                nextdp[i + 1] = minSum + nums[i]
            }
            dp = nextdp
        }
        return if (dp[n] < INF) dp[n] else -1
    }

    companion object {
        private const val INF = 0xfffffff
    }
}
