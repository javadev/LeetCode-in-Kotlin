package g1601_1700.s1662_check_if_two_string_arrays_are_equivalent

// #Easy #Array #String
class Solution {
    fun arrayStringsAreEqual(word1: Array<String?>, word2: Array<String?>): Boolean {
        val sb1 = StringBuilder()
        for (word in word1) {
            sb1.append(word)
        }
        val sb2 = StringBuilder()
        for (word in word2) {
            sb2.append(word)
        }
        return sb1.toString() == sb2.toString()
    }
}
