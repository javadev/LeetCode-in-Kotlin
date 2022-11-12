package g0301_0400.s0326_power_of_three

// #Easy #Top_Interview_Questions #Math #Recursion
// #2022_11_12_Time_413_ms_(76.12%)_Space_40.4_MB_(47.76%)

class Solution {
    fun isPowerOfThree(n: Int): Boolean {
        if (n == 1 || n == 3) {
            return true
        }
        if (n == 0 || n % 3 != 0) {
            return false
        }
        return isPowerOfThree(n / 3)
    }
}
