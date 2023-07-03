package g2401_2500.s2411_smallest_subarrays_with_maximum_bitwise_or

// #Medium #Array #Binary_Search #Bit_Manipulation #Sliding_Window
// #2023_07_03_Time_562_ms_(100.00%)_Space_52.8_MB_(100.00%)

class Solution {
    fun smallestSubarrays(nums: IntArray): IntArray {
        val res = IntArray(nums.size)
        val bitPosition = IntArray(30)
        for (i in nums.indices.reversed()) {
            res[i] = 1
            for (j in 0..29) {
                if (nums[i] and (1 shl j) > 0) {
                    bitPosition[j] = i
                }
                res[i] = res[i].coerceAtLeast(bitPosition[j] - i + 1)
            }
        }
        return res
    }
}
