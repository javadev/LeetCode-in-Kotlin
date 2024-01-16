package g2901_3000.s2918_minimum_equal_sum_of_two_arrays_after_replacing_zeros

// #Medium #Array #Greedy #2024_01_16_Time_598_ms_(100.00%)_Space_60.2_MB_(90.00%)

class Solution {
    fun minSum(nums1: IntArray, nums2: IntArray): Long {
        val sum1 = nums1.fold(0L) { sum, element -> sum + element }
        val zeroCount1 = nums1.count { it == 0 }
        val sum2 = nums2.fold(0L) { sum, element -> sum + element }
        val zeroCount2 = nums2.count { it == 0 }
        if (
            (zeroCount1 == 0 && sum1 < sum2 + zeroCount2) ||
            (zeroCount2 == 0 && sum2 < sum1 + zeroCount1)
        ) {
            return -1
        }
        return Math.max(sum1 + zeroCount1, sum2 + zeroCount2)
    }
}
