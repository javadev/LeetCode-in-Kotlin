package g3301_3400.s3354_make_array_elements_equal_to_zero

// #Easy #Array #Simulation #Prefix_Sum #2024_11_19_Time_153_ms_(96.67%)_Space_35.4_MB_(93.33%)

import kotlin.math.abs

class Solution {
    fun countValidSelections(nums: IntArray): Int {
        val rightSum = IntArray(nums.size)
        val leftSum = IntArray(nums.size)
        var result = 0
        leftSum[0] = 0
        rightSum[nums.size - 1] = 0
        for (i in 1..<nums.size) {
            leftSum[i] = leftSum[i - 1] + nums[i - 1]
        }
        for (j in nums.size - 2 downTo 0) {
            rightSum[j] = rightSum[j + 1] + nums[j + 1]
        }
        for (k in nums.indices) {
            if (nums[k] == 0 && abs((rightSum[k] - leftSum[k])) == 1) {
                result++
            }
            if (nums[k] == 0 && abs((rightSum[k] - leftSum[k])) == 0) {
                result += 2
            }
        }
        return result
    }
}
