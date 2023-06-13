package g1401_1500.s1480_running_sum_of_1d_array

// #Easy #Array #Prefix_Sum #Level_1_Day_1_Prefix_Sum
class Solution {
    fun runningSum(nums: IntArray): IntArray {
        var sum = 0
        val result = IntArray(nums.size)
        for (i in nums.indices) {
            sum += nums[i]
            result[i] = sum
        }
        return result
    }
}
