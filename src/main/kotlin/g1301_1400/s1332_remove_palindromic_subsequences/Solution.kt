package g1301_1400.s1332_remove_palindromic_subsequences

// #Easy #String #Two_Pointers #2023_06_06_Time_122_ms_(83.33%)_Space_33.4_MB_(100.00%)

class Solution {
    fun removePalindromeSub(s: String): Int {
        if (s.isEmpty()) {
            return 0
        }
        return if (s == StringBuilder(s).reverse().toString()) {
            1
        } else {
            2
        }
    }
}
