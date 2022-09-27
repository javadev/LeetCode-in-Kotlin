package g0001_0100.s0020_valid_parentheses

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #String #Stack
// #Data_Structure_I_Day_9_Stack_Queue #Udemy_Strings
// #2022_03_29_Time_196_ms_(71.08%)_Space_34.7_MB_(40.99%)

import java.util.Stack

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
