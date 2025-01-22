package g3401_3500.s3427_sum_of_variable_length_subarrays

// #Easy #Array #Prefix_Sum #2025_01_22_Time_0_(100.00%)_Space_43.77_(58.41%)

class Solution {
    fun subarraySum(nums: IntArray): Int {
        var res = nums[0]
        for (i in 1..<nums.size) {
            val j = i - nums[i] - 1
            nums[i] += nums[i - 1]
            res += nums[i] - (if (j < 0) 0 else nums[j])
        }
        return res
    }
}
