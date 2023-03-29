package g0801_0900.s0844_backspace_string_compare

// #Easy #String #Two_Pointers #Stack #Simulation #Algorithm_II_Day_4_Two_Pointers
// #Level_1_Day_14_Stack #2023_03_29_Time_126_ms_(98.31%)_Space_33.5_MB_(93.22%)

class Solution {
    fun backspaceCompare(s: String, t: String): Boolean {
        return cmprStr(s) == cmprStr(t)
    }

    private fun cmprStr(str: String): String {
        val res = StringBuilder()
        var count = 0
        for (i in str.length - 1 downTo 0) {
            val currChar = str[i]
            if (currChar == '#') {
                count++
            } else {
                if (count > 0) {
                    count--
                } else {
                    res.append(currChar)
                }
            }
        }
        return res.toString()
    }
}
