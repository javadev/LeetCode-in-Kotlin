package g2901_3000.s2980_check_if_bitwise_or_has_trailing_zeros

// #Easy #Array #Bit_Manipulation #2024_01_19_Time_183_ms_(89.58%)_Space_37.6_MB_(64.58%)

class Solution {
    fun hasTrailingZeros(nums: IntArray): Boolean {
        var hasTrailingZero = 0
        for (num in nums) {
            if ((num and 1) == 0) {
                hasTrailingZero++
                if (hasTrailingZero > 1) {
                    return true
                }
            }
        }
        return false
    }
}
