package g1101_1200.s1190_reverse_substrings_between_each_pair_of_parentheses

// #Medium #String #Stack #2023_05_25_Time_153_ms_(42.86%)_Space_35.7_MB_(57.14%)

class Solution {
    fun reverseParentheses(s: String): String {
        val n = s.length
        val sb = StringBuilder()
        var i = 0
        while (i < n) {
            if (s[i] == '(') {
                var l = 1
                var r = 0
                val idx = i
                while (l != r) {
                    i++
                    if (s[i] == '(') {
                        l++
                    } else if (s[i] == ')') {
                        r++
                    }
                }
                val reversed = reverseParentheses(s.substring(idx + 1, i))
                val temp = StringBuilder().append(reversed)
                sb.append(temp.reverse())
            } else {
                sb.append(s[i])
            }
            i++
        }
        return sb.toString()
    }
}
