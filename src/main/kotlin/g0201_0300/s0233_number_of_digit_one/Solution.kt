package g0201_0300.s0233_number_of_digit_one

// #Hard #Dynamic_Programming #Math #Recursion
// #2022_10_26_Time_129_ms_(100.00%)_Space_32.6_MB_(100.00%)

class Solution {
    fun countDigitOne(n: Int): Int {
        var ans = 0
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
            cum += rem * curr10
            curr10 *= 10
        }
        return ans
    }
}
