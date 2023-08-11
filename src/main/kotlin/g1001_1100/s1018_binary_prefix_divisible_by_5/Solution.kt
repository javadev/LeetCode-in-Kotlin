package g1001_1100.s1018_binary_prefix_divisible_by_5

// #Easy #Array #2023_05_21_Time_297_ms_(100.00%)_Space_50_MB_(100.00%)

class Solution {
    fun prefixesDivBy5(nums: IntArray): List<Boolean> {
        val result: MutableList<Boolean> = ArrayList(nums.size)
        var remainder = 0
        for (j in nums) {
            remainder = (j + (remainder shl 1)) % 5
            result.add(remainder == 0)
        }
        return result
    }
}
