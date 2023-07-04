package g2501_2600.s2535_difference_between_element_sum_and_digit_sum_of_an_array

// #Easy #Array #Math #2023_07_04_Time_231_ms_(66.67%)_Space_37.7_MB_(88.89%)

@Suppress("NAME_SHADOWING")
class Solution {
    private fun getsum(n: Int): Int {
        var n = n
        var sum = 0
        while (n > 0) {
            val r = n % 10
            sum += r
            n = n / 10
        }
        return sum
    }

    fun differenceOfSum(nums: IntArray): Int {
        var eleSum = 0
        var digitSum = 0
        for (j in nums) {
            digitSum += if (j >= 10) {
                val sumC = getsum(j)
                sumC
            } else {
                j
            }
        }
        for (num in nums) {
            eleSum += num
        }
        val max = Math.max(eleSum, digitSum)
        val min = Math.min(eleSum, digitSum)
        return max - min
    }
}
