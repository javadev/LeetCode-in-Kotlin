package g2501_2600.s2552_count_increasing_quadruplets

// #Hard #Array #Dynamic_Programming #Prefix_Sum #Enumeration #Binary_Indexed_Tree
// #2023_07_06_Time_268_ms_(66.67%)_Space_39.5_MB_(16.67%)

class Solution {
    fun countQuadruplets(nums: IntArray): Long {
        val len = nums.size
        val dp = LongArray(len)
        var ans: Long = 0
        for (i in 0 until len) {
            var smallerThanK = 0
            for (j in 0 until i) {
                if (nums[i] > nums[j]) {
                    smallerThanK++
                    ans += dp[j]
                } else {
                    dp[j] += smallerThanK.toLong()
                }
            }
        }
        return ans
    }
}
