package g3401_3500.s3500_minimum_cost_to_divide_array_into_subarrays

// #Hard #Array #Dynamic_Programming #Prefix_Sum
// #2025_04_01_Time_28_ms_(92.31%)_Space_49.69_MB_(69.23%)

class Solution {
    fun minimumCost(nums: IntArray, cost: IntArray, k: Int): Long {
        val n = nums.size
        val k = k.toLong()
        val preNums = LongArray(n + 1)
        val preCost = LongArray(n + 1)
        for (i in 0..n - 1) {
            preNums[i + 1] = preNums[i] + nums[i]
            preCost[i + 1] = preCost[i] + cost[i]
        }
        val dp = LongArray(n + 1) {
            Long.MAX_VALUE / 2
        }.also { it[0] = 0L }
        for (r in 1..n) for (l in 0..r - 1) {
            val sumNums = preNums[r] * (preCost[r] - preCost[l])
            val sumCost = k * (preCost[n] - preCost[l])
            dp[r] = minOf(dp[r], dp[l] + sumNums + sumCost)
        }
        return dp[n]
    }
}
