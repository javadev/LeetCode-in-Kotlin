package g1201_1300.s1249_minimum_remove_to_make_valid_parentheses

// #Medium #String #Stack #Data_Structure_II_Day_14_Stack_Queue
class Solution {
    fun minRemoveToMakeValid(s: String): String {
        var closingParantheis = 0
        for (ch in s.toCharArray()) {
            if (ch == ')') {
                closingParantheis++
            }
        }
        val result = StringBuilder()
        var openingParanthesis = 0
        for (ch in s.toCharArray()) {
            if (ch == ')' && openingParanthesis == 0) {
                closingParantheis--
            } else {
                if (ch == ')') {
                    openingParanthesis--
                }
                if (ch == '(' && closingParantheis == 0) {
                    continue
                }
                if (ch == '(') {
                    openingParanthesis++
                    closingParantheis--
                }
                result.append(ch)
            }
        }
        return result.toString()
    }
}
