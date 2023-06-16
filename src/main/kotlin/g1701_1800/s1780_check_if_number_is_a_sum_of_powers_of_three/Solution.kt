package g1701_1800.s1780_check_if_number_is_a_sum_of_powers_of_three

// #Medium #Math
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
