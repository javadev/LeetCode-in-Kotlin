package g1601_1700.s1685_sum_of_absolute_differences_in_a_sorted_array

// #Medium #Array #Math #Prefix_Sum #2023_06_15_Time_612_ms_(100.00%)_Space_55_MB_(100.00%)

class Solution {
    fun getSumAbsoluteDifferences(nums: IntArray): IntArray {
        val len = nums.size
        val preSums = IntArray(len)
        for (i in 1 until len) {
            preSums[i] = preSums[i - 1] + nums[i - 1]
        }
        val postSums = IntArray(len)
        for (i in len - 2 downTo 0) {
            postSums[i] = postSums[i + 1] + nums[i + 1]
        }
        val result = IntArray(len)
        for (i in 0 until len) {
            result[i] = nums[i] * i - preSums[i] + postSums[i] - nums[i] * (len - i - 1)
        }
        return result
    }
}
