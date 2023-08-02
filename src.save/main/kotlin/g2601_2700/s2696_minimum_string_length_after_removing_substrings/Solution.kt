package g2601_2700.s2696_minimum_string_length_after_removing_substrings

// #Easy #String #Stack #Simulation #2023_07_29_Time_185_ms_(100.00%)_Space_37_MB_(76.00%)

class Solution {
    fun minLength(s: String): Int {
        val stack = ArrayDeque<Char>()
        s.forEach { c ->
            if (stack.isNotEmpty() &&
                (
                    (c == 'B' && stack.last() == 'A') ||
                        (c == 'D' && stack.last() == 'C')
                    )
            ) {
                stack.removeLast()
            } else {
                stack.addLast(c)
            }
        }
        return stack.size
    }
}
