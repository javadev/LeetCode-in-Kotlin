package g1401_1500.s1480_running_sum_of_1d_array

// #Easy #Array #Prefix_Sum #Level_1_Day_1_Prefix_Sum
// #2023_06_13_Time_195_ms_(21.52%)_Space_37_MB_(56.15%)

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
