package g0701_0800.s0761_special_binary_string

// #Hard #String #Recursion #2023_03_08_Time_128_ms_(100.00%)_Space_34.4_MB_(100.00%)

import java.util.PriorityQueue

class Solution {
    fun makeLargestSpecial(s: String): String {
        if (s.isEmpty() || s.length == 2) {
            return s
        }
        val pq = PriorityQueue { a: String?, b: String? ->
            b!!.compareTo(
                a!!
            )
        }
        var acc = 1
        var prev = 0
        for (i in 1..s.length) {
            if (acc == 0) {
                if (!(prev == 0 && i == s.length)) {
                    pq.add(makeLargestSpecial(s.substring(prev, i)))
                }
                prev = i
            }
            if (i == s.length) {
                break
            }
            if (s[i] == '1') {
                acc++
            } else {
                acc--
            }
        }
        val ans = StringBuilder()
        while (pq.isNotEmpty()) {
            ans.append(pq.poll())
        }
        if (ans.isEmpty()) {
            ans.append('1')
            ans.append(makeLargestSpecial(s.substring(1, s.length - 1)))
            ans.append('0')
        }
        return ans.toString()
    }
}
