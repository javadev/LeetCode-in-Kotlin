package s0003_longest_substring_without_repeating_characters

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        var longest = 0
        var f = 0
        val charArray = IntArray(128)
        for (i in 0 until s.length) {
            if (charArray[s[i].toInt()] == 0) {
                longest = if (longest < (i + 1 - f)) (i + 1 - f) else longest
                charArray[s[i].toInt()] += 1
            } else {
                while (s[f] != s[i]) {
                    charArray[s[f].toInt()] = 0
                    f++
                }
                f++
            }
        }
        return longest
    }
}
