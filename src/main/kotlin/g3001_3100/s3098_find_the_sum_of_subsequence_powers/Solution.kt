package g3001_3100.s3098_find_the_sum_of_subsequence_powers

// #Hard #Array #Dynamic_Programming #Sorting #2024_04_20_Time_294_ms_(77.78%)_Space_49_MB_(66.67%)

import kotlin.math.min

class Solution {
    private var len = 0

    private fun dfs(lastIdx: Int, k: Int, minDiff: Int, dp: MutableMap<Long, Int>, nums: IntArray): Int {
        if (k == 0) {
            return minDiff
        }
        val key = ((minDiff.toLong()) shl 12) + (lastIdx.toLong() shl 6) + k
        if (dp.containsKey(key)) {
            return dp[key]!!
        }
        var res = 0
        for (i in lastIdx + 1..len - k) {
            res = (
                res + dfs(
                    i, k - 1, min(minDiff, (nums[i] - nums[lastIdx])), dp, nums,
                )
                ) % MOD
        }
        dp[key] = res
        return res
    }

    fun sumOfPowers(nums: IntArray, k: Int): Int {
        len = nums.size
        nums.sort()
        val dp: MutableMap<Long, Int> = HashMap()
        var res = 0
        for (i in 0..len - k) {
            res = (res + dfs(i, k - 1, nums[len - 1] - nums[0], dp, nums)) % MOD
        }
        return res
    }

    companion object {
        private const val MOD = 1000000007
    }
}
