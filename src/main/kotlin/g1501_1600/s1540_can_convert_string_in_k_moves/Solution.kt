package g1501_1600.s1540_can_convert_string_in_k_moves

// #Medium #String #Hash_Table #2023_06_12_Time_272_ms_(75.00%)_Space_38.2_MB_(100.00%)

class Solution {
    fun canConvertString(s: String, t: String, k: Int): Boolean {
        val len1 = s.length
        val len2 = t.length
        if (len1 != len2) {
            return false
        }
        if (s == t) {
            return true
        }
        val freq = IntArray(26)
        val multiple = k / 26
        for (i in 0..25) {
            freq[i] = multiple
        }
        val rem = k % 26
        for (i in 1..rem) {
            freq[i]++
        }
        var movesRemaining = k
        for (i in 0 until len1) {
            val ch1 = s[i]
            val ch2 = t[i]
            if (ch1 == ch2) {
                movesRemaining--
                continue
            }
            val diff = (ch2.code - ch1.code + 26) % 26
            if (freq[diff] > 0) {
                freq[diff]--
                movesRemaining--
            } else {
                return false
            }
        }
        return movesRemaining >= 0
    }
}
