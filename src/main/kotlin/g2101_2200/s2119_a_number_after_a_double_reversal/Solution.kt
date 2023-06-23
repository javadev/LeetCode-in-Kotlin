package g2101_2200.s2119_a_number_after_a_double_reversal

// #Easy #Math
class Solution {
    fun isSameAfterReversals(num: Int): Boolean {
        return if (num == 0) {
            true
        } else num % 10 != 0
    }
}
