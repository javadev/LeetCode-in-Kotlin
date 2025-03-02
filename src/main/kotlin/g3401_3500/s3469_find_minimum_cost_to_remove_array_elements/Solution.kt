package g3401_3500.s3469_find_minimum_cost_to_remove_array_elements

// #Medium #2025_03_02_Time_320_ms_(100.00%)_Space_71.87_MB_(100.00%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    private lateinit var dp: Array<IntArray>

    fun minCost(nums: IntArray): Int {
        dp = Array<IntArray>(1001) { IntArray(1001) }
        dp.forEach { row -> row.fill(-1) }
        return solve(nums, 1, 0)
    }

    private fun solve(nums: IntArray, i: Int, last: Int): Int {
        if (i + 1 >= nums.size) {
            return max(nums[last], if (i < nums.size) nums[i] else 0)
        }
        if (dp[i][last] != -1) {
            return dp[i][last]
        }
        var res: Int = max(nums[i], nums[i + 1]) + solve(nums, i + 2, last)
        res = min(
            res,
            max(nums[i], nums[last]) + solve(nums, i + 2, i + 1),
        )
        res = min(
            res,
            max(nums[i + 1], nums[last]) + solve(nums, i + 2, i),
        )
        dp[i][last] = res
        return res
    }
}
