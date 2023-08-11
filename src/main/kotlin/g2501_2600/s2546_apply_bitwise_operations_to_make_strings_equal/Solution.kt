package g2501_2600.s2546_apply_bitwise_operations_to_make_strings_equal

// #Medium #String #Bit_Manipulation #2023_07_06_Time_246_ms_(100.00%)_Space_38.1_MB_(100.00%)

class Solution {
    fun makeStringsEqual(s: String, target: String): Boolean {
        val strLen = s.length
        var ans1 = false
        var ans2 = false
        for (i in 0 until strLen) {
            if (s[i] == '1') {
                ans1 = true
            }
            if (target[i] == '1') {
                ans2 = true
            }
        }
        return ans1 == ans2
    }
}
