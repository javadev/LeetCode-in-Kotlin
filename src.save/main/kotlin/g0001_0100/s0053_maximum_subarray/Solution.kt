package g0001_0100.s0053_maximum_subarray

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #Array #Dynamic_Programming
// #Divide_and_Conquer #Data_Structure_I_Day_1_Array #Dynamic_Programming_I_Day_5
// #Udemy_Famous_Algorithm #2022_08_29_Time_662_ms_(82.48%)_Space_97.8_MB_(24.28%)

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
