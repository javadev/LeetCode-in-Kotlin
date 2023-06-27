package g1301_1400.s1317_convert_integer_to_the_sum_of_two_no_zero_integers

// #Easy #Math #2023_06_05_Time_146_ms_(100.00%)_Space_33.8_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun getNoZeroIntegers(n: Int): IntArray {
        var left = 1
        var right = n - 1
        while (left <= right) {
            if (noZero(left) && noZero(right)) {
                return intArrayOf(left, right)
            } else {
                left++
                right--
            }
        }
        return intArrayOf()
    }

    private fun noZero(num: Int): Boolean {
        var num = num
        while (num != 0) {
            num /= if (num % 10 == 0) {
                return false
            } else {
                10
            }
        }
        return true
    }
}
