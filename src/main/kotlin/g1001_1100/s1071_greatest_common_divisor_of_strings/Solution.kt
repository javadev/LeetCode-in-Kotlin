package g1001_1100.s1071_greatest_common_divisor_of_strings

// #Easy #String #Math #2023_05_31_Time_150_ms_(80.68%)_Space_36.2_MB_(84.09%)

class Solution {
    fun gcdOfStrings(str1: String?, str2: String?): String {
        if (str1 == null || str2 == null) {
            return ""
        }
        if (str1 == str2) {
            return str1
        }
        val m = str1.length
        val n = str2.length
        if (m > n && str1.substring(0, n) == str2) {
            return gcdOfStrings(str1.substring(n), str2)
        }
        return if (n > m && str2.substring(0, m) == str1) {
            gcdOfStrings(str2.substring(m), str1)
        } else ""
    }
}
