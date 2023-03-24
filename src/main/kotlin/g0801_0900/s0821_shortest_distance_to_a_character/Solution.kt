package g0801_0900.s0821_shortest_distance_to_a_character

// #Easy #Array #String #Two_Pointers #2023_03_24_Time_168_ms_(88.00%)_Space_36.1_MB_(56.00%)

class Solution {
    fun shortestToChar(s: String, c: Char): IntArray {
        val result = IntArray(s.length)
        result.fill(Int.MAX_VALUE)
        for (i in s.indices) {
            if (s[i] == c) {
                result[i] = 0
            }
        }
        for (i in s.indices) {
            if (result[i] != 0) {
                var j = i - 1
                while (j >= 0 && result[j] != 0) {
                    j--
                }
                if (j >= 0) {
                    result[i] = i - j
                }
                j = i + 1
                while (j < s.length && result[j] != 0) {
                    j++
                }
                if (j < s.length) {
                    result[i] = result[i].coerceAtMost(j - i)
                }
            }
        }
        return result
    }
}
