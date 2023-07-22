package g1501_1600.s1558_minimum_numbers_of_function_calls_to_make_target_array

// #Medium #Array #Greedy #2023_06_13_Time_347_ms_(50.00%)_Space_49.6_MB_(50.00%)

class Solution {
    fun minOperations(nums: IntArray): Int {
        var ops = 0
        for (bit in 0..31) {
            var nonzero = false
            for (i in nums.indices) {
                ops += nums[i] % 2
                nums[i] /= 2
                nonzero = nonzero or (nums[i] > 0)
            }
            if (nonzero) {
                ops++
            } else {
                break
            }
        }
        return ops
    }
}
