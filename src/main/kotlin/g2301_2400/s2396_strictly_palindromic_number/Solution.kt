package g2301_2400.s2396_strictly_palindromic_number

// #Medium #Math #Two_Pointers #Brainteaser
class Solution {
    fun isStrictlyPalindromic(n: Int): Boolean {
        for (i in 2..n - 2) {
            val num = Integer.toString(i)
            val s = baseConversion(num, 10, i)
            if (!checkPalindrome(s)) {
                return false
            }
        }
        return true
    }

    private fun baseConversion(number: String, sBase: Int, dBase: Int): String {
        // Parse the number with source radix
        // and return in specified radix(base)
        return Integer.toString(number.toInt(sBase), dBase)
    }

    private fun checkPalindrome(s: String): Boolean {
        var start = 0
        var end = s.length - 1
        while (start <= end) {
            if (s[start] != s[end]) {
                return false
            }
            start++
            end--
        }
        return true
    }
}
