package g3301_3400.s3364_minimum_positive_sum_subarray

// #Easy #Array #Prefix_Sum #Sliding_Window #2024_11_24_Time_24_ms_(100.00%)_Space_38_MB_(100.00%)

class Solution {
    fun minimumSumSubarray(nums: List<Int>, l: Int, r: Int): Int {
        val size = nums.size
        var res = -1
        for (s in l..r) {
            for (i in 0..size - s) {
                var sum = 0
                for (j in i..<i + s) {
                    sum += nums[j]
                }
                if (sum > 0 && (res == -1 || res > sum)) {
                    res = sum
                }
            }
        }
        return res
    }
}
