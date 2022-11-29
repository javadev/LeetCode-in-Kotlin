package g0301_0400.s0396_rotate_function

// #Medium #Array #Dynamic_Programming #Math #2022_11_30_Time_571_ms_(87.50%)_Space_54.1_MB_(62.50%)

class Solution {
    fun maxRotateFunction(nums: IntArray): Int {
        var allSum = 0
        val len = nums.size
        var f = 0
        for (i in 0 until len) {
            f += i * nums[i]
            allSum += nums[i]
        }
        var max = f
        for (i in len - 1 downTo 1) {
            f += allSum - len * nums[i]
            max = Math.max(f, max)
        }
        return max
    }
}
