package g0001_0100.s0058_length_of_last_word

// #Easy #String #Programming_Skills_II_Day_6 #Udemy_Arrays
// #2023_07_10_Time_135_ms_(93.67%)_Space_34.3_MB_(94.69%)

class Solution {
    fun lengthOfLastWord(s: String): Int {
        var len = 0
        for (i in s.length - 1 downTo 0) {
            val ch = s[i]
            if (ch == ' ' && len > 0) {
                break
            } else if (ch != ' ') {
                len++
            }
        }
        return len
    }
}
