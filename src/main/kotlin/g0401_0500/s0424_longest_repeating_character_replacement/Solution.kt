package g0401_0500.s0424_longest_repeating_character_replacement

class Solution {
    fun characterReplacement(s: String, k: Int): Int {
        var left = 0
        var right = 0
        val len = s.length
        val count = IntArray(256)
        val sArr = s.toCharArray()
        var currMax = 0
        var maxLen = 0
        var curr: Char
        while (right < len) {
            curr = sArr[right]
            count[curr.code]++
            currMax = Math.max(currMax, count[curr.code])
            if (right - left + 1 <= currMax + k) {
                maxLen = Math.max(maxLen, right - left + 1)
            }
            while (right - left + 1 > currMax + k) {
                curr = sArr[left]
                count[curr.code]--
                left++
            }
            right++
        }
        return maxLen
    }
}
