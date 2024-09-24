package g3201_3300.s3297_count_substrings_that_can_be_rearranged_to_contain_a_string_i

// #Medium #String #Hash_Table #Sliding_Window
// #2024_09_24_Time_215_ms_(93.33%)_Space_38.2_MB_(93.33%)

class Solution {
    fun validSubstringCount(word1: String, word2: String): Long {
        var res: Long = 0
        var keys = 0
        val len = word1.length
        val count = IntArray(26)
        val letters = BooleanArray(26)
        for (letter in word2.toCharArray()) {
            val index = letter.code - 'a'.code
            if (count[index]++ == 0) {
                letters[index] = true
                keys++
            }
        }
        var start = 0
        var end = 0
        while (end < len) {
            val index = word1.get(end).code - 'a'.code
            if (!letters[index]) {
                end++
                continue
            }
            if (--count[index] == 0) {
                --keys
            }
            while (keys == 0) {
                res += (len - end).toLong()
                val beginIndex = word1.get(start++).code - 'a'.code
                if (!letters[beginIndex]) {
                    continue
                }
                if (count[beginIndex]++ == 0) {
                    keys++
                }
            }
            end++
        }
        return res
    }
}
