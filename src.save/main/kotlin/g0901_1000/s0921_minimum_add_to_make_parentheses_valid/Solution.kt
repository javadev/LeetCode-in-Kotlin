package g0901_1000.s0921_minimum_add_to_make_parentheses_valid

// #Medium #String #Greedy #Stack #2023_04_17_Time_131_ms_(92.59%)_Space_34.3_MB_(14.81%)

import java.util.Deque
import java.util.LinkedList

class Solution {
    fun minAddToMakeValid(s: String): Int {
        val stack: Deque<Char> = LinkedList()
        for (c in s.toCharArray()) {
            if (c == ')') {
                if (stack.isNotEmpty() && stack.peek() == '(') {
                    stack.pop()
                } else {
                    stack.push(c)
                }
            } else {
                stack.push(c)
            }
        }
        return stack.size
    }
}
