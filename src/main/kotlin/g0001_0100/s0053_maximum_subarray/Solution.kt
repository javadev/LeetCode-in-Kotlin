package g0001_0100.s0053_maximum_subarray

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #Array #Dynamic_Programming
// #Divide_and_Conquer #Data_Structure_I_Day_1_Array #Dynamic_Programming_I_Day_5
// #Udemy_Famous_Algorithm #Top_Interview_150_Kadane's_Algorithm #Big_O_Time_O(n)_Space_O(1)
// #2023_07_10_Time_510_ms_(78.81%)_Space_54.7_MB_(69.00%)

class Solution {
    fun maxSubArray(nums: IntArray): Int {
        var nextMax = nums[0]
        var curMax = nums[0]
        for (i in 1 until nums.size) {
            nextMax += nums[i]
            if (nextMax < nums[i]) {
                nextMax = nums[i]
            }
            if (nextMax > curMax) {
                curMax = nextMax
            }
        }
        return curMax
    }
}
