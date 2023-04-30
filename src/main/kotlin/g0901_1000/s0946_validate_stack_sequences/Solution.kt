package g0901_1000.s0946_validate_stack_sequences

// #Medium #Array #Stack #Simulation #2023_04_30_Time_180_ms_(74.91%)_Space_40.7_MB_(6.18%)

import java.util.Deque
import java.util.LinkedList

class Solution {
    fun validateStackSequences(pushed: IntArray, popped: IntArray): Boolean {
        val stack: Deque<Int> = LinkedList()
        var i = 0
        var j = 0
        val len = pushed.size
        while (i < len) {
            if (pushed[i] == popped[j]) {
                i++
                j++
            } else if (!stack.isEmpty() && stack.peek() == popped[j]) {
                stack.pop()
                j++
            } else {
                stack.push(pushed[i++])
            }
        }
        while (j < len) {
            if (!stack.isEmpty() && stack.peek() != popped[j++]) {
                return false
            } else {
                stack.pop()
            }
        }
        return true
    }
}
