package g0001_0100.s0058_length_of_last_word

// #Easy #String #Programming_Skills_II_Day_6 #Udemy_Arrays
// #2022_09_21_Time_243_ms_(63.33%)_Space_35.7_MB_(73.11%)

class Solution {
    fun lengthOfLastWord(str: String): Int {
        var len = 0
        for (i in str.length - 1 downTo 0) {
            val ch = str[i]
            if (ch == ' ' && len > 0) {
                break
            } else if (ch != ' ') {
                len++
            }
        }
        return len
    }
}
