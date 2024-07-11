package g3201_3300.s3208_alternating_groups_ii

// #Medium #Array #Sliding_Window #2024_07_09_Time_2_ms_(99.02%)_Space_63.3_MB_(22.96%)

import kotlin.math.max

class Solution {
    fun numberOfAlternatingGroups(colors: IntArray, k: Int): Int {
        var i = 0
        var len = 0
        var total = 0
        while (i < colors.size - 1) {
            var j = i + 1
            if (colors[j] != colors[i]) {
                len = 2
                j++
                while (j < colors.size && colors[j] != colors[j - 1]) {
                    j++
                    len++
                }
                if (j == colors.size) {
                    break
                }
                total += max(0, (len - k + 1))
            }
            i = j
            len = 0
        }
        if (colors[0] != colors[colors.size - 1]) {
            // if(len == colors.length) {
            //     return Math.max(0, colors.length);
            // }
            len = if (len == 0) 2 else len + 1
            var j = 1
            while (j < colors.size && colors[j] != colors[j - 1]) {
                j++
                len++
            }
            if (j >= k) {
                len -= (j - k + 1)
            }
        }
        total += max(0, (len - k + 1))
        return total
    }
}
