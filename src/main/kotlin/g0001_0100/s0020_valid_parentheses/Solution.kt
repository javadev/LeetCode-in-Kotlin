package g0001_0100.s0020_valid_parentheses

import java.util.Stack

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #String #Stack
// #2022_02_17_Time_3_ms_(53.65%)_Space_42.1_MB_(17.58%)

class Solution {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        for (element in s) {
            val c = element
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c)
            } else if (c == ')' && !stack.isEmpty() && stack.peek() == '(') {
                stack.pop()
            } else if (c == '}' && !stack.isEmpty() && stack.peek() == '{') {
                stack.pop()
            } else if (c == ']' && !stack.isEmpty() && stack.peek() == '[') {
                stack.pop()
            } else {
                return false
            }
        }
        return stack.isEmpty()
    }
}
