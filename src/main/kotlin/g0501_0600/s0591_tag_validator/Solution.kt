package g0501_0600.s0591_tag_validator

// #Hard #String #Stack #2023_01_31_Time_177_ms_(100.00%)_Space_35.4_MB_(100.00%)

import java.util.ArrayDeque
import java.util.Deque

class Solution {
    fun isValid(code: String): Boolean {
        val stack: Deque<String> = ArrayDeque()
        var i = 0
        while (i < code.length) {
            if (i > 0 && stack.isEmpty()) {
                return false
            }
            if (code.startsWith("<![CDATA[", i)) {
                // "<![CDATA[" length is 9
                val j = i + 9
                i = code.indexOf("]]>", j)
                if (i < 0) {
                    return false
                }
                // "]]>" length is 3
                i += 3
            } else if (code.startsWith("</", i)) {
                val j = i + 2
                i = code.indexOf(">", j)
                if (i < 0 || i == j || i - j > 9) {
                    return false
                }
                for (k in j until i) {
                    if (!Character.isUpperCase(code[k])) {
                        return false
                    }
                }
                val s = code.substring(j, i++)
                if (stack.isEmpty() || stack.pop() != s) {
                    return false
                }
            } else if (code.startsWith("<", i)) {
                val j = i + 1
                i = code.indexOf(">", j)
                if (i < 0 || i == j || i - j > 9) {
                    return false
                }
                for (k in j until i) {
                    if (!Character.isUpperCase(code[k])) {
                        return false
                    }
                }
                val s = code.substring(j, i++)
                stack.push(s)
            } else {
                i++
            }
        }
        return stack.isEmpty()
    }
}
