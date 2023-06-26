package g2101_2200.s2177_find_three_consecutive_integers_that_sum_to_a_given_number

// #Medium #Math #Simulation #2023_06_26_Time_160_ms_(100.00%)_Space_34.1_MB_(100.00%)

class Solution {
    fun sumOfThree(num: Long): LongArray {
        return if (num % 3 == 0L) {
            longArrayOf(num / 3 - 1, num / 3, num / 3 + 1)
        } else LongArray(0)
    }
}
