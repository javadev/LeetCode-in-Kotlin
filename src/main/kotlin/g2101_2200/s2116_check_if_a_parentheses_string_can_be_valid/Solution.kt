package g2101_2200.s2116_check_if_a_parentheses_string_can_be_valid

// #Medium #String #Greedy #Stack
class Solution {
    fun canBeValid(s: String?, locked: String?): Boolean {
        if (s == null || s.isEmpty()) {
            return true
        }
        if (s.length and 1 > 0) {
            return false
        }
        if (locked == null || locked.isEmpty()) {
            return true
        }
        var numOfLockedClose = 0
        var numOfLockedOpen = 0
        for (i in 0 until s.length) {
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
