package g0001_0100.s0032_longest_valid_parentheses

// #Hard #Top_100_Liked_Questions #String #Dynamic_Programming #Stack #Big_O_Time_O(n)_Space_O(1)
// #2023_07_05_Time_161_ms_(82.14%)_Space_36.3_MB_(91.07%)

class Solution {
    fun longestValidParentheses(s: String): Int {
        var max = 0
        var left = 0
        var right = 0
        val n = s.length
        var ch: Char
        for (i in 0 until n) {
            ch = s[i]
            if (ch == '(') {
                left++
            } else {
                right++
            }
            if (right > left) {
                left = 0
                right = 0
            }
            if (left == right) {
                max = Math.max(max, left + right)
            }
        }
        left = 0
        right = 0
        for (i in n - 1 downTo 0) {
            ch = s[i]
            if (ch == '(') {
                left++
            } else {
                right++
            }
            if (left > right) {
                left = 0
                right = 0
            }
            if (left == right) {
                max = Math.max(max, left + right)
            }
        }
        return max
    }
}
