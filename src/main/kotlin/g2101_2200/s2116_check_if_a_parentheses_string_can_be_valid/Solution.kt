package g2101_2200.s2116_check_if_a_parentheses_string_can_be_valid

// #Medium #String #Greedy #Stack #2023_06_25_Time_315_ms_(42.86%)_Space_38.9_MB_(100.00%)

class Solution {
    fun canBeValid(s: String, locked: String): Boolean {
        if (s.isEmpty()) {
            return true
        }
        if (s.length and 1 > 0) {
            return false
        }
        if (locked.isEmpty()) {
            return true
        }
        var numOfLockedClose = 0
        var numOfLockedOpen = 0
        for (i in s.indices) {
            val countOfChars = i + 1
            if (s[i] == ')' && locked[i] == '1') {
                numOfLockedClose++
                if (numOfLockedClose * 2 > countOfChars) {
                    return false
                }
            }
            val j = s.length - 1 - i
            if (s[j] == '(' && locked[j] == '1') {
                numOfLockedOpen++
                if (numOfLockedOpen * 2 > countOfChars) {
                    return false
                }
            }
        }
        return true
    }
}
