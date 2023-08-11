package g2501_2600.s2565_subsequence_with_the_minimum_score

// #Hard #String #Binary_Search #Two_Pointers
// #2023_07_08_Time_204_ms_(100.00%)_Space_38.1_MB_(100.00%)

class Solution {
    fun minimumScore(s: String, t: String): Int {
        val m = s.length
        val n = t.length
        val left = IntArray(m)
        run {
            var i = 0
            var j = 0
            while (i < m) {
                if (j < n && s[i] == t[j]) {
                    ++j
                }
                left[i] = j
                i++
            }
        }
        val right = IntArray(m)
        run {
            var i = m - 1
            var j = n - 1
            while (i >= 0) {
                if (j >= 0 && s[i] == t[j]) {
                    --j
                }
                right[i] = j
                i--
            }
        }
        var min = (n - left[m - 1]).coerceAtMost(right[0] + 1)
        var i = 0
        while (i + 1 < m) {
            min = min.coerceAtMost(0.coerceAtLeast(right[i + 1] - left[i] + 1))
            i++
        }
        return min
    }
}
