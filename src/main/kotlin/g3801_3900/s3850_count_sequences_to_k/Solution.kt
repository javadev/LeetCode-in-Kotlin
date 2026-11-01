package g3801_3900.s3850_count_sequences_to_k

// #Hard #Array #Dynamic_Programming #Math #Memoization #Number_Theory #Senior_Staff
// #Weekly_Contest_490 #2026_07_22_Time_144_ms_(90.24%)_Space_64.70_MB_(29.27%)

import kotlin.math.abs

class Solution {
    private lateinit var dp: Array<HashMap<Double, Int>>

    private fun countRec(nums: IntArray, pos: Int, value: Double, target: Double): Int {
        if (pos == nums.size) {
            return if (abs(value - target) <= 0.000000009) 1 else 0
        }
        if (dp[pos].containsKey(value)) {
            return dp[pos][value]!!
        }
        var ret = countRec(nums, pos + 1, value, target)
        ret += countRec(nums, pos + 1, value * nums[pos], target)
        ret += countRec(nums, pos + 1, value / nums[pos], target)
        dp[pos][value] = ret
        return ret
    }

    fun countSequences(nums: IntArray, k: Long): Int {
        dp = Array(22) { HashMap() }
        return countRec(nums, 0, 1.0, 1.0 * k)
    }
}
