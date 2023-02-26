package g0601_0700.s0680_valid_palindrome_ii

// #Easy #String #Greedy #Two_Pointers #2023_02_16_Time_296_ms_(79.17%)_Space_36.7_MB_(75.00%)

class Solution {
    fun validPalindrome(s: String): Boolean {
        var l = 0
        var r = s.length - 1
        while (l < r) {
            if (s[l] != s[r]) {
                return isPalindrome(s.substring(l + 1, r + 1)) || isPalindrome(s.substring(l, r))
            }
            l++
            r--
        }
        return true
    }

    private fun isPalindrome(s: String): Boolean {
        var l = 0
        var r = s.length - 1
        while (l < r) {
            if (s[l] != s[r]) {
                return false
            }
            l++
            r--
        }
        return true
    }
}
