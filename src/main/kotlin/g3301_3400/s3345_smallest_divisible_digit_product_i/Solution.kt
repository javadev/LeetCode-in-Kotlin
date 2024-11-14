package g3301_3400.s3345_smallest_divisible_digit_product_i

// #Easy #Math #Enumeration #2024_11_14_Time_1_ms_(100.00%)_Space_33.7_MB_(100.00%)

class Solution {
    fun smallestNumber(n: Int, t: Int): Int {
        var num = -1
        var check = n
        while (num == -1) {
            val product = findProduct(check)
            if (product % t == 0) {
                num = check
            }
            check += 1
        }
        return num
    }

    private fun findProduct(check: Int): Int {
        var check = check
        var res = 1
        while (check > 0) {
            res *= check % 10
            check = check / 10
        }
        return res
    }
}
