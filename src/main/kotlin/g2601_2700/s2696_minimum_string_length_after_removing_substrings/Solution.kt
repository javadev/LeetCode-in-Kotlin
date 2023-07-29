package g2601_2700.s2696_minimum_string_length_after_removing_substrings

// #Easy #String #Stack #Simulation #2023_07_29_Time_185_ms_(100.00%)_Space_37_MB_(76.00%)

import java.util.Stack

class Solution {
    fun minLength(s: String): Int {
        val stack = Stack<Char>()
        s.forEach { c ->
            if (stack.isNotEmpty() &&
                (
                    (c == 'B' && stack.peek() == 'A') ||
                        (c == 'D' && stack.peek() == 'C')
                    )
            ) {
                stack.pop()
            } else {
                stack.push(c)
            }
        }
        return stack.size
    }
}
