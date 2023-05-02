package g0701_0800.s0798_smallest_rotation_with_highest_score

// #Hard #Array #Prefix_Sum #2023_03_15_Time_470_ms_(100.00%)_Space_53.5_MB_(100.00%)

class Solution {
    // nums[i] will be in the range [0, nums.length].
    // At which positions will we lose points? The answer is k = i - nums[i] + 1.
    // We need to accumulate points we have lost from previous rotations using prefix sum except one
    // we did not lose.
    fun bestRotation(nums: IntArray): Int {
        val n = nums.size
        var res = 0
        val change = IntArray(n)
        for (i in 0 until n) {
            change[(i - nums[i] + 1 + n) % n]--
        }
        for (i in 1 until n) {
            change[i] += change[i - 1] + 1
            res = if (change[i] > change[res]) i else res
        }
        return res
    }
}
