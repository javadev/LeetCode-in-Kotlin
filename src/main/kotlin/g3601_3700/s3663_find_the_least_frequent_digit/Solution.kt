package g3601_3700.s3663_find_the_least_frequent_digit

// #Easy #Biweekly_Contest_164 #2025_09_07_Time_1_ms_(96.30%)_Space_40.60_MB_(100.00%)

class Solution {
    fun getLeastFrequentDigit(n: Int): Int {
        val freq = IntArray(10)
        val numStr = n.toString()
        for (c in numStr.toCharArray()) {
            freq[c.code - '0'.code]++
        }
        var minFreq = Int.Companion.MAX_VALUE
        var result = -1
        for (d in 0..9) {
            if (freq[d] == 0) {
                continue
            }
            if (freq[d] < minFreq) {
                minFreq = freq[d]
                result = d
            } else if (freq[d] == minFreq && d < result) {
                result = d
            }
        }
        return result
    }
}
