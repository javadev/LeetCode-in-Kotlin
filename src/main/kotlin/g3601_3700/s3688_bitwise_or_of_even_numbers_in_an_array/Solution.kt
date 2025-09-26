package g3601_3700.s3688_bitwise_or_of_even_numbers_in_an_array

// #Easy #Array #Bit_Manipulation #Simulation #Weekly_Contest_468
// #2025_09_26_Time_1_ms_(100.00%)_Space_43.18_MB_(89.80%)

class Solution {
    fun evenNumberBitwiseORs(nums: IntArray): Int {
        var count = 0
        for (num in nums) {
            if (num % 2 == 0) {
                count = count or num
            }
        }
        return count
    }
}
