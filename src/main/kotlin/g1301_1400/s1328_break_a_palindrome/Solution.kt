package g1301_1400.s1328_break_a_palindrome

// #Medium #String #Greedy #2023_06_06_Time_137_ms_(81.82%)_Space_33.4_MB_(100.00%)

class Solution {
    fun breakPalindrome(palindrome: String): String {
        if (palindrome.length <= 1) {
            return ""
        }
        val sb = StringBuilder()
        for (i in 0 until palindrome.length) {
            val ch = palindrome[i]
            if (ch != 'a' && i != palindrome.length - 1 - i) {
                sb.append('a')
                sb.append(palindrome.substring(i + 1))
                return sb.toString()
            } else {
                sb.append(ch)
            }
        }
        sb.deleteCharAt(palindrome.length - 1)
        sb.append('b')
        return sb.toString()
    }
}
