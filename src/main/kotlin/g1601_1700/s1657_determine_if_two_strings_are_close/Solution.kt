package g1601_1700.s1657_determine_if_two_strings_are_close

// #Medium #String #Hash_Table #Sorting
class Solution {
    fun closeStrings(word1: String, word2: String): Boolean {
        if (word1.length != word2.length) {
            return false
        }
        if (word1 == word2) {
            return true
        }
        val freq1 = IntArray(26)
        val freq2 = IntArray(26)
        for (c in word1.toCharArray()) {
            freq1[c.code - 'a'.code]++
        }
        for (c in word2.toCharArray()) {
            freq2[c.code - 'a'.code]++
        }
        for (i in 0..25) {
            if (freq1[i] == 0 && freq2[i] != 0 || freq1[i] != 0 && freq2[i] == 0) {
                return false
            }
        }
        freq1.sort()
        freq2.sort()
        return freq1.contentEquals(freq2)
    }
}
