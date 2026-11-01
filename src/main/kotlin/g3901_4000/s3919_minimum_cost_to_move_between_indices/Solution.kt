package g3901_4000.s3919_minimum_cost_to_move_between_indices

// #Medium #Array #Greedy #Prefix_Sum #Staff #Weekly_Contest_500
// #2026_09_15_Time_4_ms_(100.00%)_Space_187.52_MB_(54.12%)

import kotlin.math.abs

class Solution {
    fun minCost(nums: IntArray, queries: Array<IntArray>): IntArray {
        val n = nums.size
        val prefixSum = IntArray(n)
        val suffixSum = IntArray(n)
        prefixSum[1] = 1
        for (i in 1..<n - 1) {
            val left = abs(nums[i] - nums[i - 1])
            val right = abs(nums[i] - nums[i + 1])
            if (left <= right) {
                prefixSum[i + 1] = prefixSum[i] + right
                suffixSum[i] = suffixSum[i - 1] + 1
            } else {
                prefixSum[i + 1] = prefixSum[i] + 1
                suffixSum[i] = suffixSum[i - 1] + left
            }
        }
        suffixSum[n - 1] = suffixSum[n - 2] + 1
        val ans = IntArray(queries.size)
        var i = 0
        for (qur in queries) {
            val l = qur[0]
            val r = qur[1]
            if (l > r) {
                ans[i++] = suffixSum[l] - suffixSum[r]
            } else {
                ans[i++] = prefixSum[r] - prefixSum[l]
            }
        }
        return ans
    }
}
