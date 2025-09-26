package g3601_3700.s3674_minimum_operations_to_equalize_array

// #Easy #Array #Bit_Manipulation #Brainteaser #Weekly_Contest_466
// #2025_09_07_Time_1_ms_(100.00%)_Space_43.60_MB_(100.00%)

class Solution {
    fun minOperations(nums: IntArray): Int {
        for (num in nums) {
            if (num != nums[0]) {
                return 1
            }
        }
        return 0
    }
}
