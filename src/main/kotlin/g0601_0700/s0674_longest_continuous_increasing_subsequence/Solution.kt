package g0601_0700.s0674_longest_continuous_increasing_subsequence

// #Easy #Array #2023_02_15_Time_201_ms_(84.21%)_Space_36.9_MB_(68.42%)

class Solution {
    fun findLengthOfLCIS(nums: IntArray): Int {
        var ans = 1
        var count = 1
        for (i in 0 until nums.size - 1) {
            if (nums[i] < nums[i + 1]) {
                count++
            } else {
                ans = max(count, ans)
                count = 1
            }
        }
        return max(ans, count)
    }

    private fun max(n1: Int, n2: Int): Int {
        return Math.max(n1, n2)
    }
}