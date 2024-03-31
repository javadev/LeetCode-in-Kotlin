package g1001_1100.s1081_smallest_subsequence_of_distinct_characters

// #Medium #String #Greedy #Stack #Monotonic_Stack
// #2023_06_02_Time_146_ms_(100.00%)_Space_34_MB_(100.00%)

import java.util.Deque
import java.util.LinkedList

class Solution {
    fun smallestSubsequence(s: String): String {
        val n = s.length
        val stk: Deque<Char> = LinkedList()
        val freq = IntArray(26)
        val exist = BooleanArray(26)
        exist.fill(false)
        for (ch in s.toCharArray()) {
            freq[ch.code - 'a'.code]++
        }
        for (i in 0 until n) {
            val ch = s[i]
            freq[ch.code - 'a'.code]--
            if (exist[ch.code - 'a'.code]) {
                continue
            }
            while (stk.isNotEmpty() && stk.peek() > ch && freq[stk.peek().code - 'a'.code] > 0) {
                val rem = stk.pop()
                exist[rem.code - 'a'.code] = false
            }
            stk.push(ch)
            exist[ch.code - 'a'.code] = true
        }
        val ans = CharArray(stk.size)
        var index = 0
        while (stk.isNotEmpty()) {
            ans[index] = stk.pop()
            index++
        }
        return StringBuilder(String(ans)).reverse().toString()
    }
}
