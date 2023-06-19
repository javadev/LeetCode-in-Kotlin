package g1901_2000.s1911_maximum_alternating_subsequence_sum

// #Medium #Array #Dynamic_Programming
class Solution {
    fun maxAlternatingSum(nums: IntArray): Long {
        val n = nums.size
        var even = nums[0].toLong()
        var odd: Long = 0
        for (i in 1 until n) {
            even = Math.max(even, Math.max(odd + nums[i], nums[i].toLong()))
            odd = Math.max(odd, Math.max(even - nums[i], 0))
        }
        return Math.max(even, odd)
    }
}
