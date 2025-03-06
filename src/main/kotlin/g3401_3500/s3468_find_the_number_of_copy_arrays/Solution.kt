package g3401_3500.s3468_find_the_number_of_copy_arrays

// #Medium #Array #Math #2025_03_06_Time_3_ms_(100.00%)_Space_111.85_MB_(22.73%)

import kotlin.math.max
import kotlin.math.min

class Solution {
    fun countArrays(original: IntArray, bounds: Array<IntArray>): Int {
        var low = bounds[0][0]
        var high = bounds[0][1]
        var ans = high - low + 1
        for (i in 1..<original.size) {
            val diff = original[i] - original[i - 1]
            low = max((low + diff), bounds[i][0])
            high = min((high + diff), bounds[i][1])
            ans = min(ans, (high - low + 1)).toInt()
        }
        return max(ans, 0)
    }
}
