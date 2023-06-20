package g1901_2000.s1961_check_if_string_is_a_prefix_of_array

// #Easy #Array #String
class Solution {
    fun isPrefixString(s: String, words: Array<String?>): Boolean {
        val sb = StringBuilder()
        for (word in words) {
            sb.append(word)
            if (sb.toString() == s) {
                return true
            }
        }
        return false
    }
}
