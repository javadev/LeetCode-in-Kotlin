package g1501_1600.s1544_make_the_string_great

import java.util.Stack

// #Easy #String #Stack
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
        while (!stack.isEmpty()) {
            sb.append(stack.pop())
        }
        return sb.reverse().toString()
    }
}
