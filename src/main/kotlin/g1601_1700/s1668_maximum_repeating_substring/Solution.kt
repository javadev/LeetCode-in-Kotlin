package g1601_1700.s1668_maximum_repeating_substring

// #Easy #String #String_Matching
class Solution {
    fun maxRepeating(sequence: String, word: String?): Int {
        var k = 0
        val repeat = StringBuilder(word)
        while (sequence.contains(repeat)) {
            k++
            repeat.append(word)
        }
        return k
    }
}
