package g0401_0500.s0500_keyboard_row

// #Easy #Array #String #Hash_Table #2023_01_05_Time_170_ms_(85.19%)_Space_35.4_MB_(85.19%)

import java.util.Locale

class Solution {
    private fun check(str: String, word: String): Boolean {
        for (ch in word.toCharArray()) {
            if (str.indexOf(ch) < 0) {
                return false
            }
        }
        return true
    }

    fun findWords(words: Array<String>): Array<String?> {
        val arr: MutableList<String> = ArrayList()
        for (word in words) {
            val w = word.lowercase(Locale.getDefault())
            if (check("qwertyuiop", w) || check("asdfghjkl", w) || check("zxcvbnm", w)) {
                arr.add(word)
            }
        }
        var ans: Array<String?>
        ans = arr.toTypedArray()
        return ans
    }
}
