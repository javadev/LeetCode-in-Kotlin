package g1801_1900.s1897_redistribute_characters_to_make_all_strings_equal

// #Easy #String #Hash_Table #Counting #2023_06_22_Time_179_ms_(100.00%)_Space_36.6_MB_(100.00%)

class Solution {
    fun makeEqual(words: Array<String>): Boolean {
        val charFreq = IntArray(26)
        for (word in words) {
            for (chIndex in 0 until word.length) {
                charFreq[word[chIndex].code - 'a'.code]++
            }
        }
        for (freq in charFreq) {
            if (freq % words.size != 0) {
                return false
            }
        }
        return true
    }
}
