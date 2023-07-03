package g0001_0100.s0020_valid_parentheses

// #Easy #Top_100_Liked_Questions #Top_Interview_Questions #String #Stack
// #Data_Structure_I_Day_9_Stack_Queue #Udemy_Strings
// #2023_07_03_Time_137_ms_(88.76%)_Space_33.7_MB_(90.45%)

import java.util.Stack

class Solution {
    fun isValid(s: String): Boolean {
        val stack = Stack<Char>()
        for (element in s) {
            val c = element
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c)
            } else if (c == ')' && stack.isNotEmpty() && stack.peek() == '(') {
                stack.pop()
            } else if (c == '}' && stack.isNotEmpty() && stack.peek() == '{') {
                stack.pop()
            } else if (c == ']' && stack.isNotEmpty() && stack.peek() == '[') {
                stack.pop()
            } else {
                return false
            }
        }
        return stack.isEmpty()
    }
}
