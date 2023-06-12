package g1501_1600.s1544_make_the_string_great

// #Easy #String #Stack #2023_06_12_Time_164_ms_(92.16%)_Space_34.7_MB_(100.00%)

import java.util.Stack

class Solution {
    fun makeGood(s: String): String {
        val stack = Stack<Char>()
        for (element in s) {
            if (stack.isEmpty()) {
                stack.add(element)
            } else {
                if (stack.peek().lowercaseChar() == element.lowercaseChar()) {
                    if (Character.isLowerCase(stack.peek()) && Character.isUpperCase(element)) {
                        stack.pop()
                    } else if (Character.isUpperCase(stack.peek()) && Character.isLowerCase(element)) {
                        stack.pop()
                    } else {
                        stack.add(element)
                    }
                } else {
                    stack.add(element)
                }
            }
        }
        val sb = StringBuilder()
        while (stack.isNotEmpty()) {
            sb.append(stack.pop())
        }
        return sb.reverse().toString()
    }
}
