package g0001_0100.s0022_generate_parentheses

// #Medium #Top_100_Liked_Questions #Top_Interview_Questions #String #Dynamic_Programming
// #Backtracking #Algorithm_II_Day_11_Recursion_Backtracking #Udemy_Backtracking/Recursion
// #2022_03_29_Time_210_ms_(78.51%)_Space_37.3_MB_(76.72%)

class Solution {
    fun generateParenthesis(n: Int): List<String> {
        val sb = StringBuilder()
        val ans: MutableList<String> = ArrayList()
        return generate(sb, ans, n, n)
    }

    private fun generate(sb: StringBuilder, str: MutableList<String>, open: Int, close: Int): List<String> {
        if (open == 0 && close == 0) {
            str.add(sb.toString())
            return str
        }
        if (open > 0) {
            sb.append('(')
            generate(sb, str, open - 1, close)
            sb.deleteCharAt(sb.length - 1)
        }
        if (close > 0 && open < close) {
            sb.append(')')
            generate(sb, str, open, close - 1)
            sb.deleteCharAt(sb.length - 1)
        }
        return str
    }
}
