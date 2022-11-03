package g0201_0300.s0274_h_index

// #Medium #Array #Sorting #Counting_Sort #2022_11_03_Time_183_ms_(90.91%)_Space_35.2_MB_(72.73%)

import java.util.Arrays

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
                // Ex:- 7 9 --> counter 6 (including 7 there will be 7 elements)
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
