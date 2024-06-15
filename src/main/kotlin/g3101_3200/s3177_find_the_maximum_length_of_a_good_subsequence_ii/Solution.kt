package g3101_3200.s3177_find_the_maximum_length_of_a_good_subsequence_ii

// #Hard #Array #Hash_Table #Dynamic_Programming
// #2024_06_15_Time_284_ms_(100.00%)_Space_40.3_MB_(100.00%)

import kotlin.math.max

class Solution {
    fun maximumLength(nums: IntArray, k: Int): Int {
        val hm = HashMap<Int, Int>()
        val n = nums.size
        val pre = IntArray(n)
        for (i in 0 until n) {
            pre[i] = hm.getOrDefault(nums[i], -1)
            hm[nums[i]] = i
        }
        val dp = Array(k + 1) { IntArray(n) }
        for (i in 0 until n) {
            dp[0][i] = 1
            if (pre[i] >= 0) {
                dp[0][i] = dp[0][pre[i]] + 1
            }
        }
        for (i in 1..k) {
            var max = 0
            for (j in 0 until n) {
                if (pre[j] >= 0) {
                    dp[i][j] = dp[i][pre[j]] + 1
                }
                dp[i][j] = max(dp[i][j], (max + 1))
                max = max(max, dp[i - 1][j])
            }
        }
        var max = 0
        for (i in 0 until n) {
            max = max(max, dp[k][i])
        }
        return max
    }
}
