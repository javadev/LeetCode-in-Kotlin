package g1501_1600.s1544_make_the_string_great

// #Easy #String #Stack #2023_06_12_Time_164_ms_(92.16%)_Space_34.7_MB_(100.00%)

class Solution {
    fun makeGood(s: String): String {
        val stack = ArrayDeque<Char>()
        for (element in s) {
            if (stack.isEmpty()) {
                stack.add(element)
            } else {
                if (stack.last().lowercaseChar() == element.lowercaseChar()) {
                    if (Character.isLowerCase(stack.last()) && Character.isUpperCase(element)) {
                        stack.removeLast()
                    } else if (Character.isUpperCase(stack.last()) && Character.isLowerCase(element)) {
                        stack.removeLast()
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
            sb.append(stack.removeLast())
        }
        return sb.reverse().toString()
    }
}
