package g3401_3500.s3442_maximum_difference_between_even_and_odd_frequency_i

// #Easy #String #Hash_Table #Counting #2025_02_05_Time_1_ms_(100.00%)_Space_36.02_MB_(91.30%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun maxDifference(s: String): Int {
        val freq = IntArray(26)
        var maxOdd = 0
        var minEven = 1000
        for (i in 0..<s.length) {
            freq[s[i].code - 'a'.code]++
        }
        for (j in freq) {
            if (j != 0 && j % 2 == 0) {
                minEven = min(minEven, j)
            } else {
                maxOdd = max(maxOdd, j)
            }
        }
        return maxOdd - minEven
    }
}
