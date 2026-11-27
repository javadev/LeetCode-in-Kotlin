package g4001_4100.s4030_check_ascii_palindromic

// #Easy #String #Two_Pointers #Bit_Manipulation #Mid_Level #Weekly_Contest_516
// #2026_11_25_Time_1_ms_(99.80%)_Space_42.93_MB_(99.02%)

class Solution {
    fun isPalindromic(s: String): Boolean {
        val n = s.length
        for (i in 0..n / 2) {
            val lptr = s.get(i).code
            val rptr = s.get(n - i - 1).code
            for (j in 0..7) {
                val left = (lptr shr j) and 1
                val right = (rptr shr (7 - j)) and 1
                if (left != right) {
                    return false
                }
            }
        }
        return true
    }
}
