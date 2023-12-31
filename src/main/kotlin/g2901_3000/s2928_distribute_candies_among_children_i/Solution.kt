package g2901_3000.s2928_distribute_candies_among_children_i

// #Easy #Math #Enumeration #Combinatorics #2023_12_31_Time_282_ms_(6.38%)_Space_33.7_MB_(85.11%)

import kotlin.math.min

class Solution {
    fun distributeCandies(n: Int, limit: Int): Int {
        var count = 0
        for (i in 0 until min(limit, n) + 1) {
            for (j in 0 until min(limit, n) + 1) {
                val k = n - i - j
                if (k >= 0 && k <= limit) {
                    count++
                }
            }
        }
        return count
    }
}
