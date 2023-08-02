package g1001_1100.s1035_uncrossed_lines

// #Medium #Array #Dynamic_Programming #2023_05_25_Time_162_ms_(93.33%)_Space_38.5_MB_(34.22%)

class Solution {
    fun maxUncrossedLines(nums1: IntArray, nums2: IntArray): Int {
        var dp = IntArray(nums2.size + 1)
        for (i in 1..nums1.size) {
            val dpRow = IntArray(nums2.size + 1)
            for (j in 1..nums2.size) {
                if (nums1[i - 1] == nums2[j - 1]) {
                    dpRow[j] = dp[j - 1] + 1
                } else {
                    dpRow[j] = dp[j].coerceAtLeast(dpRow[j - 1])
                }
            }
            dp = dpRow
        }
        return dp[nums2.size]
    }
}
