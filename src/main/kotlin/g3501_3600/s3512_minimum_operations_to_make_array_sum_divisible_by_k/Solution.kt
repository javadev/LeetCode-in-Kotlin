package g3501_3600.s3512_minimum_operations_to_make_array_sum_divisible_by_k

// #Easy #2025_04_13_Time_1_ms_(100.00%)_Space_50.22_MB_(100.00%)

class Solution {
    fun minOperations(nums: IntArray, k: Int): Int {
        var sum = 0
        for (num in nums) {
            sum += num
        }
        return sum % k
    }
}
