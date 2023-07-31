package g2701_2800.s2710_remove_trailing_zeros_from_a_string

// #Easy #String #2023_07_31_Time_191_ms_(93.02%)_Space_38.1_MB_(46.51%)

class Solution {
    fun removeTrailingZeros(num: String): String {
        return num.dropLastWhile { it == '0' }
    }
}
