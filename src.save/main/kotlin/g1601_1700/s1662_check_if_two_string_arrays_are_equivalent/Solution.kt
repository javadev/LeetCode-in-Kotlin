package g1601_1700.s1662_check_if_two_string_arrays_are_equivalent

// #Easy #Array #String #2023_06_15_Time_144_ms_(86.84%)_Space_34.9_MB_(92.11%)

class Solution {
    fun arrayStringsAreEqual(word1: Array<String>, word2: Array<String>): Boolean {
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
