package g0801_0900.s0805_split_array_with_same_average

// #Hard #Array #Dynamic_Programming #Math #Bit_Manipulation #Bitmask
// #2023_03_16_Time_142_ms_(100.00%)_Space_33.7_MB_(100.00%)

import java.util.Arrays

@Suppress("NAME_SHADOWING")
class Solution {
    private lateinit var nums: IntArray
    private lateinit var sums: IntArray
    fun splitArraySameAverage(nums: IntArray): Boolean {
        val len = nums.size
        if (len == 1) {
            return false
        }
        Arrays.sort(nums)
        sums = IntArray(len + 1)
        for (i in 0 until len) {
            sums[i + 1] = sums[i] + nums[i]
        }
        val sum = sums[len]
        this.nums = nums
        var i = 1
        val stop = len / 2
        while (i <= stop) {
            if (sum * i % len == 0 && findSum(i, len, sum * i / len)) {
                return true
            }
            i++
        }
        return false
    }

    private fun findSum(k: Int, pos: Int, target: Int): Boolean {
        var pos = pos
        if (k == 1) {
            while (true) {
                if (nums[--pos] <= target) {
                    break
                }
            }
            return nums[pos] == target
        }
        var i = pos
        while (sums[i] - sums[i-- - k] >= target) {
            if (sums[k - 1] <= target - nums[i] && findSum(k - 1, i, target - nums[i])) {
                return true
            }
        }
        return false
    }
}
