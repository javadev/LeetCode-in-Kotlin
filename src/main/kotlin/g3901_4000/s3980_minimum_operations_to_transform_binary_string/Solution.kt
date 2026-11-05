package g3901_4000.s3980_minimum_operations_to_transform_binary_string

// #Medium #String #Dynamic_Programming #Greedy #Staff #Biweekly_Contest_186
// #2026_11_03_Time_10_ms_(100.00%)_Space_47.23_MB_(95.24%)

class Solution {
    fun minOperations(s1: String, s2: String): Int {
        val n = s1.length
        var sumDiff = 0
        var pairs = 0
        var isCovered = false
        for (i in 0..<n) {
            val diff = s1.get(i).code - s2.get(i).code
            sumDiff += diff
            if (diff == 1 && !isCovered) {
                if (i + 1 < n) {
                    pairs++
                    isCovered = true
                } else {
                    if (i > 0) {
                        pairs++
                    } else {
                        return -1
                    }
                }
            } else {
                isCovered = false
            }
        }
        return 3 * pairs - sumDiff
    }
}
