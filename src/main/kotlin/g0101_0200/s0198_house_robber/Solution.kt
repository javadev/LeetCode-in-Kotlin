package g0101_0200.s0198_house_robber

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Dynamic_Programming
// #Algorithm_I_Day_12_Dynamic_Programming #Dynamic_Programming_I_Day_3
// #Level_2_Day_12_Dynamic_Programming #Udemy_Dynamic_Programming
// #2022_09_08_Time_156_ms_(92.24%)_Space_34.1_MB_(61.64%)

class Solution {
    fun rob(nums: IntArray): Int {
        if (nums.size == 0) {
            return 0
        }
        if (nums.size == 1) {
            return nums[0]
        }
        if (nums.size == 2) {
            return Math.max(nums[0], nums[1])
        }
        val profit = IntArray(nums.size)
        profit[0] = nums[0]
        profit[1] = Math.max(nums[1], nums[0])
        for (i in 2 until nums.size) {
            profit[i] = Math.max(profit[i - 1], nums[i] + profit[i - 2])
        }
        return profit[nums.size - 1]
    }
}
