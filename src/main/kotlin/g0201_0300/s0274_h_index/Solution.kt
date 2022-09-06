package g0201_0300.s0274_h_index

import java.util.Arrays

// #Medium #Array #Sorting #Counting_Sort #2022_07_06_Time_3_ms_(45.78%)_Space_41.7_MB_(75.73%)
class Solution {
    fun hIndex(citations: IntArray): Int {
        // Sort array then traverse from end keep track of counter denoting total elements seen so
        // far
        Arrays.sort(citations)
        var count = 0
        var hIndex = 0
        for (i in citations.indices.reversed()) {
            if (i == citations.size - 1 && count == citations[i]) {
                hIndex = citations[i]
                return hIndex
                //  Ex:- 7 10--> counter =8
            } else if (citations[i] <= count && count < citations[i + 1]) {
                hIndex = count
                return hIndex
                // Ex:- 7 9 --> counter 6 (incuding 7 there willbe 7 elements)
            } else if (citations[i] == count + 1) {
                hIndex = count + 1
                return hIndex
            } else {
                count++
            }
        }
        // case when no element is hindex so far
        if (count < citations[0]) {
            hIndex = count
        }
        return hIndex
    }
}
