package g3401_3500.s3489_zero_array_transformation_iv

// #Medium #2025_03_16_Time_104_ms_(100.00%)_Space_73.10_MB_(100.00%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    private fun solve(q: Array<IntArray>, i: Int, target: Int, k: Int, dp: Array<IntArray>): Int {
        // we found  a valid sum equal to target so return current index of query.
        if (target == 0) {
            return k
        }
        // return a larger number to invalidate this flow
        if (k >= q.size || target < 0) {
            return q.size + 1
        }
        if (dp[target][k] != -1) {
            return dp[target][k]
        }
        // skip current query val
        var res = solve(q, i, target, k + 1, dp)
        // pick the val if its range is in the range of target index
        if (q[k][0] <= i && i <= q[k][1]) {
            res = min(res, solve(q, i, target - q[k][2], k + 1, dp))
        }
        dp[target][k] = res
        return res
    }

    fun minZeroArray(nums: IntArray, queries: Array<IntArray>): Int {
        var ans = -1
        for (i in nums.indices) {
            val dp = Array<IntArray>(nums[i] + 1) { IntArray(queries.size) }
            dp.forEach { row: IntArray -> row.fill(-1) }
            ans = max(ans, solve(queries, i, nums[i], 0, dp))
        }
        return if (ans > queries.size) -1 else ans
    }
}
