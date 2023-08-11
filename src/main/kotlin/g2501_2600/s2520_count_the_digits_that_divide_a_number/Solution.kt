package g2501_2600.s2520_count_the_digits_that_divide_a_number

// #Easy #Math #2023_07_04_Time_121_ms_(80.95%)_Space_32.9_MB_(80.95%)

class Solution {
    fun countDigits(num: Int): Int {
        var a = num
        var count = 0
        while (a > 0) {
            val r = a % 10
            if (r != 0 && num % r == 0) {
                count++
            }
            a /= 10
        }
        return count
    }
}
