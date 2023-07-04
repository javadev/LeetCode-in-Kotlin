package g2501_2600.s2520_count_the_digits_that_divide_a_number

// #Easy #Math
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
