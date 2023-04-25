package g0801_0900.s0856_score_of_parentheses

// #Medium #String #Stack #2023_03_31_Time_129_ms_(84.62%)_Space_34_MB_(46.15%)

import java.util.Deque
import java.util.LinkedList

class Solution {
    fun scoreOfParentheses(s: String): Int {
        val stack: Deque<Int> = LinkedList()
        for (element in s) {
            if (element == '(') {
                stack.push(-1)
            } else {
                var curr = 0
                while (stack.peek() != -1) {
                    curr += stack.pop()
                }
                stack.pop()
                stack.push(if (curr == 0) 1 else curr * 2)
            }
        }
        var score = 0
        while (!stack.isEmpty()) {
            score += stack.pop()
        }
        return score
    }
}
