package g0201_0300.s0233_number_of_digit_one

// #Hard #Dynamic_Programming #Math #Recursion
// #2022_07_04_Time_0_ms_(100.00%)_Space_41.2_MB_(25.50%)
class Solution {
    fun countDigitOne(n: Int): Int {
        var ans = 0
        // count total number of 1s appearing in every digit, starting from the last digit
        var k = n
        var cum = 0
        var curr10 = 1
        while (k > 0) {
            val rem = k % 10
            val q = k / 10
            ans += if (rem == 0) {
                q * curr10
            } else if (rem == 1) {
                q * curr10 + cum + 1
            } else {
                (q + 1) * curr10
            }
            k = q
            // if loop is at 3rd last digit and n = 54321, cum is now = 321
            cum += rem * curr10
            curr10 *= 10
        }
        return ans
    }
}
