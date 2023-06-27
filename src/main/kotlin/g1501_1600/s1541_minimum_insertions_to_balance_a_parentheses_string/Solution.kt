package g1501_1600.s1541_minimum_insertions_to_balance_a_parentheses_string

// #Medium #String #Greedy #Stack #2023_06_12_Time_240_ms_(80.00%)_Space_37.6_MB_(60.00%)

class Solution {
    fun minInsertions(s: String): Int {
        var conClosed = 0
        var opened = 0
        var total = 0
        for (i in 0 until s.length) {
            if (s[i] == ')') {
                conClosed++
                if (conClosed == 2) {
                    conClosed = 0
                    if (opened > 0) {
                        opened--
                    } else {
                        total++
                    }
                }
            } else {
                if (conClosed == 1) {
                    total += if (opened > 0) {
                        opened--
                        1
                    } else {
                        2
                    }
                    conClosed = 0
                }
                opened += 1
            }
        }
        if (conClosed == 1) {
            total += if (opened > 0) {
                opened--
                1
            } else {
                2
            }
        }
        total += opened * 2
        return total
    }
}
