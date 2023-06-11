package g1501_1600.s1541_minimum_insertions_to_balance_a_parentheses_string

// #Medium #String #Greedy #Stack
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
