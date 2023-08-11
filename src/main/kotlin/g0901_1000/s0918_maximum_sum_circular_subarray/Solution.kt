package g0901_1000.s0918_maximum_sum_circular_subarray

// #Medium #Array #Dynamic_Programming #Divide_and_Conquer #Queue #Monotonic_Queue
// #Dynamic_Programming_I_Day_5 #2023_04_16_Time_339_ms_(86.96%)_Space_46.4_MB_(56.52%)

class Solution {
    private fun kadane(nums: IntArray, sign: Int): Int {
        var currSum = Int.MIN_VALUE
        var maxSum = Int.MIN_VALUE
        for (i in nums) {
            currSum = sign * i + currSum.coerceAtLeast(0)
            maxSum = maxSum.coerceAtLeast(currSum)
        }
        return maxSum
    }

    fun maxSubarraySumCircular(nums: IntArray): Int {
        if (nums.size == 1) {
            return nums[0]
        }
        var sumOfArray = 0
        for (i in nums) {
            sumOfArray += i
        }
        val maxSumSubarray = kadane(nums, 1)
        val minSumSubarray = kadane(nums, -1) * -1
        return if (sumOfArray == minSumSubarray) {
            maxSumSubarray
        } else {
            maxSumSubarray.coerceAtLeast(sumOfArray - minSumSubarray)
        }
    }
}
