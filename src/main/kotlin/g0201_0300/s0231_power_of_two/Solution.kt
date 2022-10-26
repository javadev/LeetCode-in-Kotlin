package g0201_0300.s0231_power_of_two

// #Easy #Math #Bit_Manipulation #Recursion #Algorithm_I_Day_13_Bit_Manipulation
// #2022_10_26_Time_161_ms_(86.81%)_Space_33.6_MB_(88.19%)

class Solution {
    fun isPowerOfTwo(n: Int): Boolean {
        return n > 0 && Integer.bitCount(n) == 1
    }
}
