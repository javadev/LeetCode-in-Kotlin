package g0201_0300.s0300_longest_increasing_subsequence

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Dynamic_Programming
// #Binary_Search #Algorithm_II_Day_16_Dynamic_Programming #Binary_Search_II_Day_3
// #Dynamic_Programming_I_Day_18 #Udemy_Dynamic_Programming
// #2022_09_11_Time_318_ms_(82.28%)_Space_39.2_MB_(82.77%)

class Solution {
    fun lengthOfLIS(nums: IntArray): Int {
        if (nums.isEmpty()) {
            return 0
        }
        val dp = IntArray(nums.size + 1)
        // prefill the dp table
        for (i in 1 until dp.size) {
            dp[i] = Int.MAX_VALUE
        }
        val left = 1
        var right = 1
        for (curr in nums) {
            var start = left
            var end = right
            // binary search, find the one that is lower than curr
            while (start + 1 < end) {
                val mid = start + (end - start) / 2
                if (dp[mid] > curr) {
                    end = mid
                } else {
                    start = mid
                }
            }
            // update our dp table
            if (dp[start] > curr) {
                dp[start] = curr
            } else if (curr > dp[start] && curr < dp[end]) {
                dp[end] = curr
            } else if (curr > dp[end]) {
                dp[++end] = curr
                right++
            }
        }
        return right
    }
}
