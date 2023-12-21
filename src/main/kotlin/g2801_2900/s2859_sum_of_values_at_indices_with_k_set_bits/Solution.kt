package g2801_2900.s2859_sum_of_values_at_indices_with_k_set_bits

// #Easy #Array #Bit_Manipulation #2023_12_21_Time_177_ms_(100.00%)_Space_37.9_MB_(62.50%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun sumIndicesWithKSetBits(nums: List<Int>, k: Int): Int {
        var sum = 0
        for (i in nums.indices) {
            if (countSetBits(i) == k) {
                sum += nums[i]
            }
        }
        return sum
    }

    companion object {
        fun countSetBits(num: Int): Int {
            var num = num
            var count = 0
            while (num > 0) {
                num = num and (num - 1)
                count++
            }
            return count
        }
    }
}
