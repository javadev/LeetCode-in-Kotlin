package g1001_1100.s1003_check_if_word_is_valid_after_substitutions

// #Medium #String #Stack #2023_05_14_Time_216_ms_(100.00%)_Space_46.7_MB_(50.00%)

import java.util.Deque
import java.util.LinkedList

class Solution {
    fun isValid(s: String): Boolean {
        val stack: Deque<Char> = LinkedList()
        for (c in s.toCharArray()) {
            if (c == 'c') {
                if (stack.isEmpty() || stack.pop() != 'b') {
                    return false
                }
                if (stack.isEmpty() || stack.pop() != 'a') {
                    return false
                }
            } else {
                stack.push(c)
            }
        }
        return stack.isEmpty()
    }
}
