package g0501_0600.s0557_reverse_words_in_a_string_iii

// #Easy #String #Two_Pointers #Algorithm_I_Day_4_Two_Pointers
// #2023_01_20_Time_215_ms_(98.10%)_Space_36.1_MB_(94.29%)

class Solution {
    fun reverseWords(s: String): String {
        var l: Int
        var r = 0
        val len = s.length
        val ch = s.toCharArray()
        for (i in 0..len) {
            if (i == len || ch[i] == ' ') {
                l = r
                r = i
                reverse(ch, l, r - 1)
                r++
            }
        }
        return String(ch)
    }

    private fun reverse(s: CharArray, l: Int, r: Int) {
        var l = l
        var r = r
        var c: Char
        while (r > l) {
            c = s[l]
            s[l++] = s[r]
            s[r--] = c
        }
    }
}
