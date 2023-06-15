package g1601_1700.s1678_goal_parser_interpretation

// #Easy #String #Programming_Skills_I_Day_8_String
// #2023_06_15_Time_136_ms_(88.24%)_Space_34.1_MB_(89.71%)

class Solution {
    fun interpret(command: String): String {
        val sb = StringBuilder()
        var i = 0
        while (i < command.length) {
            if (command[i] == '(' && command[i + 1] == ')') {
                sb.append("o")
                i++
            } else if ((command[i] != '(' || command[i + 1] == ')') &&
                command[i] != ')'
            ) {
                sb.append(command[i])
            }
            i++
        }
        return sb.toString()
    }
}
