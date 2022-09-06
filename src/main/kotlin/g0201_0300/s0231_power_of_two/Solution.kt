package g0201_0300.s0231_power_of_two

// #Easy #Math #Bit_Manipulation #Recursion #Algorithm_I_Day_13_Bit_Manipulation
// #2022_07_04_Time_1_ms_(100.00%)_Space_39.6_MB_(90.19%)
class Solution {
    fun isPowerOfTwo(n: Int): Boolean {
        var n = n
        if (n <= 0) {
            return false
        }
        while (true) {
            if (n == 1) {
                return true
            }
            if (n % 2 == 1) {
                return false
            }
            n /= 2
        }
    }
}
