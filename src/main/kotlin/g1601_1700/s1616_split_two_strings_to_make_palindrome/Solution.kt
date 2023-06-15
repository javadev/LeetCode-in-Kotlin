package g1601_1700.s1616_split_two_strings_to_make_palindrome

// #Medium #String #Greedy #Two_Pointers #2023_06_15_Time_277_ms_(100.00%)_Space_39.1_MB_(100.00%)

@Suppress("NAME_SHADOWING")
class Solution {
    fun checkPalindromeFormation(a: String, b: String): Boolean {
        return check(a, b) || check(b, a)
    }

    private fun check(a: String, b: String): Boolean {
        var i = 0
        var j = b.length - 1
        while (j > i && a[i] == b[j]) {
            ++i
            --j
        }
        return isPalindrome(a, i, j) || isPalindrome(b, i, j)
    }

    private fun isPalindrome(s: String, i: Int, j: Int): Boolean {
        var i = i
        var j = j
        while (j > i && s[i] == s[j]) {
            ++i
            --j
        }
        return i >= j
    }
}
