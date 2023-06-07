package g1401_1500.s1446_consecutive_characters

// #Easy #String
class Solution {
    fun maxPower(s: String): Int {
        var max = 0
        var i = 0
        while (i < s.length) {
            val start = i
            while (i + 1 < s.length && s[i] == s[i + 1]) {
                i++
            }
            max = Math.max(max, i - start + 1)
            i++
        }
        return max
    }
}
