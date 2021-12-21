package g0001_0100.s0003_longest_substring_without_repeating_characters

class Solution {
    fun lengthOfLongestSubstring(s: String): Int {
        val lastIndices = IntArray(256)
        for (i in 0..255) {
            lastIndices[i] = -1
        }
        var maxLen = 0
        var curLen = 0
        var start = 0
        for (i in 0 until s.length) {
            val cur = s[i]
            if (lastIndices[cur.code] < start) {
                lastIndices[cur.code] = i
                curLen++
            } else {
                val lastIndex = lastIndices[cur.code]
                start = lastIndex + 1
                curLen = i - start + 1
                lastIndices[cur.code] = i
            }
            if (curLen > maxLen) {
                maxLen = curLen
            }
        }
        return maxLen
    }
}
