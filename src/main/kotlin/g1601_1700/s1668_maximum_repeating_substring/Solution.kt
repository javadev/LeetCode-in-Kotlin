package g1601_1700.s1668_maximum_repeating_substring

// #Easy #String #String_Matching #2023_06_15_Time_170_ms_(100.00%)_Space_35.8_MB_(50.00%)

class Solution {
    fun maxRepeating(sequence: String, word: String): Int {
        var k = 0
        val repeat = StringBuilder(word)
        while (sequence.contains(repeat)) {
            k++
            repeat.append(word)
        }
        return k
    }
}
