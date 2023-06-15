package g1601_1700.s1671_minimum_number_of_removals_to_make_mountain_array

// #Hard #Array #Dynamic_Programming #Greedy #Binary_Search
// #2023_06_15_Time_264_ms_(100.00%)_Space_38.4_MB_(100.00%)

class Solution {
    fun minimumMountainRemovals(nums: IntArray): Int {
        val n = nums.size
        // lbs -> longest bitomic subsequence
        var lbs = 0
        val dp = IntArray(n)
        // dp[i] -> lis end at index i, dp2[i] -> lds end at index i
        val dp2 = IntArray(n)
        var lis: MutableList<Int> = ArrayList()
        // calculate longest increasing subsequence
        for (i in 0 until n - 1) {
            if (lis.isEmpty() || lis[lis.size - 1] < nums[i]) {
                lis.add(nums[i])
            } else {
                val idx = lis.binarySearch(nums[i])
                if (idx < 0) {
                    lis[-idx - 1] = nums[i]
                }
            }
            dp[i] = lis.size
        }
        lis = ArrayList()
        // calculate longest decreasing subsequence
        for (i in n - 1 downTo 1) {
            if (lis.isEmpty() || lis[lis.size - 1] < nums[i]) {
                lis.add(nums[i])
            } else {
                val idx = lis.binarySearch(nums[i])
                if (idx < 0) {
                    lis[-idx - 1] = nums[i]
                }
            }
            dp2[i] = lis.size
            if (dp[i] > 1 && dp2[i] > 1) {
                lbs = Math.max(lbs, dp[i] + dp2[i] - 1)
            }
        }
        return n - lbs
    }
}
