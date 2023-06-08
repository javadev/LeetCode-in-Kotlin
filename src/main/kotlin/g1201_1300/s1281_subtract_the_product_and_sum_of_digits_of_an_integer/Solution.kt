package g1201_1300.s1281_subtract_the_product_and_sum_of_digits_of_an_integer

// #Easy #Math #Programming_Skills_I_Day_2_Operator
// #2023_06_08_Time_128_ms_(61.82%)_Space_33_MB_(80.00%)

class Solution {
    fun subtractProductAndSum(n: Int): Int {
        var n = n
        var product = 1
        var sum = 0
        while (n != 0) {
            val digit = n % 10
            product = product * digit
            sum = sum + digit
            n /= 10
        }
        return product - sum
    }
}
