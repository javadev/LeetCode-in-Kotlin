package g3601_3700.s3622_check_divisibility_by_digit_sum_and_product

// #Easy #2025_07_20_Time_0_ms_(100.00%)_Space_40.53_MB_(_%)

class Solution {
    fun checkDivisibility(n: Int): Boolean {
        var x = n
        var sum = 0
        var mul = 1
        while (x != 0) {
            sum += x % 10
            mul *= x % 10
            x = x / 10
        }
        return n % (sum + mul) == 0
    }
}
