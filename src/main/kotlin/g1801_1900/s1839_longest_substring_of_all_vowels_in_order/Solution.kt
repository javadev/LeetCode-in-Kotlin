package g1801_1900.s1839_longest_substring_of_all_vowels_in_order

// #Medium #String #Sliding_Window #2023_06_22_Time_290_ms_(80.00%)_Space_48.7_MB_(80.00%)

class Solution {
    fun longestBeautifulSubstring(word: String): Int {
        var cnt = 1
        var len = 1
        var maxLen = 0
        for (i in 1 until word.length) {
            if (word[i - 1] == word[i]) {
                ++len
            } else if (word[i - 1] < word[i]) {
                ++len
                ++cnt
            } else {
                cnt = 1
                len = 1
            }
            if (cnt == 5) {
                maxLen = maxLen.coerceAtLeast(len)
            }
        }
        return maxLen
    }
}
