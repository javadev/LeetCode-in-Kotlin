package g1001_1100.s1003_check_if_word_is_valid_after_substitutions

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
