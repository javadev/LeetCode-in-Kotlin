package g1801_1900.s1829_maximum_xor_for_each_query

// #Medium #Array #Bit_Manipulation #Prefix_Sum
// #2023_06_21_Time_680_ms_(100.00%)_Space_52.8_MB_(100.00%)

class Solution {
    fun getMaximumXor(nums: IntArray, maximumBit: Int): IntArray {
        val result = IntArray(nums.size)
        var `val` = nums[0]
        val target = (1 shl maximumBit) - 1
        for (i in 1 until nums.size) {
            `val` = `val` xor nums[i]
        }
        for (i in result.indices) {
            result[i] = target xor `val`
            `val` = `val` xor nums[nums.size - i - 1]
        }
        return result
    }
}
