package g0901_1000.s0910_smallest_range_ii

// #Medium #Array #Math #Sorting #Greedy #Programming_Skills_II_Day_13
// #2023_04_15_Time_234_ms_(100.00%)_Space_37.1_MB_(100.00%)

class Solution {
    fun smallestRangeII(nums: IntArray, k: Int): Int {
        nums.sort()
        val n = nums.size
        var ans = nums[n - 1] - nums[0]
        val min = nums[0] + k
        val max = nums[n - 1] - k
        for (i in 0 until n - 1) {
            val mx = max.coerceAtLeast(nums[i] + k)
            val mi = min.coerceAtMost(nums[i + 1] - k)
            ans = ans.coerceAtMost(mx - mi)
        }
        return ans
    }
}
