package g3401_3500.s3469_find_minimum_cost_to_remove_array_elements

// #Medium #2025_03_06_Time_51_ms_(100.00%)_Space_46.26_MB_(100.00%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun minCost(nums: IntArray): Int {
        var nums = nums
        var n = nums.size
        if (n % 2 == 0) {
            nums = nums.copyOf(++n)
        }
        val dp = IntArray(n)
        var j = 1
        while (j < n - 1) {
            var cost1: Int = INF
            var cost2: Int = INF
            val max = max(nums[j], nums[j + 1])
            for (i in 0..<j) {
                cost1 =
                    min(cost1, dp[i] + max(nums[i], nums[j + 1]))
                cost2 = min(cost2, dp[i] + max(nums[i], nums[j]))
                dp[i] += max
            }
            dp[j] = cost1
            dp[j + 1] = cost2
            j += 2
        }
        var result: Int = INF
        for (i in 0..<n) {
            result = min(result, dp[i] + nums[i])
        }
        return result
    }

    companion object {
        private const val INF = 1e9.toInt()
    }
}
