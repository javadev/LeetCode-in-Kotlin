package g0201_0300.s0213_house_robber_ii

// #Medium #Array #Dynamic_Programming #Algorithm_II_Day_12_Dynamic_Programming
// #Dynamic_Programming_I_Day_3 #Udemy_Dynamic_Programming
// #2022_10_24_Time_257_ms_(59.62%)_Space_34.3_MB_(80.77%)

class Solution {
    fun rob(nums: IntArray): Int {
        val n = nums.size
        if (n == 0) {
            return 0
        }
        if (n == 1) {
            return nums[0]
        }
        if (n == 2) {
            return Math.max(nums[0], nums[1])
        }
        if (n == 3) {
            return Math.max(nums[0], Math.max(nums[1], nums[2]))
        }
        var max = Int.MIN_VALUE
        val inc = IntArray(n)
        val exc = IntArray(n)
        inc[0] = nums[0]
        exc[0] = 0
        inc[1] = nums[0]
        exc[1] = nums[1]
        inc[2] = nums[2] + nums[0]
        exc[2] = nums[2]
        for (i in 3 until n - 1) {
            inc[i] = Math.max(inc[i - 2], inc[i - 3]) + nums[i]
            exc[i] = Math.max(exc[i - 2], exc[i - 3]) + nums[i]
        }
        inc[n - 1] = inc[n - 2]
        exc[n - 1] = Math.max(exc[n - 3], exc[n - 4]) + nums[n - 1]
        for (i in 0 until n) {
            max = Math.max(max, Math.max(inc[i], exc[i]))
        }
        return max
    }
}
