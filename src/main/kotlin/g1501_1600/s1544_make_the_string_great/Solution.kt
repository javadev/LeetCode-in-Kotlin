package g1501_1600.s1544_make_the_string_great

import java.util.*

// #Easy #String #Stack
class Solution {
    fun makeGood(s: String): String {
        val stack = Stack<Char>()
        for (i in 0 until s.length) {
            val c = s[i]
            if (stack.isEmpty()) {
                stack.add(c)
            } else {
                if (stack.peek().lowercaseChar() == c.lowercaseChar()) {
                    if (Character.isLowerCase(stack.peek()) && Character.isUpperCase(c)) {
                        stack.pop()
                    } else if (Character.isUpperCase(stack.peek()) && Character.isLowerCase(c)) {
                        stack.pop()
                    } else {
                        stack.add(c)
                    }
                } else {
                    stack.add(c)
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
