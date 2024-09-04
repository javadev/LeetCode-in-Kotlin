package g3201_3300.s3277_maximum_xor_score_subarray_queries

// #Hard #Array #Dynamic_Programming #2024_09_04_Time_1269_ms_(100.00%)_Space_116.7_MB_(75.00%)

import kotlin.math.max

class Solution {
    fun maximumSubarrayXor(nums: IntArray, queries: Array<IntArray>): IntArray {
        val n = nums.size
        val dp = Array(n) { IntArray(n) }
        for (i in 0 until n) {
            dp[i][i] = nums[i]
        }
        for (i in n - 2 downTo 0) {
            for (j in i + 1 until n) {
                dp[i][j] = dp[i][j - 1] xor dp[i + 1][j]
            }
        }
        for (i in n - 2 downTo 0) {
            for (j in i + 1 until n) {
                dp[i][j] = max(dp[i][j], max(dp[i][j - 1], dp[i + 1][j]))
            }
        }
        val q = queries.size
        val ans = IntArray(q)
        var time = 0
        for (query in queries) {
            ans[time++] = dp[query[0]][query[1]]
        }
        return ans
    }
}
