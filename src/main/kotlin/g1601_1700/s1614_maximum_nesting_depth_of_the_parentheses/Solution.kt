package g1601_1700.s1614_maximum_nesting_depth_of_the_parentheses

// #Easy #String #Stack #2023_06_15_Time_130_ms_(81.25%)_Space_33.6_MB_(81.25%)

import java.util.Deque
import java.util.LinkedList

class Solution {
    fun maxDepth(s: String): Int {
        val stack: Deque<Char> = LinkedList()
        var maxDepth = 0
        for (c in s.toCharArray()) {
            if (c == '(') {
                stack.push(c)
            } else if (c == ')') {
                maxDepth = maxDepth.coerceAtLeast(stack.size)
                stack.pop()
            }
        }
        return maxDepth
    }
}
