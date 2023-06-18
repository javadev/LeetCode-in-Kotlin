package g1701_1800.s1780_check_if_number_is_a_sum_of_powers_of_three

// #Medium #Math #2023_06_18_Time_133_ms_(66.67%)_Space_32.9_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun checkPowersOfThree(n: Int): Boolean {
        var n = n
        while (n != 0) {
            val rem = n % 3
            n /= 3
            if (rem == 2 || n == 2) {
                return false
            }
        }
        return true
    }
}
