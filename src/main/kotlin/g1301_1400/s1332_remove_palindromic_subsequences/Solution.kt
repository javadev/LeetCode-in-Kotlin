package g1301_1400.s1332_remove_palindromic_subsequences

// #Easy #String #Two_Pointers
class Solution {
    fun removePalindromeSub(s: String): Int {
        if (s.isEmpty()) {
            return 0
        }
        return if (s == StringBuilder(s).reverse().toString()) {
            1
        } else 2
    }
}
