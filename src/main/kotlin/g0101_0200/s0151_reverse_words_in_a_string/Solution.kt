package g0101_0200.s0151_reverse_words_in_a_string

// #Medium #String #Two_Pointers #LeetCode_75_Array/String #Udemy_Strings
// #Top_Interview_150_Array/String #2022_10_11_Time_206_ms_(98.90%)_Space_36.1_MB_(96.70%)

class Solution {
    fun reverseWords(s: String): String {
        val sb = StringBuilder()
        var i = s.length - 1
        while (i >= 0) {
            if (s[i] == ' ') {
                i--
                continue
            }
            val start = s.lastIndexOf(' ', i)
            sb.append(' ')
            sb.append(s, start + 1, i + 1)
            i = start - 1
        }
        if (sb.length > 0) {
            sb.deleteCharAt(0)
        }
        return sb.toString()
    }
}
