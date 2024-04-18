package g3001_3100.s3084_count_substrings_starting_and_ending_with_given_character

// #Medium #String #Math #Counting #2024_04_18_Time_177_ms_(98.55%)_Space_38.1_MB_(37.68%)

class Solution {
    fun countSubstrings(s: String, c: Char): Long {
        var count: Long = 0
        for (element in s) {
            if (element == c) {
                count++
            }
        }
        return count * (count + 1) / 2
    }
}
