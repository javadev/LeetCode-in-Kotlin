package g2301_2400.s2310_sum_of_numbers_with_units_digit_k

// #Medium #Math #2023_06_29_Time_133_ms_(100.00%)_Space_32.8_MB_(100.00%)

class Solution {
    fun minimumNumbers(nums: Int, k: Int): Int {
        // Base Case Check
        if (nums == 0) {
            return 0
        }
        val x = nums % 10
        for (i in 1..10) {
            // check if the unit digits are equal for any case and if n>k*i
            if (k * i % 10 == x && nums >= k * i) {
                return i
            }
        }
        // in case nothing matches
        return -1
    }
}
