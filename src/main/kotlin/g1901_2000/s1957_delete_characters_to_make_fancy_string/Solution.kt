package g1901_2000.s1957_delete_characters_to_make_fancy_string

// #Easy #String
class Solution {
    fun makeFancyString(s: String): String {
        val ans = StringBuilder()
        var c = 1
        ans.append(s[0])
        for (i in 1 until s.length) {
            if (s[i] == s[i - 1]) {
                c++
            } else {
                c = 1
            }
            if (c < 3) {
                ans.append(s[i])
            }
        }
        return ans.toString()
    }
}
