package g3901_4000.s3908_valid_digit_number

// #Easy #Math #Mid_Level #Biweekly_Contest_181
// #2026_09_17_Time_1_ms_(98.66%)_Space_42.77_MB_(28.00%)

class Solution {
    fun validDigit(n: Int, x: Int): Boolean {
        var n = n
        var value = false
        while (n > 0) {
            val rem = n % 10
            n /= 10
            if (rem == x) {
                value = true
            }
            if (n == 0 && rem == x) {
                value = false
            }
        }
        return value
    }
}
