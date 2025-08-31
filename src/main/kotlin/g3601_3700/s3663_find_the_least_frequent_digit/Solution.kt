package g3601_3700.s3663_find_the_least_frequent_digit

// #Easy #Biweekly_Contest_164 #2025_08_31_Time_3_ms_(100.00%)_Space_41.13_MB_(100.00%)

import kotlin.math.min

class Solution {
    fun getLeastFrequentDigit(n: Int): Int {
        val s = n.toString()
        val k = s.length
        val freq: MutableMap<Int, Int> = HashMap<Int, Int>()
        for (i in 0..<k) {
            val digit = s[i].code - '0'.code
            freq.put(digit, freq.getOrDefault(digit, 0) + 1)
        }
        var minfreq = Int.Companion.MAX_VALUE
        for (it in freq.entries) {
            minfreq = min(minfreq, it.value)
        }
        var result = 10
        for (it in freq.entries) {
            if (it.value == minfreq) {
                result = min(result, it.key)
            }
        }
        return result
    }
}
