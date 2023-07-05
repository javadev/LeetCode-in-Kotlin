package g2401_2500.s2434_using_a_robot_to_print_the_lexicographically_smallest_string

// #Medium #String #Hash_Table #Greedy #Stack
// #2023_07_05_Time_319_ms_(100.00%)_Space_40.4_MB_(100.00%)

class Solution {
    fun robotWithString(s: String): String {
        val n = s.length
        val c = s.toCharArray()
        val next = CharArray(n + 1)
        next[n] = ('z'.code + 1).toChar()
        for (i in n - 1 downTo 0) {
            next[i] = ('a'.code + (c[i].code - 'a'.code).coerceAtMost(next[i + 1].code - 'a'.code)).toChar()
        }
        val stack = CharArray(n)
        var j = 0
        var k = 0
        for (i in 0 until n) {
            if (c[i] == next[i]) {
                c[j++] = c[i]
                while (k > 0 && stack[k - 1] <= next[i + 1]) {
                    c[j++] = stack[--k]
                }
            } else {
                stack[k++] = c[i]
            }
        }
        while (k > 0) {
            c[j++] = stack[--k]
        }
        return String(c)
    }
}
