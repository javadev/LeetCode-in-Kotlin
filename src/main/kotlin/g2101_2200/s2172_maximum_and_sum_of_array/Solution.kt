package g2101_2200.s2172_maximum_and_sum_of_array

// #Hard #Array #Dynamic_Programming #Bit_Manipulation #Bitmask
// #2023_06_26_Time_165_ms_(100.00%)_Space_34.8_MB_(100.00%)

class Solution {
    fun maximumANDSum(nums: IntArray, numSlots: Int): Int {
        val mask = Math.pow(3.0, numSlots.toDouble()).toInt() - 1
        val memo = IntArray(mask + 1)
        return dp(nums.size - 1, mask, numSlots, memo, nums)
    }

    private fun dp(i: Int, mask: Int, numSlots: Int, memo: IntArray, ints: IntArray): Int {
        if (memo[mask] > 0) {
            return memo[mask]
        }
        if (i < 0) {
            return 0
        }
        var slot = 1
        var bit = 1
        while (slot <= numSlots) {
            if (mask / bit % 3 > 0) {
                memo[mask] = Math.max(
                    memo[mask],
                    (ints[i] and slot) + dp(i - 1, mask - bit, numSlots, memo, ints),
                )
            }
            ++slot
            bit *= 3
        }
        return memo[mask]
    }
}
