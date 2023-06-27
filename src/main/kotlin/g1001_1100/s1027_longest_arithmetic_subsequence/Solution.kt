package g1001_1100.s1027_longest_arithmetic_subsequence

// #Medium #Array #Hash_Table #Dynamic_Programming #Binary_Search
// #2023_05_23_Time_330_ms_(100.00%)_Space_101.4_MB_(16.67%)

import java.util.Arrays

class Solution {
    fun longestArithSeqLength(nums: IntArray): Int {
        val max = maxElement(nums)
        val min = minElement(nums)
        val diff = max - min
        val n = nums.size
        val dp = Array(n) { IntArray(2 * diff + 2) }
        for (d in dp) {
            Arrays.fill(d, 1)
        }
        var ans = 0
        for (i in 0 until n) {
            for (j in i - 1 downTo 0) {
                val difference = nums[i] - nums[j] + diff
                val temp = dp[j][difference]
                dp[i][difference] = Math.max(dp[i][difference], temp + 1)
                if (ans < dp[i][difference]) {
                    ans = dp[i][difference]
                }
            }
        }
        return ans
    }

    private fun maxElement(arr: IntArray): Int {
        var max = Int.MIN_VALUE
        for (e in arr) {
            if (max < e) {
                max = e
            }
        }
        return max
    }

    private fun minElement(arr: IntArray): Int {
        var min = Int.MAX_VALUE
        for (e in arr) {
            if (min > e) {
                min = e
            }
        }
        return min
    }
}
