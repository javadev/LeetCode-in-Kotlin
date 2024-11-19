package g0901_1000.s0908_smallest_range_i

// #Easy #Array #Math #2023_04_15_Time_202_ms_(87.50%)_Space_37.2_MB_(75.00%)

class Solution {
    fun smallestRangeI(nums: IntArray, k: Int): Int {
        var min = Int.MAX_VALUE
        var max = Int.MIN_VALUE
        for (num in nums) {
            min = min.coerceAtMost(num)
            max = max.coerceAtLeast(num)
        }
        return if (min + k >= max - k) {
            0
        } else {
            max - k - (min + k)
        }
    }
}
