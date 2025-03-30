package g3401_3500.s3499_maximize_active_section_with_trade_i

// #Medium #2025_03_30_Time_45_ms_(100.00%)_Space_49.16_MB_(100.00%)

import kotlin.math.max

class Solution {
    fun maxActiveSectionsAfterTrade(s: String): Int {
        var oneCount = 0
        var convertedOne = 0
        var curZeroCount = 0
        var lastZeroCount = 0
        for (i in 0..<s.length) {
            if (s.get(i) == '0') {
                curZeroCount++
            } else {
                if (curZeroCount != 0) {
                    lastZeroCount = curZeroCount
                }
                curZeroCount = 0
                oneCount++
            }
            convertedOne = max(convertedOne, curZeroCount + lastZeroCount)
        }
        // corner case
        if (convertedOne == curZeroCount || convertedOne == lastZeroCount) {
            return oneCount
        }
        return oneCount + convertedOne
    }
}
