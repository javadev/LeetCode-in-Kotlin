package g2501_2600.s2574_left_and_right_sum_differences

// #Easy #Array #Prefix_Sum #2023_07_10_Time_203_ms_(100.00%)_Space_39.7_MB_(64.06%)

class Solution {
    fun leftRightDifference(nums: IntArray): IntArray {
        val n = nums.size
        val ans: IntArray = IntArray(n)
        var rightSum = nums.sum()
        var leftSum = 0

        for (i in nums.indices) {
            rightSum = rightSum - nums[i]
            ans[i] = Math.abs(leftSum - rightSum)
            leftSum += nums[i]
        }

        return ans
    }
}
