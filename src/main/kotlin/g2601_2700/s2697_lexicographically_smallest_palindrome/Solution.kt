package g2601_2700.s2697_lexicographically_smallest_palindrome

// #Easy #String #Two_Pointers #2023_07_29_Time_267_ms_(100.00%)_Space_37.7_MB_(77.78%)

class Solution {
    fun makeSmallestPalindrome(s: String): String {
        var l = 0
        var r = s.lastIndex
        val res = s.toCharArray()
        while (l <= r) {
            if (s[l] < s[r]) {
                res[r] = s[l]
            } else {
                res[l] = s[r]
            }
            l++
            r--
        }
        return String(res)
    }
}
