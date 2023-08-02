package g2101_2200.s2108_find_first_palindromic_string_in_the_array

// #Easy #Array #String #Two_Pointers #2023_06_25_Time_242_ms_(100.00%)_Space_37.8_MB_(90.00%)

class Solution {
    fun firstPalindrome(words: Array<String>): String {
        for (word in words) {
            if (isPalindrome(word)) {
                return word
            }
        }
        return ""
    }

    companion object {
        fun isPalindrome(s: String): Boolean {
            val len = s.length
            var i = 0
            var j = len - 1
            while (i <= len / 2 && j >= len / 2) {
                if (s[i] != s[j]) {
                    return false
                }
                i++
                j--
            }
            return true
        }
    }
}
