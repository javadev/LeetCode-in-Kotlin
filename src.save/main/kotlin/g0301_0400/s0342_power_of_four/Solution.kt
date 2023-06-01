package g0301_0400.s0342_power_of_four

// #Easy #Math #Bit_Manipulation #Recursion #2022_11_17_Time_150_ms_(92.11%)_Space_33.4_MB_(89.47%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun isPowerOfFour(n: Int): Boolean {
        var n = n
        while (n >= 4) {
            if (n % 4 != 0) {
                return false
            }
            n = n / 4
        }
        return n == 1
    }
}
