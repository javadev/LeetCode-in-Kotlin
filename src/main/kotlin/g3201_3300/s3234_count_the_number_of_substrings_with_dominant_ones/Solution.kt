package g3201_3300.s3234_count_the_number_of_substrings_with_dominant_ones

// #Medium #String #Sliding_Window #Enumeration
// #2024_08_03_Time_356_ms_(100.00%)_Space_38_MB_(76.92%)

import kotlin.math.min

class Solution {
    fun numberOfSubstrings(s: String): Int {
        val zero: MutableList<Int> = ArrayList()
        zero.add(-1)
        var result = 0
        for (i in s.indices) {
            if (s[i] == '0') {
                zero.add(i)
            } else {
                result += i - zero[zero.size - 1]
            }
            for (j in 1 until zero.size) {
                val len = j * (j + 1)
                if (len > i + 1) {
                    break
                }
                val prev = zero[zero.size - j - 1]
                val from = min((i - len + 1), zero[zero.size - j])
                if (from > prev) {
                    result += from - prev
                }
            }
        }
        return result
    }
}
