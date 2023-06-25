package g2101_2200.s2160_minimum_sum_of_four_digit_number_after_splitting_digits

// #Easy #Math #Sorting #Greedy
@Suppress("NAME_SHADOWING")
class Solution {
    fun minimumSum(num: Int): Int {
        var num = num
        val digit = IntArray(4)
        var cur = 0
        while (num > 0) {
            digit[cur++] = num % 10
            num /= 10
        }
        digit.sort()
        val num1 = digit[0] * 10 + digit[2]
        val num2 = digit[1] * 10 + digit[3]
        return num1 + num2
    }
}
