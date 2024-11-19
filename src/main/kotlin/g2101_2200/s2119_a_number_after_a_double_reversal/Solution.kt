package g2101_2200.s2119_a_number_after_a_double_reversal

// #Easy #Math #2023_06_25_Time_127_ms_(89.47%)_Space_32.9_MB_(89.47%)

class Solution {
    fun isSameAfterReversals(num: Int): Boolean {
        return if (num == 0) {
            true
        } else {
            num % 10 != 0
        }
    }
}
