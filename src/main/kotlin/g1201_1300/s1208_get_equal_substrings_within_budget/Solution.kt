package g1201_1300.s1208_get_equal_substrings_within_budget

// #Medium #String #Binary_Search #Prefix_Sum #Sliding_Window
// #2023_06_10_Time_163_ms_(100.00%)_Space_36.9_MB_(92.86%)

import kotlin.math.abs

class Solution {
    fun equalSubstring(s: String, t: String, maxCost: Int): Int {
        var start = 0
        var end = 0
        var currCost = 0
        var maxLength = Int.MIN_VALUE
        while (end < s.length) {
            currCost += abs(s[end].code - t[end].code)
            while (currCost > maxCost) {
                currCost -= abs(s[start].code - t[start].code)
                start++
            }
            if (end - start + 1 > maxLength) {
                maxLength = (end - start + 1).coerceAtLeast(maxLength)
            }
            end++
        }
        return maxLength
    }
}
