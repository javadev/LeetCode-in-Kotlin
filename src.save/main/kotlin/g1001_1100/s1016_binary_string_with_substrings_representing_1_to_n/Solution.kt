package g1001_1100.s1016_binary_string_with_substrings_representing_1_to_n

// #Medium #String #2023_05_17_Time_134_ms_(75.00%)_Space_35.9_MB_(75.00%)

class Solution {
    fun queryString(s: String, n: Int): Boolean {
        for (i in 1..n) {
            val str = Integer.toBinaryString(i)
            if (!s.contains(str)) {
                return false
            }
        }
        return true
    }
}
