package g3601_3700.s3639_minimum_time_to_activate_string

// #Medium #Array #Binary_Search #Weekly_Contest_461
// #2025_08_14_Time_7_ms_(100.00%)_Space_79.04_MB_(50.00%)

class Solution {
    fun minTime(s: String, order: IntArray, k: Int): Int {
        val n = s.length
        var total = n * (n + 1L) / 2
        if (total < k) {
            return -1
        }
        val prev = IntArray(n + 1)
        val next = IntArray(n + 1)
        for (i in 0..<n) {
            prev[i] = i - 1
            next[i] = i + 1
        }
        for (t in n - 1 downTo 0) {
            val i = order[t]
            val left = prev[i]
            val right = next[i]
            total -= (i - left).toLong() * (right - i)
            if (total < k) {
                return t
            }
            if (left >= 0) {
                next[left] = right
            }
            prev[right] = left
        }
        return 0
    }
}
