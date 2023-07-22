package g0401_0500.s0416_partition_equal_subset_sum

// #Medium #Top_100_Liked_Questions #Array #Dynamic_Programming #Level_2_Day_13_Dynamic_Programming
// #2023_01_02_Time_204_ms_(98.82%)_Space_34.9_MB_(100.00%)

class Solution {
    fun canPartition(nums: IntArray): Boolean {
        var sums = 0
        for (num in nums) {
            sums += num
        }
        if (sums % 2 == 1) {
            return false
        }
        sums /= 2
        val dp = BooleanArray(sums + 1)
        dp[0] = true
        for (num in nums) {
            for (sum in sums downTo num) {
                dp[sum] = dp[sum] || dp[sum - num]
            }
        }
        return dp[sums]
    }
}
