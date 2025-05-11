package g3501_3600.s3545_minimum_deletions_for_at_most_k_distinct_characters

// #Easy #2025_05_11_Time_3_ms_(100.00%)_Space_42.14_MB_(100.00%)

class Solution {
    fun minDeletion(s: String, k: Int): Int {
        val n = s.length
        var count = 0
        val carr = IntArray(26)
        for (i in 0..<n) {
            val ch = s[i]
            carr[ch.code - 'a'.code]++
        }
        var dischar = 0
        for (i in 0..25) {
            if (carr[i] > 0) {
                dischar++
            }
        }
        while (dischar > k) {
            var minF = Int.Companion.MAX_VALUE
            var idx = -1
            for (i in 0..25) {
                if ((carr[i] > 0) && minF > carr[i]) {
                    minF = carr[i]
                    idx = i
                }
            }
            count += minF
            carr[idx] = 0
            dischar--
        }
        return count
    }
}
