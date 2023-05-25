package g1101_1200.s1163_last_substring_in_lexicographical_order

// #Hard #String #Two_Pointers

class Solution {
    fun lastSubstring(str: String): String {
        val s = str.toCharArray()
        var i = 0
        var j = i + 1
        var l = 0
        val n = s.size
        while (j + l < n) {
            if (s[i + l] == s[j + l]) {
                l++
            } else {
                if (s[i + l] <= s[j + l]) {
                    i = if (s[j + l] > s[i]) {
                        j + l
                    } else {
                        val p = j - i
                        j + l / p * p
                    }
                }
                j = j + l + 1
                l = 0
            }
        }
        return str.substring(i)
    }
}
