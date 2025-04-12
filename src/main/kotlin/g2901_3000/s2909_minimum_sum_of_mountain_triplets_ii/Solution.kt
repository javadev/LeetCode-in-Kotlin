package g2901_3000.s2909_minimum_sum_of_mountain_triplets_ii

// #Medium #Array #2023_12_27_Time_463_ms_(100.00%)_Space_64.6_MB_(50.00%)

import kotlin.math.min

class Solution {
    fun minimumSum(nums: IntArray): Int {
        val n = nums.size
        val leftSmallest = IntArray(n)
        val rightSmallest = IntArray(n)
        var currSmallest = nums[0]
        leftSmallest[0] = -1
        for (i in 1 until n) {
            if (currSmallest >= nums[i]) {
                leftSmallest[i] = -1
                currSmallest = nums[i]
            } else {
                leftSmallest[i] = currSmallest
            }
        }
        currSmallest = nums[n - 1]
        rightSmallest[n - 1] = -1
        for (i in n - 2 downTo 0) {
            if (currSmallest >= nums[i]) {
                rightSmallest[i] = -1
                currSmallest = nums[i]
            } else {
                rightSmallest[i] = currSmallest
            }
        }
        var ans = Int.MAX_VALUE
        for (i in 0 until n) {
            if (leftSmallest[i] != -1 && rightSmallest[i] != -1) {
                ans = min(ans, leftSmallest[i] + rightSmallest[i] + nums[i])
            }
        }
        if (ans == Int.MAX_VALUE) {
            return -1
        }
        return ans
    }
}
